/*package com.dev.neo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.dev.neo.model.CreditReportOutput;

public class ObjectToXml {
	
	public static void main(String agrs[]){
		
		  try {

			  CreditReportOutput creditReport=new CreditReportOutput();
			  
			  creditReport.setRBL_LRATIO_SEC_OVERDUE_BAL2("shdhdc");
				File file = new File("file11.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(CreditReportOutput.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

				// output pretty printed
				
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(creditReport, file);
				jaxbMarshaller.marshal(creditReport, System.out);
				
				//jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				//jaxbMarshaller.marshal(cc, new FileOutputStream(file));
				//jaxbMarshaller.marshal(cc, System.out);
				//System.out.println("File Created");
				
			      } catch (JAXBException e) {
				e.printStackTrace();
			      }a

	}

	
	void createXml(int Age_grp, int AgeInMonths, int RBL_Age, String Score, String RBL_LRATIO_SEC_OVERDUE_BAL2, String RBL_LRATIO_UNSEC_OVERDUE_BAL2, String RBL_TW_CNT_LIVE, String RBL_TOT_DISB_AMT, String RBL_util_card1, int RBL_CC_MAX_MOB,String RBL_HasOnly_CC ,String RBL_HasOnly_PL
		,	int RBL_TotalSanctionedAmt, String RBL_ReleventTrades_Status, int RBL_TOT_DISB_AMT1,String RBL_UTIL_PL1 ,int RBL_PCT_DEL_9 ,int RBL_RATIO_UNSEC_OVERDUE_BAL2) throws JAXBException{
		
		
	    new ObjectToXml().createXml(Age_grp, AgeInMonths, RBL_Age, Score, RBL_LRATIO_SEC_OVERDUE_BAL2, RBL_LRATIO_UNSEC_OVERDUE_BAL2
       		 ,RBL_TW_CNT_LIVE, RBL_TOT_DISB_AMT, RBL_util_card1,RBL_CC_MAX_MOB,RBL_HasOnly_CC,RBL_HasOnly_PL,RBL_TotalSanctionedAmt,RBL_ReleventTrades_Status);
		CreditReportOutput creditReport=new CreditReportOutput();
		creditReport.setAge_grp(Age_grp);
		creditReport.setAgeInMonths(AgeInMonths);
		creditReport.setRBL_Age(RBL_Age);
		creditReport.setScore(Score);
		creditReport.setRBL_LRATIO_SEC_OVERDUE_BAL2(RBL_LRATIO_SEC_OVERDUE_BAL2);
		creditReport.setRBL_LRATIO_UNSEC_OVERDUE_BAL2(RBL_LRATIO_UNSEC_OVERDUE_BAL2);
		creditReport.setRBL_TW_CNT_LIVE(RBL_TW_CNT_LIVE);
		creditReport.setRBL_TOT_DISB_AMT(RBL_TOT_DISB_AMT);
		creditReport.setRBL_util_card1(RBL_util_card1);
		creditReport.setRBL_CC_MAX_MOB(RBL_CC_MAX_MOB);
		creditReport.setRBL_HasOnly_CC(RBL_HasOnly_CC);
		creditReport.setRBL_HasOnly_PL(RBL_HasOnly_PL);
		creditReport.setRBL_TotalSanctionedAmt(RBL_TotalSanctionedAmt);
		creditReport.setRBL_ReleventTrades_Status(RBL_ReleventTrades_Status);
		creditReport.setRBL_CC_DISB_AMT_LV1(RBL_TOT_DISB_AMT1);
		creditReport.setRBL_UTIL_PL1(RBL_UTIL_PL1);
//		creditReport.setRBL_PCT_DEL_9(RBL_PCT_DEL_9);
//		creditReport.setRBL_RATIO_UNSEC_OVERDUE_BAL2(RBL_RATIO_UNSEC_OVERDUE_BAL2);
		File file = new File("output2.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(CreditReportOutput.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(creditReport, file);
		jaxbMarshaller.marshal(creditReport, System.out);
		
	}
	
	
}
*/