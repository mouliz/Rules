package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;

public class TelephoneSegment
{
	@XmlElement
	private String SegmentTag;
	@XmlElement
    private String TelephoneNumberFieldLength;
	@XmlElement
    private String Length;
	@XmlElement
    private String TelephoneNumber;
	@XmlElement
    private String TelephoneType;

    public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getTelephoneNumberFieldLength ()
    {
        return TelephoneNumberFieldLength;
    }

    public void setTelephoneNumberFieldLength (String TelephoneNumberFieldLength)
    {
        this.TelephoneNumberFieldLength = TelephoneNumberFieldLength;
    }

    public String getLength ()
    {
        return Length;
    }

    public void setLength (String Length)
    {
        this.Length = Length;
    }

    public String getTelephoneNumber ()
    {
        return TelephoneNumber;
    }

    public void setTelephoneNumber (String TelephoneNumber)
    {
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getTelephoneType ()
    {
        return TelephoneType;
    }

    public void setTelephoneType (String TelephoneType)
    {
        this.TelephoneType = TelephoneType;
    }

    @Override
    public String toString()
    {
        return "TelephoneSegment:\n [SegmentTag = "+SegmentTag+", TelephoneNumberFieldLength = "+TelephoneNumberFieldLength+", Length = "+Length+", TelephoneNumber = "+TelephoneNumber+", TelephoneType = "+TelephoneType+"]\n\n\n";
    }
}
			
	