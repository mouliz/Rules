package com.dev.neo.rule;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.dev.neo.master.BaseMaster;
import com.dev.neo.master.RULEMASTER;
import com.dev.neo.master.RULEUtil;
import com.dev.neo.model.Account;
import com.dev.neo.model.Account_NonSummary_Segment_Fields;
import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReport;
import com.dev.neo.model.CreditReportOutput;
import com.dev.neo.model.Header;

@Rule(name = "RULE_RBL_CC_MAX_MOB",description = "RULE_RBL_CC_MAX_MOB")
public class RULE_RBL_CC_MAX_MOB {
	
	private CCData ccdata; 
	private CreditReportOutput crOutput;
	
	
	
	@Condition
	public boolean checkInput() {
	    //The rule should be applied only if
	    //the user's response is yes (duke friend)
	    return true;
	}
	  CreditReport creditReport= new CreditReport();
	@Action
	public void rBLCCMAXMOB() throws Exception {
	    //When rule conditions are satisfied,
	    //prints 'Hello duke's friend!' to the console
        int totaltradeAgeCre=0;
        int alltotaltradeAge=0;
      
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
        	Account account=ccdata.getCreditReport().getAccount().get(i);
        	System.out.println(account.getAccount_NonSummary_Segment_Fields().getAccountType());
       if(account.getAccount_NonSummary_Segment_Fields().getAccountType().equalsIgnoreCase("10")){
    	   
    	      SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
			  String openedStr= account.getAccount_NonSummary_Segment_Fields().getDateOpenedOrDisbursed();
			  java.util.Date  openDate=formatter.parse(openedStr);
	          int tradeAgeForCre=  RULEUtil.getDateDiff(openDate, ccdata.getDateProcessed(),RULEUtil.MONTH);
	          if(totaltradeAgeCre<tradeAgeForCre)
	        	  totaltradeAgeCre=tradeAgeForCre;
	         // totaltradeAgeCre+=tradeAgeForCre;
       }
       
             SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
  			  Date date = new Date();
  			  String openedStr= account.getAccount_NonSummary_Segment_Fields().getDateOpenedOrDisbursed();
  			  java.util.Date  openDate=formatter.parse(openedStr);
  	          int alltradeAge=  RULEUtil.getDateDiff(openDate, ccdata.getDateProcessed(),RULEUtil.MONTH);
  	        	alltotaltradeAge+=alltradeAge;
      
	}
		
