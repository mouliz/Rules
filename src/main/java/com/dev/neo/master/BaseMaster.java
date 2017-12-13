package com.dev.neo.master;

import java.util.ArrayList;
import java.util.List;

public class BaseMaster {
	
	

public  int getCalSTD000XXX(String paymentHistory1) {
	
    	String ph = paymentHistory1;
    	if(ph.length()>=21)
    	{
         ph = ph.substring(0, 21);
    	
    	}	
    	else{
    		//append STD and send
    		int c = ph.length()/3;
    		int app = 7 - c;
           for(int j=0;j<app;j++){
        	   ph = ph.concat("STD");
           }
    	}	
	  
    // System.out.println(paymentHistory1);
    List<String> l1 = new ArrayList<String>();//group1
	List<String> l2 = new ArrayList<String>();//group2
	
	String p = ph;//PH local variable
	
	boolean flag1 = false;//(boolean result of group1)
	boolean flag2 = false;//(boolean result of group2)
	
	
          for(int i = 0;i<21;i+=3){
          	if(i<=9)l1.add(p.substring(i, (i+3)));
          	else l2.add(p.substring(i, (i+3)));
          }
         
         for(String s:l1){
         
           if(s.equals("000")||(s.equals("XXX")||(s.equals("STD"))))  flag1 = false;
           else flag1 = true;
         }
         
         
         for(String s:l2){
           if(s.equals("STD") || s.equals("XXX") || s.equals("000")){
      		   flag2 = true;
      	   }else  flag2 = false;
  		   
  	   }
         boolean result = (flag1 && flag2);
          
	       if(result) return 1 ;else  return 0;

	 
}


public  boolean getPaymentHistory(String paymentHistory1) {
	
	String ph = paymentHistory1;
	
	if(ph.length()>=21)
	{
     ph = ph.substring(0, 21);
	
	}	
	else{
		//append STD and send
		int c = ph.length()/3;
		int app = 7 - c;
       for(int j=0;j<app;j++){
    	   ph = ph.concat("STD");
       }
	}	
  
// System.out.println(paymentHistory1);
List<String> l1 = new ArrayList<String>();//group1

String p = ph;//PH local variable

boolean flag1 = false;//(boolean result of group1)


      for(int i = 0;i<21;i+=3){
      	if(i<=9)l1.add(p.substring(i, (i+3)));
      }
     
     for(String s:l1){
     
       if(s.equals("000")||(s.equals("XXX")||(s.equals("STD"))))  flag1 = false;
       else flag1 = false;
     }
     
      
   return flag1;

 
}






}
