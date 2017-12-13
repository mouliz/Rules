package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;


public class EmploymentSegment
{
	@XmlElement
	private String SegmentTag;
	@XmlElement
    private String Length;
	@XmlElement
    private String OccupationCode;
	@XmlElement
    private String DateReportedCertified;
	@XmlElement
    private String AccountType;

    public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getLength ()
    {
        return Length;
    }

    public void setLength (String Length)
    {
        this.Length = Length;
    }

    public String getOccupationCode ()
    {
        return OccupationCode;
    }

    public void setOccupationCode (String OccupationCode)
    {
        this.OccupationCode = OccupationCode;
    }

    public String getDateReportedCertified ()
    {
        return DateReportedCertified;
    }

    public void setDateReportedCertified (String DateReportedCertified)
    {
        this.DateReportedCertified = DateReportedCertified;
    }

    public String getAccountType ()
    {
        return AccountType;
    }

    public void setAccountType (String AccountType)
    {
        this.AccountType = AccountType;
    }

    @Override
    public String toString()
    {
        return "EmploymentSegment:\n [SegmentTag = "+SegmentTag+", Length = "+Length+", OccupationCode = "+OccupationCode+", DateReportedCertified = "+DateReportedCertified+", AccountType = "+AccountType+"]\n\n\n";
    }
}
