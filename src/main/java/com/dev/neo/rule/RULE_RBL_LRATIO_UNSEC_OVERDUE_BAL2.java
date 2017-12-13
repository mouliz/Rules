package com.dev.neo.rule;

import java.text.DecimalFormat;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.dev.neo.master.RULEMASTER;
import com.dev.neo.model.Account;
import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReportOutput;

@Rule(name = "RBL_LRATIO_UNSEC_OVERDUE_BAL2",
description = "RBL_LRATIO_UNSEC_OVERDUE_BAL2")
public class RULE_RBL_LRATIO_UNSEC_OVERDUE_BAL2 {

	
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
    //When rule conditions are satisfied,
    //prints 'Hello duke's friend!' to the console
   
	//FLAGS NEED TO BE CALCULATED
	Double totalBalance=0.0;
	Double PP010UNS=0.0;
	Double PP010SC=0.0;
	boolean LiveunsecureAccount=false;
	boolean LivesecureAccount=false;
	  
	try {	
		for (int i = 0; i < ccdata.getCreditReport().getAccount().size(); i++) {
	                	Account account=ccdata.getCreditReport().getAccount().get(i);
						totalBalance+=Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getCurrentBalance().toString()); //5675745
						
						boolean isUnSecureAccount=RULEMASTER.isUnSecured(account.getAccount_NonSummary_Segment_Fields().getAccountType());
				        boolean isSecureAccount=RULEMASTER.isSecured(account.getAccount_NonSummary_Segment_Fields().getAccountType());
						boolean isLiveAccount=account.getAccount_NonSummary_Segment_Fields().getDateClosed() ==null?true:false;
						if(isUnSecureAccount && isLiveAccount)
				         {
							//IF its already set flag to true then do not change
							if(!LiveunsecureAccount )
							 LiveunsecureAccount=true;
							 
							PP010UNS=PP010UNS+Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getAmountOverdue());
						 }
						else if(isSecureAccount && isLiveAccount)
						{
							//IF its already set flag to true then do not change
							if(!LivesecureAccount)
								  LivesecureAccount=true;
							
							PP010UNS=PP010UNS+Integer.parseInt(account.getAccount_NonSummary_Segment_Fields().getAmountOverdue());
						
						}
							
			}
			
		    	DecimalFormat df = new DecimalFormat("#.########");

				// SET UNSECURE OVERDUE BALAENCE
				if(!LiveunsecureAccount || totalBalance==0)
				{
					crOutput.setRBL_LRATIO_UNSEC_OVERDUE_BAL2("-9999");
					
				}
				else if(PP010UNS==0)
				{
					crOutput.setRBL_LRATIO_UNSEC_OVERDUE_BAL2("0");
	
				}
				else
				{
					crOutput.setRBL_LRATIO_UNSEC_OVERDUE_BAL2(df.format((PP010UNS/totalBalance)));
				}
				
				
				df = new DecimalFormat("#.##");
				// SET SECURE OVERDUE BALAENCE
			    if(!LivesecureAccount || totalBalance==0)
			    {
					crOutput.setRBL_LRATIO_SEC_OVERDUE_BAL2("-9999");
			    }
			    else if(PP010SC==0)
			    {
					crOutput.setRBL_LRATIO_SEC_OVERDUE_BAL2("0");
			    }
			    else 
			    {
					crOutput.setRBL_LRATIO_SEC_OVERDUE_BAL2(df.format(PP010SC/totalBalance));
			    }
			    
			    
			
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
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
