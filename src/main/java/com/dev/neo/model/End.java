package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;

public class End
{
	@XmlElement
    private String SegmentTag;

	@XmlElement
    private String TotalLength;

	
    public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getTotalLength ()
    {
        return TotalLength;
    }

    public void setTotalLength (String TotalLength)
    {
        this.TotalLength = TotalLength;
    }

    @Override
    public String toString()
    {
        return "End:\n [SegmentTag = "+SegmentTag+", TotalLength = "+TotalLength+"]\n\n\n";
    }
}