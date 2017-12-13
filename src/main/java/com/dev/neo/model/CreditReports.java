package com.dev.neo.model;

import java.util.ArrayList;
import java.util.List;

public class CreditReports {


//	@XmlElement(name = "CreditReport", type = CreditReport.class)
	private List<CreditReport> credit = new ArrayList<CreditReport>();

	
	
	
	
	public CreditReports() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditReports(List<CreditReport> credit) {
		super();
		this.credit = credit;
	}

	public List<CreditReport> getCredit() {
		return credit;
	}

	public void setCredit(List<CreditReport> credit) {
		this.credit = credit;
	}
	
	
	
	
	
	
}
