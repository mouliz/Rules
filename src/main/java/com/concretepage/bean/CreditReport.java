package com.concretepage.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Header")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditReport {
	
	@XmlAttribute(name="id")
	private Integer id;
	@XmlElement(name="SegmentTag")
	private String segmentTag;
	@XmlElement(name="Version")
	private Integer version;
	@XmlElement(name="ReferenceNumber")
	private Long referenceNumber;
	@XmlElement(name="MemberCode")
	private String memberCode;
	@XmlElement(name="SubjectReturnCode")
	private Integer subjectReturnCode;
	@XmlElement(name="EnquiryControlNumber")
	private Long enquiryControlNumber;
	@XmlElement(name="DateProcessed")
	private Long dateProcessed;
	@XmlElement(name="TimeProcessed")
	private Long timeProcessed;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSegmentTag() {
		return segmentTag;
	}
	public void setSegmentTag(String segmentTag) {
		this.segmentTag = segmentTag;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Long getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(Long referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public Integer getSubjectReturnCode() {
		return subjectReturnCode;
	}
	public void setSubjectReturnCode(Integer subjectReturnCode) {
		this.subjectReturnCode = subjectReturnCode;
	}
	public Long getEnquiryControlNumber() {
		return enquiryControlNumber;
	}
	public void setEnquiryControlNumber(Long enquiryControlNumber) {
		this.enquiryControlNumber = enquiryControlNumber;
	}
	public Long getDateProcessed() {
		return dateProcessed;
	}
	public void setDateProcessed(Long dateProcessed) {
		this.dateProcessed = dateProcessed;
	}
	public Long getTimeProcessed() {
		return timeProcessed;
	}
	public void setTimeProcessed(Long timeProcessed) {
		this.timeProcessed = timeProcessed;
	}
	@Override
	public String toString() {
		return "CreditReport [id=" + id + ", segmentTag=" + segmentTag + ", version=" + version + ", referenceNumber="
				+ referenceNumber + ", memberCode=" + memberCode + ", subjectReturnCode=" + subjectReturnCode
				+ ", enquiryControlNumber=" + enquiryControlNumber + ", dateProcessed=" + dateProcessed
				+ ", timeProcessed=" + timeProcessed + "]";
	}
	
		
	
	
	
	
}
