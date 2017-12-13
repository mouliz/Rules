package com.dev.neo.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Account
{
	@XmlElement
    private String SegmentTag;

	 @XmlElement
    private Account_Summary_Segment_Fields Account_Summary_Segment_Fields;

    @XmlElement
    private Account_NonSummary_Segment_Fields Account_NonSummary_Segment_Fields;

	@XmlElement
    private String Length;

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

    
	public Account_Summary_Segment_Fields getAccount_Summary_Segment_Fields() {
		return Account_Summary_Segment_Fields;
	}

	public void setAccount_Summary_Segment_Fields(Account_Summary_Segment_Fields account_Summary_Segment_Fields) {
		Account_Summary_Segment_Fields = account_Summary_Segment_Fields;
	}

	public Account_NonSummary_Segment_Fields getAccount_NonSummary_Segment_Fields() {
		return Account_NonSummary_Segment_Fields;
	}

	public void setAccount_NonSummary_Segment_Fields(Account_NonSummary_Segment_Fields account_NonSummary_Segment_Fields) {
		Account_NonSummary_Segment_Fields = account_NonSummary_Segment_Fields;
	}

	@Override
	public String toString() {
		return "Account [SegmentTag=" + SegmentTag + ", Account_Summary_Segment_Fields="
				+ Account_Summary_Segment_Fields + ", Account_NonSummary_Segment_Fields="
				+ Account_NonSummary_Segment_Fields + ", Length=" + Length + "] \n\n\n";
	}

 
      


	
   
    
    
}