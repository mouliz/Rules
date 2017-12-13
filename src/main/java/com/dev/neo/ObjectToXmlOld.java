package com.dev.neo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.dev.neo.model.Address;
import com.dev.neo.model.CreditReport;
import com.dev.neo.model.CreditReportOutput;
import com.dev.neo.model.NameSegment;

public class ObjectToXmlOld {
	public static void main(String[] args) throws FileNotFoundException {

	
		
/*	  Customer customer = new Customer();
	  customer.setId(100);
	  customer.setName("mkyong");
	  customer.setAge(29);
*/
		
		
		//CCData cc = new CCData();
		//cc.setDateProcessed(new Date(2016,06,12));
		//cc.setRunDate(new Date(2016,06,13));
		//cc.setUserDob(new Date(1989,10,24));
		
		
		CreditReport creditReport = new CreditReport();
		
		List<Address> ladd = new ArrayList<Address>();
		
		Address a = new Address();
		a.setAddressCategory("c1");
		a.setAddressLine1("A-202");
		a.setAddressLine1FieldLength("10");
		a.setAddressLine2("BORIWALI");
		a.setAddressLine2FieldLength("10");
		a.setAddressSegmentTag("Seg1");
		a.setDateReported("20160612");
		a.setLength("59");
		a.setPinCode("401234");
		a.setPinCodeFieldLength("6");
		a.setResidenceCode("878878");
		a.setSegmentTag("s1");
		a.setStateCode("2635623562");
		
		
		ladd.add(a);
		
		NameSegment ns = new NameSegment();
		ns.setConsumerName1("N1");
		ns.setConsumerName1FieldLength("10");
		ns.setConsumerName2("N2");
		ns.setConsumerName2FieldLength("12");
		ns.setDateOfBirth("12122212");
		ns.setDateOfBirthFieldLength("8");
		ns.setGender("M");
		ns.setGenderFieldLength("1");
		ns.setLength("20");
		ns.setSegmentTag("s2");
		
		
		
		
		//creditReport.setAddress(ladd);
		
		creditReport.setNameSegment(ns);
		
		//cc.setCreditReport(creditReport);
		
		
	  try {

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
	      }

	}
}