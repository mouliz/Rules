package com.dev.neo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;






public class Account_Summary_Segment_Fields
{
	@XmlElement
    private  String ReportingMemberShortNameFieldLength;

    public  String getReportingMemberShortNameFieldLength ()
    {
        return ReportingMemberShortNameFieldLength;
    }

    public  void setReportingMemberShortNameFieldLength (String ReportingMemberShortNameFieldLength)
    {
       this.ReportingMemberShortNameFieldLength= ReportingMemberShortNameFieldLength;
    }

    @Override
    public String toString()
    {
        return "Account_Summary_Segment_Fields:\n [ReportingMemberShortNameFieldLength = "+ReportingMemberShortNameFieldLength+"]\n\n\n";
    }
    
    
}