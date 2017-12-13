package com.dev.neo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="CreditReport")
public class CreditReport
{
    
	@XmlElement
	private List<Enquiry> Enquiry;

	@XmlElement
    private End End;

	@XmlElement
    private ScoreSegment ScoreSegment;

//	@XmlElement(name="IDSegment")
 //   private IDSegment IDSegment;

	@XmlElement
    private Header Header;

	@XmlElement
    private List<EmailContactSegment> EmailContactSegment;

	@XmlElement
    private List<Address> Address;

	@XmlElement
    private List<Account> Account;

	@XmlElement
    private List<TelephoneSegment> TelephoneSegment;

	@XmlElement
    private NameSegment NameSegment;

	@XmlElement
    private EmploymentSegment EmploymentSegment;

	public List<Enquiry> getEnquiry() {
		return Enquiry;
	}

	public void setEnquiry(List<Enquiry> enquiry) {
		Enquiry = enquiry;
	}

	public End getEnd() {
		return End;
	}

	public void setEnd(End end) {
		End = end;
	}

	public ScoreSegment getScoreSegment() {
		return ScoreSegment;
	}

	public void setScoreSegment(ScoreSegment scoreSegment) {
		ScoreSegment = scoreSegment;
	}

	/*public IDSegment getIDSegment() {
		return IDSegment;
	}

	public void setIDSegment(IDSegment iDSegment) {
		IDSegment = iDSegment;
	}
*/
	public Header getHeader() {
		return Header;
	}

	public void setHeader(Header header) {
		Header = header;
	}

	public List<EmailContactSegment> getEmailContactSegment() {
		return EmailContactSegment;
	}

	public void setEmailContactSegment(List<EmailContactSegment> emailContactSegment) {
		EmailContactSegment = emailContactSegment;
	}

	public List<Address> getAddress() {
		return Address;
	}

	public void setAddress(List<Address> address) {
		Address = address;
	}

	public List<Account> getAccount() {
		return Account;
	}

	public void setAccount(List<Account> account) {
		Account = account;
	}

	public List<TelephoneSegment> getTelephoneSegment() {
		return TelephoneSegment;
	}

	public void setTelephoneSegment(List<TelephoneSegment> telephoneSegment) {
		TelephoneSegment = telephoneSegment;
	}

	public NameSegment getNameSegment() {
		return NameSegment;
	}

	public void setNameSegment(NameSegment nameSegment) {
		NameSegment = nameSegment;
	}

	public EmploymentSegment getEmploymentSegment() {
		return EmploymentSegment;
	}

	public void setEmploymentSegment(EmploymentSegment employmentSegment) {
		EmploymentSegment = employmentSegment;
	}

	@Override
	public String toString() {
		return "CreditReport [Enquiry=" + Enquiry + ", End=" + End + ", ScoreSegment=" + ScoreSegment + ", IDSegment="
				+ "IDSegment" + ", Header=" + Header + ", EmailContactSegment=" + EmailContactSegment + ", Address="
				+ Address + ", Account=" + Account + ", TelephoneSegment=" + TelephoneSegment + ", NameSegment="
				+ NameSegment + ", EmploymentSegment=" + EmploymentSegment + "]\n\n\n";
	}

	public CreditReport() {
		//super();
		// TODO Auto-generated constructor stub
	}

    
	
	
}