		crOutput.setRBL_CC_MAX_MOB(totaltradeAgeCre);
//
//		if(alltotaltradeAge>totaltradeAgeCre){
//			 crOutput.setRBL_CC_MAX_MOB(alltotaltradeAge);
//		}else crOutput.setRBL_CC_MAX_MOB(0);
    }

	
	@Action
	public void rBLHasOnlyCC () throws Exception {
		
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
			Account account=ccdata.getCreditReport().getAccount().get(i);
			String accType=account.getAccount_NonSummary_Segment_Fields().getAccountType();
			Object ac = account.getAccount_NonSummary_Segment_Fields().getDateClosed();
			if(accType.equals("10") ){
				if(ac == null)crOutput.setRBL_HasOnly_CC("true");
			} 
			else{
				if(ac == null )	 crOutput.setRBL_HasOnly_CC("false");
				
			}

	}
    }
	
	@Action
	public void rBLHasOnlyPL() throws Exception {
		
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
			Account account=ccdata.getCreditReport().getAccount().get(i);
			String accType=account.getAccount_NonSummary_Segment_Fields().getAccountType();
			Object ac = account.getAccount_NonSummary_Segment_Fields().getDateClosed();
			if(accType.equals("07") && ac == null ){
				crOutput.setRBL_HasOnly_PL("true");
			} 
			else{
				if(ac == null ){
					crOutput.setRBL_HasOnly_PL("false");
				}
			}

	}
    }
	
	@Action
	public void sumPLCCAmount() throws Exception {
		int sumPlCCamount=0;
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
			Account account=ccdata.getCreditReport().getAccount().get(i);
			String accType=account.getAccount_NonSummary_Segment_Fields().getAccountType();
			Object ac = account.getAccount_NonSummary_Segment_Fields().getDateClosed();    
			String sumplaamount=account.getAccount_NonSummary_Segment_Fields().getHighCreditOrSanctionedAmount();
			if(accType.equals("07") && ac == null ){
				sumPlCCamount+=Integer.parseInt(sumplaamount);
				crOutput.setRBL_TotalSanctionedAmt(sumPlCCamount);
			} 
			else 	crOutput.setRBL_TotalSanctionedAmt(0);
	}
    }
	
	@Action
	public void rBLReleventTradesStatus() throws Exception {
		//int sumPlCCamount=0;
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
			Account account=ccdata.getCreditReport().getAccount().get(i);
			String accType=account.getAccount_NonSummary_Segment_Fields().getAccountType();
			String dateclosestring = account.getAccount_NonSummary_Segment_Fields().getDateClosed();  
			if(accType.equals("07") && accType.equals("01") && accType.equals("02")&& accType.equals("03") &&  accType.equals("05") && dateclosestring.length() !=0 ){
				crOutput.setRBL_ReleventTrades_Status("true");
			} 
		else 	crOutput.setRBL_ReleventTrades_Status("false");
	}
    }
	
	@Action
	public void rBLPCTDEL9() throws Exception {
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
			   System.out.println("monthsDuration" +monthsDuration);
				List paymentHist=RULEUtil.getSplitStringCustom(account.getAccount_NonSummary_Segment_Fields().getPaymentHistory1(),monthsDuration, 27);
   
		          boolean RBL_PCT_DEL_9=false;
			for (int j = 0; j < paymentHist.size(); j++) {
				String hist=(String) paymentHist.get(j);
				 
				boolean val=!hist.equalsIgnoreCase("STD")||!hist.equalsIgnoreCase("000") ||!hist.equalsIgnoreCase("XXX");
				System.out.println("condtn"+ val);
				
				if(val)
				{
					RBL_PCT_DEL_9=true;
				}}

	   if(RBL_PCT_DEL_9){
						  TradeLineDPD9MthsCount=TradeLineDPD9MthsCount+1;
						  break;
					  }
					  else 
						  TradeLineDPD9MthsCount=TradeLineDPD9MthsCount+0;
	
	 }
		
		DecimalFormat df = new DecimalFormat("#.########");
		
		
		 if(TradeLineDPD9MthsCount==0){
			  System.out.println("setRBL_PCT_DEL_9 =----------------");
			 crOutput.setRBL_PCT_DEL_9(0+"");
		 }   
		 else if(TradeLineDPD9MthsCount>0){
		     System.out.println("setRBL_PCT_DEL_9 ="+df.format(TradeLineDPD9MthsCount/CountOfTrades));
			 crOutput.setRBL_PCT_DEL_9(df.format(TradeLineDPD9MthsCount/CountOfTrades));
			 
		 }
    }
	
	
	
	@Action
	public void  RBL_RATIO_UNSEC_OVERDUE_BAL2(){
		
		double totalBalance=0;
		double PP010UNS=0;
		boolean isunsecureAccountPresent=false;
		String accountType = "";
			
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
			Account account=ccdata.getCreditReport().getAccount().get(i);
		    accountType = account.getAccount_NonSummary_Segment_Fields().getAccountType();
			if(RULEMASTER.unsecureLines.contains(accountType) && !isunsecureAccountPresent)
				isunsecureAccountPresent=true;
			
			
		}
		if(!isunsecureAccountPresent)
			crOutput.setRBL_RATIO_UNSEC_OVERDUE_BAL2("-9999");
		else
			
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
			Account account=ccdata.getCreditReport().getAccount().get(i);
			accountType = account.getAccount_NonSummary_Segment_Fields().getAccountType();
			int currentBalance = Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getCurrentBalance());
			totalBalance = totalBalance+currentBalance; 

			
			
			//Check is no unsecure account
			
			if(RULEMASTER.unsecureLines.contains(accountType))
			{
				PP010UNS += Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getAmountOverdue());
				
			}else{
				crOutput.setRBL_RATIO_UNSEC_OVERDUE_BAL2("-9999");
			}
		}
		
		DecimalFormat df=new DecimalFormat("#.########");
		if(PP010UNS == 0)
		{
			crOutput.setRBL_RATIO_UNSEC_OVERDUE_BAL2(0+"");
		}
		if(PP010UNS != 0 && totalBalance != 0){
		
			System.out.println("value unsec over"+(PP010UNS/totalBalance));
			crOutput.setRBL_RATIO_UNSEC_OVERDUE_BAL2(df.format(PP010UNS/totalBalance));
		}
		if(PP010UNS != 0 && totalBalance == 0){
			crOutput.setRBL_RATIO_UNSEC_OVERDUE_BAL2("-9999");
		}
		
	}	
	
	/**
	 * RBL_RATIO_UNSEC_OVERDUE_BAL2 
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
