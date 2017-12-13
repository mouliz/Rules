/*package com.dev.neo;

import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

import java.sql.Date;
import java.util.Calendar;

import org.easyrules.api.RulesEngine;

import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReportOutput;
import com.dev.neo.rule.RULE_AGEGRP;
public class PCRuleEngine {


	
	public static void main(String[] args) {
	 
        
        CCData ccData=new CCData();
        
        
        ccData.setRunDate(new Date(0));
        Calendar cal = Calendar.getInstance();
        cal.set(1990, 8, 11);     
        
       // ccData.setUserDob(cal.getTime());
        
        //System.out.println("getDiffYears ="+getDiffYears(ccData.getUserDob(),ccData.getRunDate()));
     
        CreditReportOutput crReportOP=new CreditReportOutput();
    
        
        *//**
         * Declare the ruleno
         * 
         *//*
      //  HelloWorldRule helloWorldRule = new HelloWorldRule();
         RULE_AGEGRP rulAgegrp=new RULE_AGEGRP();
     
        

        *//**
         * Set business data to operate on
         *//*
         rulAgegrp.setCcdata(ccData);
         rulAgegrp.setCrOutput(crReportOP);

        *//**
         * Create a rules engine and register the business rule
         *//*
        RulesEngine rulesEngine =  aNewRulesEngine().build();
        rulesEngine.registerRule(rulAgegrp);

        *//**
         * Fire rules
         *//*
        rulesEngine.fireRules();
        
        System.out.println("getAge_grp ="+crReportOP.getAge_grp());
}
	
//	
//	public static int getDiffYears(Date first, Date last) {
//	    Calendar a = getCalendar(first);
//	    Calendar b = getCalendar(last);
//	    
//	    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
//	    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
//	        (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
//	        diff--;
//	    }
//	    return diff;
//	}
//
//	public static Calendar getCalendar(Date date) {
//	    Calendar cal = Calendar.getInstance();
//	    cal.setTime(date);
//	    return cal;
//	}
//	
	
	 

}
*/