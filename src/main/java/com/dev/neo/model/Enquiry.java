package com.dev.neo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Enquiry
{
	@XmlElement
    private String SegmentTag;

	@XmlElement
    private String EnquiryPurpose;

	@XmlElement
    private String Length;

	@XmlElement
    private String DateOfEnquiryFields;

	@XmlElement
    private String EnquiryAmountFieldLength;

	@XmlElement
    private String EnquiryAmount;

	@XmlElement
    private String EnquiringMemberShortName;

	@XmlElement
    private String EnquiringMemberShortNameFieldLength;

    public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getEnquiryPurpose ()
    {
        return EnquiryPurpose;
    }

    public void setEnquiryPurpose (String EnquiryPurpose)
    {
        this.EnquiryPurpose = EnquiryPurpose;
    }

    public String getLength ()
    {
        return Length;
    }

    public void setLength (String Length)
    {
        this.Length = Length;
    }

    public String getDateOfEnquiryFields ()
    {
        return DateOfEnquiryFields;
    }

    public void setDateOfEnquiryFields (String DateOfEnquiryFields)
    {
        this.DateOfEnquiryFields = DateOfEnquiryFields;
    }

    public String getEnquiryAmountFieldLength ()
    {
        return EnquiryAmountFieldLength;
    }

    public void setEnquiryAmountFieldLength (String EnquiryAmountFieldLength)
    {
        this.EnquiryAmountFieldLength = EnquiryAmountFieldLength;
    }

    public String getEnquiryAmount ()
    {
        return EnquiryAmount;
    }

    public void setEnquiryAmount (String EnquiryAmount)
    {
        this.EnquiryAmount = EnquiryAmount;
    }

    public String getEnquiringMemberShortName ()
    {
        return EnquiringMemberShortName;
    }

    public void setEnquiringMemberShortName (String EnquiringMemberShortName)
    {
        this.EnquiringMemberShortName = EnquiringMemberShortName;
    }

    public String getEnquiringMemberShortNameFieldLength ()
    {
        return EnquiringMemberShortNameFieldLength;
    }

    public void setEnquiringMemberShortNameFieldLength (String EnquiringMemberShortNameFieldLength)
    {
        this.EnquiringMemberShortNameFieldLength = EnquiringMemberShortNameFieldLength;
    }

    @Override
    public String toString()
    {
        return "Enquiry [SegmentTag = "+SegmentTag+", EnquiryPurpose = "+EnquiryPurpose+", Length = "+Length+", DateOfEnquiryFields = "+DateOfEnquiryFields+", EnquiryAmountFieldLength = "+EnquiryAmountFieldLength+", EnquiryAmount = "+EnquiryAmount+", EnquiringMemberShortName = "+EnquiringMemberShortName+", EnquiringMemberShortNameFieldLength = "+EnquiringMemberShortNameFieldLength+"]\n\n\n";
    }
}