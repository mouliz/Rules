package com.dev.neo.rule;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.dev.neo.master.RULEMASTER;
import com.dev.neo.master.RULEUtil;
import com.dev.neo.model.Account;
import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReportOutput;

@Rule
public class RULE_RBL_PCT_UNSEC_DEL_6_1 {

	private CCData ccdata; 
	private CreditReportOutput crOutput;

	
	
@Condition
public boolean checkInput() {
    //The rule should be applied only if
    //the user's response is yes (duke friend)
    return true;
    
}
 

@Action
public void processData() throws Exception {
	
	crOutput.setRBL_PCT_UNSEC_DEL_6_1("-9999");
	int numOfAccount=ccdata.getCreditReport().getAccount().size();
	int TradeLineDPD6MthsUnsecuredCount=0;
	Date processedDate=ccdata.getDateProcessed();
	SimpleDateFormat sdfFormat=new SimpleDateFormat("ddMMyyyy");
	DecimalFormat df = new DecimalFormat("#.########");

	boolean isUnsecureAccountPresent=false;
	for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) {
		
		Account account=ccdata.getCreditReport().getAccount().get(i);
		isUnsecureAccountPresent=RULEMASTER.isUnSecured(account.getAccount_NonSummary_Segment_Fields().getAccountType());
		if(isUnsecureAccountPresent)
		 break;
	}
	
	if(!isUnsecureAccountPresent)
		crOutput.setRBL_PCT_UNSEC_DEL_6_1("-9999");
		
	else{
				
			for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) {
				
				Account account=ccdata.getCreditReport().getAccount().get(i);
				String accountDateStr=account.getAccount_NonSummary_Segment_Fields().getPaymentHistoryStartDate();
				Date accountDate =sdfFormat.parse(accountDateStr);
				
				//Payment accountDate ,Payment history date 
				if(
						
						(
						RULEUtil.getDateDiff(accountDate, processedDate, RULEUtil.MONTH)==0 &&
						RULEUtil.getDateDiff(accountDate, processedDate, RULEUtil.YEARS)==0
						)
						||(processedDate.compareTo(accountDate)==1)
				)
						 
				{
					
					List paymentHist=RULEUtil.getSplitString(account.getAccount_NonSummary_Segment_Fields().getPaymentHistory1(), 31);
					boolean isDPD=false;
					for (int j = 0; j < paymentHist.size(); j++) {
						String hist=(String) paymentHist.get(j);
						 
						if((hist.equalsIgnoreCase("STD")
						 ||hist.equalsIgnoreCase("000")
						 ||	hist.equalsIgnoreCase("XXX")) && !isDPD)
						{
							isDPD=true;
						}
						if(isDPD)
							break;
					}
					if(isDPD)
					 TradeLineDPD6MthsUnsecuredCount=TradeLineDPD6MthsUnsecuredCount+1;
					
				}
				
				
			}
	}
	
	crOutput.setRBL_PCT_UNSEC_DEL_6_1(df.format(TradeLineDPD6MthsUnsecuredCount/numOfAccount));
}


/**
 * @return the crOutput
 */
public CreditReportOutput getCrOutput() {
	return crOutput;
}


/**
 * @param crOutput the crOutput to set
 */
public void setCrOutput(CreditReportOutput crOutput) {
	this.crOutput = crOutput;
}


/**
 * @return the ccdata
 */
public CCData getCcdata() {
	return ccdata;
}


/**
 * @param ccdata the ccdata to set
 */
public void setCcdata(CCData ccdata) {
	this.ccdata = ccdata;
}




}
