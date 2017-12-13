package com.dev.neo.xmlhandler;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.concretepage.bean.*;
import com.dev.neo.model.Account;
import com.dev.neo.model.CreditReport;
import com.dev.neo.model.CreditReports;
import com.neo.models.Accounts;

public class JAXBXmlHandler {

	/*public static List<CreditReport> unmarshal(File importFile) throws JAXBException{
		
    CreditReports credit = new CreditReports();
    JAXBContext context = JAXBContext.newInstance(CreditReports.class);
    Unmarshaller um = context.createUnmarshaller();
    
   credit = (CreditReports)um.unmarshal(importFile);


   return credit.getCreditReport();
}*/
	
	
    // Import
    public static List<Book> unmarshals(File importFile) throws JAXBException {
        Books books = new Books();
 
        JAXBContext context = JAXBContext.newInstance(Books.class);
        Unmarshaller um = context.createUnmarshaller();
        books = (Books) um.unmarshal(importFile);
 
        return books.getBooks();
    }
    
    
    public static List<Book> unmarshalb(File importFile) throws JAXBException {
        Book books = new Book();
 
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Unmarshaller um = context.createUnmarshaller();
        books = (Book) um.unmarshal(importFile);
 
        return books.getBooks();
    }
    
	
    public static List<CreditReport> unmarshalssss(File importFile) throws JAXBException {
    	com.dev.neo.model.CreditReports  creditReports = new com.dev.neo.model.CreditReports();
      JAXBContext context = JAXBContext.newInstance(CreditReports.class);
      Unmarshaller um = context.createUnmarshaller();
      
      creditReports = (CreditReports) um.unmarshal(importFile);
      return creditReports.getCredit();
    }
    
}
