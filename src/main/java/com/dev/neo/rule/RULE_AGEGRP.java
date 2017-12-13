package com.dev.neo.rule;

import java.text.SimpleDateFormat;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.dev.neo.master.RULEUtil;
import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReportOutput;

@Rule(name = "Age_grp",
description = "Completed Years will be calculated on the basis of Diffrence between Processed date and DOB")
public class RULE_AGEGRP {
	 
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
	
	crOutput.setAge_grp(RULEUtil.getDateDiff(ccdata.getUserDob(), ccdata.getDateProcessed(),RULEUtil.YEARS));
	crOutput.setRBL_Age(RULEUtil.getDateDiff(ccdata.getUserDob(),ccdata.getDateProcessed(),RULEUtil.YEARS));
	crOutput.setAgeInMonths(RULEUtil.getDateDiff(ccdata.getUserDob(), ccdata.getDateProcessed(),RULEUtil.MONTH));

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
