package com.dev.neo.master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RULEUtil {

public static final String MONTH="MONTH";
public static final String YEARS="YEARS";

/**
 * Date difference with respec to difference type
 * @param first
 * @param last
 * @param differnceCODE
 * @return
 */
public static int getDateDiff(Date first, Date last,String differnceCODE) 
{
	long diff = last.getTime() - first.getTime();
	int result =0;
	
	if(differnceCODE.equalsIgnoreCase(MONTH))
		result=Math.round(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/30);
	else
		result=Math.round(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/365);
	
	return result;
	
}




public static int getDiffYears(Date first, Date last) {
    Calendar a = getCalendar(first);
    Calendar b = getCalendar(last);
    
    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
        (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
        diff--;
    }
    return diff;
}

public static Calendar getCalendar(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal;
}


public static boolean getDateCompare(String datepro, String endate) {
 
	boolean isDate = false;
	
	int yearDateProcessed = Integer.parseInt(datepro.substring(4, 8));
	int monthDateProcessed = Integer.parseInt(datepro.substring(2, 4));
	int yearEndDate = Integer.parseInt(endate.substring(4, 8));
	int monthEndDate = Integer.parseInt(endate.substring(4, 8));
	
	if(yearDateProcessed == yearEndDate){
		if(monthDateProcessed > monthEndDate){
			isDate = true;
		}else{
			isDate = false;
		}
	}else{
      
		 if(yearDateProcessed > yearEndDate)
		 {
			 isDate = true;
		 }
		 if(yearDateProcessed > yearEndDate)
		 {
			 isDate = false;
		 }
	}
	 return isDate;
}


public static List<String> getSplitStringCustom(String text ,int monthDiff,int limit)
{
	List<String> result = new ArrayList<String>();
	int index = 0;
	if(monthDiff>limit)
		monthDiff=limit/3;
	while (index<monthDiff) {
		
		result.add("000");
		index+=1;
	}
	
	
	index=0;
	while (index < text.length()) {
		
		   if(index>limit-1)
			   break;
		  if(result.size()>limit/3)
			  break;
		result.add(text.substring(index, Math.min(index +3,text.length())));
	    index += 3;

	}
	return result;
}

public static List<String> getSplitString(String text ,int limit)
{
	List<String> result = new ArrayList<String>();
	int index = 0;
	while (index < text.length()) {
		   if(index>limit-1)
			   break;
		   
		result.add(text.substring(index, Math.min(index +3,text.length())));
	    index += 3;

	}
	
	return result;
}
    
	
public static boolean isDateEqualOrnot(String processDate, String histEndDate )
{
	  String datepromonth=processDate.substring(2,4);
	  String dateproyear=processDate.substring(4,8);
	  String endatemonth=histEndDate.substring(2,4);
	  String endateyear=histEndDate.substring(4,8);
	   boolean isdate=false;
	  boolean isyeargreater= Integer.parseInt(dateproyear)== Integer.parseInt(endateyear)? true: false;
	  boolean isMonthgreater= Integer.parseInt(datepromonth) == Integer.parseInt(endatemonth)? true: false;

	  if(isyeargreater || isMonthgreater) isdate=true;
	  else isdate=false;
	
	return isdate;

}
}

