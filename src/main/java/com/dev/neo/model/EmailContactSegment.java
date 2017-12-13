package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;


public class EmailContactSegment
{
	@XmlElement
    private String SegmentTag;

	@XmlElement
    private String Length;

	@XmlElement
    private String EmailIDFieldLength;

	@XmlElement
    private String EmailID;

	
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

    public String getEmailIDFieldLength ()
    {
        return EmailIDFieldLength;
    }

    public void setEmailIDFieldLength (String EmailIDFieldLength)
    {
        this.EmailIDFieldLength = EmailIDFieldLength;
    }

    public String getEmailID ()
    {
        return EmailID;
    }

    public void setEmailID (String EmailID)
    {
        this.EmailID = EmailID;
    }

    @Override
    public String toString()
    {
        return "EmailContactSegment \n [SegmentTag = "+SegmentTag+", Length = "+Length+", EmailIDFieldLength = "+EmailIDFieldLength+", EmailID = "+EmailID+"]\n\n\n";
    }
}
		