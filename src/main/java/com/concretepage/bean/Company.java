package com.concretepage.bean;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="company-info", namespace="com.concretepage" )
@XmlAccessorType(XmlAccessType.NONE)

public class Company {
	
	@XmlAttribute(name="id")
	private Integer id;
	@XmlElement(name="company-name")
	private String companyName;
	@XmlElement(name="ceo-name")
	private String ceoName;
	@XmlElement(name="no-emp")
	private Integer noEmp;
	
	@XmlElement(name="SegmentTag")
	private String segmentTag;
	
	
	
	
	public String getSegmentTag() {
		return segmentTag;
	}
	public void setSegmentTag(String segmentTag) {
		this.segmentTag = segmentTag;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public Integer getNoEmp() {
		return noEmp;
	}
	public void setNoEmp(Integer noEmp) {
		this.noEmp = noEmp;
	}
}
