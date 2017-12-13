package com.dev.neo;

import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.easyrules.api.RulesEngine;

import com.dev.neo.model.CCData;
import com.dev.neo.model.CreditReport;
import com.dev.neo.model.CreditReportOutput;
import com.dev.neo.rule.RBL_MAX_DEL3_NDEL4_6;
import com.dev.neo.rule.RULE_AGEGRP;
import com.dev.neo.rule.RULE_RBL_CC_MAX_MOB;
import com.dev.neo.rule.RULE_RBL_LRATIO_UNSEC_OVERDUE_BAL2;
import com.dev.neo.rule.RULE_RBL_TW_CNT_LIVE;
import com.dev.neo.rule.RULE_RBL_UTIL_CARD1;

public class XmlToObjext {

	public static void main(String[] args) throws JAXBException, FileNotFoundException, Exception {
		
	    String pattern = "MM/dd/yyyy hh:mm:ss:SSS";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
		
		System.out.println("Start "+format.format(new java.util.Date()));
		File file = new File("Test.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(CreditReport.class); 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  

		CreditReport creditReport = (CreditReport)jaxbUnmarshaller.unmarshal(file);
		
		    CCData ccData=new CCData();
	        ccData.setRunDate(new Date(0));
	        ccData.setCreditReport(creditReport);
	        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
	    	String dateProcessd=creditReport.getHeader().getDateProcessed();
            java.util.Date  userdateprocessed=formatter.parse(dateProcessd);
	        ccData.setDateProcessed(userdateprocessed);
	        CreditReportOutput crReportOP=new CreditReportOutput();
	        String userdobstring= creditReport.getNameSegment().getDateOfBirth();
	        java.util.Date  userdob=formatter.parse(userdobstring);
	        ccData.setUserDob(userdob);
	        ccData.setCreditReport(creditReport);
	        
	        /**
	         * Declare the ruleno
	         * 
	         */
	      //  HelloWorldRule helloWorldRule = new HelloWorldRule();
	         RULE_AGEGRP rulAgegrp=new RULE_AGEGRP();
	         RULE_RBL_LRATIO_UNSEC_OVERDUE_BAL2 rrluob2= new RULE_RBL_LRATIO_UNSEC_OVERDUE_BAL2();
	         RULE_RBL_TW_CNT_LIVE ruleObj3= new RULE_RBL_TW_CNT_LIVE(); 
	         RBL_MAX_DEL3_NDEL4_6 rmdn46= new RBL_MAX_DEL3_NDEL4_6();
	         RULE_RBL_CC_MAX_MOB rrcmm= new RULE_RBL_CC_MAX_MOB();
	         RULE_RBL_UTIL_CARD1 rruc= new RULE_RBL_UTIL_CARD1();
	        /**
	         * Set business data to operate on
	         */
	         rulAgegrp.setCcdata(ccData);
	         rulAgegrp.setCrOutput(crReportOP);
	         rrluob2.setCcdata(ccData);
	         rrluob2.setCrOutput(crReportOP);
	         ruleObj3.setCcdata(ccData);
	         ruleObj3.setCrOutput(crReportOP);
	         rmdn46.setCcdata(ccData);
	         rmdn46.setCrOutput(crReportOP);
	         rrcmm.setCcdata(ccData);
	         rrcmm.setCrOutput(crReportOP);
	         rruc.setCcdata(ccData);
	         rruc.setCrOutput(crReportOP);
	        /**
	         * Create a rules engine and register the business rule
	         */
	        RulesEngine rulesEngine =  aNewRulesEngine().build();
	        rulesEngine.registerRule(rulAgegrp);
	        rulesEngine.registerRule(rrluob2);
	        rulesEngine.registerRule(ruleObj3);
	        rulesEngine.registerRule(rmdn46);
	        rulesEngine.registerRule(rrcmm);
	        rulesEngine.registerRule(rruc);
	        /**
	         * Fire rules
	         */
	        rulesEngine.fireRules();
	        
	        
			System.out.println("END IIME "+format.format(new java.util.Date()));
			
	        System.out.println("getAge_grp ="+crReportOP.getAge_grp());
	        System.out.println("getAge_grp ="+crReportOP.getAgeInMonths());
	        System.out.println("getAge_grp ="+crReportOP.getRBL_Age());
	        System.out.println("getScore ="+creditReport.getScoreSegment().getScore());
	      
	       System.out.println("getRBL_LRATIO_SEC_OVERDUE_BAL2 ="+crReportOP.getRBL_LRATIO_SEC_OVERDUE_BAL2());
	       System.out.println("getRBL_LRATIO_UNSEC_OVERDUE_BAL2 ="+crReportOP.getRBL_LRATIO_UNSEC_OVERDUE_BAL2());
	       System.out.println("getRBL_TW_CNT_LIVE ="+crReportOP.getRBL_TW_CNT_LIVE());
	       System.out.println("getRBL_TOT_DISB_AMT ="+crReportOP.getRBL_TOT_DISB_AMT());
	       System.out.println("getRBL_util_card1 ="+crReportOP.getRBL_util_card1());
	       
	       System.out.println("getRBL_UTIL_PL1 ="+crReportOP.getRBL_UTIL_PL1());
	       System.out.println("getRBL_CC_DISB_AMT_LV1 ="+crReportOP.getRBL_CC_DISB_AMT_LV1());
	       
	       System.out.println("setRBL_RATIO_UNSEC_OVERDUE_BAL2="+crReportOP.getRBL_RATIO_UNSEC_OVERDUE_BAL2());
	       

	       jaxbContext = jaxbContext.newInstance(CreditReportOutput.class);
	       Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	       File outputFile = new File("output444.xml");
	       jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(crReportOP, outputFile);
	       
	       

}}
