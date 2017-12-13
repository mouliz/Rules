package com.dev.neo.rule;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.dev.neo.master.BaseMaster;
import com.dev.neo.master.RULEUtil;
import com.dev.neo.model.Account;
import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReportOutput;
import com.dev.neo.model.Header;


@Rule(name = " RBL_MAX_DEL3_NDEL4_6",description = "RBL_MAX_DEL3_NDEL4_6")
public class RBL_MAX_DEL3_NDEL4_6 {
	
	
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
		double TradeLineDPD9MthsCount=0;
		double CountOfTrades=0;
		CountOfTrades =ccdata.getCreditReport().getAccount().size();
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
				Account account=ccdata.getCreditReport().getAccount().get(i);
				SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
			   String paymentEnd=account.getAccount_NonSummary_Segment_Fields().getPaymentHistoryStartDate();
			   java.util.Date  paymentEndStartDate=formatter.parse(paymentEnd);
			   int monthsDuration=  RULEUtil.getDateDiff(paymentEndStartDate, ccdata.getDateProcessed(),RULEUtil.MONTH); 
				List paymentHist=RULEUtil.getSplitStringCustom(account.getAccount_NonSummary_Segment_Fields().getPaymentHistory1(),monthsDuration, 27);
     List<String> gr1 = new ArrayList<String>();//group1
     List<String> gr2 = new ArrayList<String>();//group2
   gr1=paymentHist.subList(0, 4);
   gr2=paymentHist.subList(4, 7);
             boolean notequal4_6=false;
             boolean equal4_6=false;
			for (int j = 0; j < gr1.size(); j++) {
				String gr11=(String) paymentHist.get(j);
				boolean val=!gr11.equalsIgnoreCase("STD")||!gr11.equalsIgnoreCase("000") ||!gr11.equalsIgnoreCase("XXX");
				
				if(val)
				{
					notequal4_6=true;
				}}
			for (int j = 0; j < gr2.size(); j++) {
				String gr22=(String) paymentHist.get(j);
				 System.out.println("hist-----" +gr2);
				boolean val=gr22.equalsIgnoreCase("STD")||gr22.equalsIgnoreCase("000") ||gr22.equalsIgnoreCase("XXX");
				System.out.println("condtn"+ val);
				
				if(val)
				{
					equal4_6=true;
				}}

	   if(equal4_6 && notequal4_6){
						 crOutput.setRBL_MAX_DEL3_NDEL4_6(1);
						  break;
					  }
					  else 
						  crOutput.setRBL_MAX_DEL3_NDEL4_6(0);
	
	 }
		
		
		 
		
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
