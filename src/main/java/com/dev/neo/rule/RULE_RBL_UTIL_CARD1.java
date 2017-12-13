package com.dev.neo.rule;

import java.text.DecimalFormat;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.dev.neo.model.Account;
import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReportOutput;


@Rule(name = " RULE_RBL_UTIL_CARD1",description = "RULE_RBL_UTIL_CARD1")
public class RULE_RBL_UTIL_CARD1 {
	
	
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
		
		double PP012CRD=0;
		double totalDisburseAmountCC=0;
		boolean isLiveCreditCardaccount=false;
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) 
		{ 
			Account account = (Account)ccdata.getCreditReport().getAccount().get(i);
               Object dateclosed=account.getAccount_NonSummary_Segment_Fields().getDateClosed();
			if(account.getAccount_NonSummary_Segment_Fields().getAccountType().equalsIgnoreCase("10")
					 && (dateclosed==null || dateclosed=="" ) 
					)
			{		
				 if(!isLiveCreditCardaccount)
					isLiveCreditCardaccount=true;
				 PP012CRD=PP012CRD+Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getCurrentBalance());
				 
				 
					int creditLimit=Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getCreditLimit());
					int highCreditSanctAmt=Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getHighCreditOrSanctionedAmount());
					
					totalDisburseAmountCC=totalDisburseAmountCC +((creditLimit>highCreditSanctAmt)?creditLimit:highCreditSanctAmt);
					 
			}
		}
		
		System.out.println("UTIL CARD 01 = ");
		
		System.out.println("totalDisburseAmountCC = "+totalDisburseAmountCC);
		System.out.println("PP012CRD = "+PP012CRD);
		DecimalFormat df = new DecimalFormat("#.########");	
		
		String RBL_util_card1="0";
		
		Double utilCard1=0.0;
		if(!isLiveCreditCardaccount)
			RBL_util_card1="-10";
		else if(totalDisburseAmountCC>0 && PP012CRD!=0)
		{
			//utilCard1=  (df.format(PP012CRD/totalDisburseAmountCC));
			String val=df.format(PP012CRD/totalDisburseAmountCC);
			System.out.println("val="+val);
			RBL_util_card1=df.format(PP012CRD/totalDisburseAmountCC);
			 
		}
		else if(totalDisburseAmountCC<=0 && PP012CRD!=0)
			  RBL_util_card1="-3";
		crOutput.setRBL_util_card1(new Double(RBL_util_card1)); 
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
