package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;


public class IDSegment
{
	@XmlElement
    private String SegmentTag;

	@XmlElement
    private String IDNumber;

	@XmlElement
    private String IDNumberFieldLength;

	@XmlElement
    private String Length;

	@XmlElement
    private String IDType;

	
    public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getIDNumber ()
    {
        return IDNumber;
    }

    public void setIDNumber (String IDNumber)
    {
        this.IDNumber = IDNumber;
    }

    public String getIDNumberFieldLength ()
    {
        return IDNumberFieldLength;
    }

    public void setIDNumberFieldLength (String IDNumberFieldLength)
    {
        this.IDNumberFieldLength = IDNumberFieldLength;
    }

    public String getLength ()
    {
        return Length;
    }

    public void setLength (String Length)
    {
        this.Length = Length;
    }

    public String getIDType ()
    {
        return IDType;
    }

    public void setIDType (String IDType)
    {
        this.IDType = IDType;
    }

    @Override
    public String toString()
    {
        return "IDSegment:\n [SegmentTag = "+SegmentTag+", IDNumber = "+IDNumber+", IDNumberFieldLength = "+IDNumberFieldLength+", Length = "+Length+", IDType = "+IDType+"]\n\n\n";
    }
}