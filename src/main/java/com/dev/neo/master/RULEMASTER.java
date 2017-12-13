package com.dev.neo.master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RULEMASTER {

	public static final ArrayList<String> secureLines = new ArrayList(Arrays.asList("01","51","53","52","54","59","55","57","52","17","33","07","02","11","15",
			"04","14","03","34","13","32","31"));


	public static final  ArrayList<String> unsecureLines = new ArrayList(Arrays.asList("06","10","08","16","09","43","41","00","12","05"));

//
// SECURE LINS
//    Auto Loan(01)
//    Business Loan - general 51
//    Business Loan - Priority Sector - Agriculture 53
//    Business Loan - Priority Sector - Small Business 52
//    Business Loan - Priority Sector - Other 54
//    Business Loan Against Bank Deposits 59
//    Business Non - Funded Credit Facility 55
//    Business Non - Funded Credit Facility - Agriculture 57
//    Business Non - Funded Credit Facility - Small Business 52
//    Commercial Vehicle Loan 17
//    Construction Equipment Loan 33
//    Gold Loan 07
//    Housing Loan 02
//    Leasing 11
//    Loan against bank deposits 15
//    Loan against shares / securities 04
//    Non- Funded credit facility 14
//    Property Loan 03
//    Tractor Loan 34
//    Two-wheeler Loan 13
//    Used Car Loan 32s
//    Secured Credit Card 31

	
	
	//UNSECURED LINE
//	
//	Consumer Loan 06
//	Credit Card 10
//	Education Loan 08
//	Fleet Card 16
//	Loan to professional 09
//	Microfinance – Other 43
//	Microfinance Personal Loan 41
//	Other 00
//	Overdraft 12
//	Personal Loan 05
//	Staff Loan

	public static boolean isSecured(String type)
	{
			
			return secureLines.contains(type);
	}
	
	public static boolean isUnSecured(String type)
	{
			
			return unsecureLines.contains(type);
	}
}
