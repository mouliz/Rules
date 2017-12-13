package com.dev.neo.rule;

import java.text.DecimalFormat;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.dev.neo.model.Account;
import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReportOutput;

@Rule(name = "RBL_TW_CNT_LIVE",
description = "Number of the two wheeler live accounts")
public class RULE_RBL_TW_CNT_LIVE {

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
	
	int countTwoWheeler=0;
	double maxCreditlimit=0;
	double plMaxCreditlimit=0;
double PP012PL=0;

	for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) {
		Account account = (Account)ccdata.getCreditReport().getAccount().get(i);
		
		if(account.getAccount_NonSummary_Segment_Fields().getAccountType().equalsIgnoreCase("13"))
		 countTwoWheeler=countTwoWheeler+1;
		
		double creditLimit=Double.parseDouble(account.getAccount_NonSummary_Segment_Fields().getCreditLimit());
		double highCreditSanctAmt=Double.parseDouble(account.getAccount_NonSummary_Segment_Fields().getHighCreditOrSanctionedAmount());
		
		maxCreditlimit=maxCreditlimit +((creditLimit>highCreditSanctAmt)?creditLimit:highCreditSanctAmt);
		
		boolean isLiveAccount=(account.getAccount_NonSummary_Segment_Fields().getDateClosed() ==null)?true:false;
		if(account.getAccount_NonSummary_Segment_Fields().getAccountType().equalsIgnoreCase("05") && isLiveAccount)
		{
			PP012PL=PP012PL+Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getCurrentBalance());
			plMaxCreditlimit=plMaxCreditlimit+((creditLimit>highCreditSanctAmt)?creditLimit:highCreditSanctAmt);
		}
		 
	}
	
	DecimalFormat df = new DecimalFormat("#.########");

	if(plMaxCreditlimit>0)
	{
      
		crOutput.setRBL_UTIL_PL1(new Double(df.format(PP012PL/plMaxCreditlimit)));
	}
	crOutput.setRBL_TW_CNT_LIVE(countTwoWheeler+"");
	crOutput.setRBL_TOT_DISB_AMT(maxCreditlimit+""); 
}
									
@Action
public void rBLCCDISBAMTLV1() throws Exception {
	
	int maxCreditlimit=0;
	
	for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) {
		Account account = (Account)ccdata.getCreditReport().getAccount().get(i);
		Object datecolsed = account.getAccount_NonSummary_Segment_Fields().getDateClosed(); 
		if(account.getAccount_NonSummary_Segment_Fields().getAccountType().equalsIgnoreCase("10") && (datecolsed==null||datecolsed=="" ))
		{   
			double creditLimit=Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getCreditLimit());
			double highCreditSanctAmt=Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getHighCreditOrSanctionedAmount());
			maxCreditlimit=(int) (maxCreditlimit +((creditLimit>highCreditSanctAmt)?creditLimit:highCreditSanctAmt));
			 
		}
		
		
		}
	
	    if(maxCreditlimit>0)
		   crOutput.setRBL_CC_DISB_AMT_LV1(Math.round(maxCreditlimit));
		 else
				crOutput.setRBL_CC_DISB_AMT_LV1(-9999);
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

	
}
