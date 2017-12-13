package com.dev.neo.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;


public class Header
{
	@XmlElement
	private String SegmentTag;

	@XmlElement
    private String ReferenceNumber;

	@XmlElement
    private String TimeProcessed;

	@XmlElement
    private String EnquiryControlNumber;

	@XmlElement
    private String DateProcessed;

	@XmlElement
    private String MemberCode;

	@XmlElement
    private String SubjectReturnCode;

	@XmlElement
    private String Version;
	
	   @XmlElement
	  private String UserDob;

	     @XmlElement
	 	 private String RunDate;
	     
	 	 
    public String getUserDob() {
			return UserDob;
		}

		public void setUserDob(String userDob) {
			UserDob = userDob;
		}

		public String getRunDate() {
			return RunDate;
		}

		public void setRunDate(String runDate) {
			RunDate = runDate;
		}

	public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getReferenceNumber ()
    {
        return ReferenceNumber;
    }

    public void setReferenceNumber (String ReferenceNumber)
    {
        this.ReferenceNumber = ReferenceNumber;
    }

    public String getTimeProcessed ()
    {
        return TimeProcessed;
    }

    public void setTimeProcessed (String TimeProcessed)
    {
        this.TimeProcessed = TimeProcessed;
    }

    public String getEnquiryControlNumber ()
    {
        return EnquiryControlNumber;
    }

    public void setEnquiryControlNumber (String EnquiryControlNumber)
    {
        this.EnquiryControlNumber = EnquiryControlNumber;
    }

    public String getDateProcessed ()
    {
        return DateProcessed;
    }

    public void setDateProcessed (String DateProcessed)
    {
        this.DateProcessed = DateProcessed;
    }

    public String getMemberCode ()
    {
        return MemberCode;
    }

    public void setMemberCode (String MemberCode)
    {
        this.MemberCode = MemberCode;
    }

    public String getSubjectReturnCode ()
    {
        return SubjectReturnCode;
    }

    public void setSubjectReturnCode (String SubjectReturnCode)
    {
        this.SubjectReturnCode = SubjectReturnCode;
    }

    public String getVersion ()
    {
        return Version;
    }

    public void setVersion (String Version)
    {
        this.Version = Version;
    }

    @Override
	public String toString() {
		return "Header [SegmentTag=" + SegmentTag + ", ReferenceNumber="
				+ ReferenceNumber + ", TimeProcessed=" + TimeProcessed
				+ ", EnquiryControlNumber=" + EnquiryControlNumber
				+ ", DateProcessed=" + DateProcessed + ", MemberCode="
				+ MemberCode + ", SubjectReturnCode=" + SubjectReturnCode
				+ ", Version=" + Version + ", UserDob=" + UserDob
				+ ", RunDate=" + RunDate + "]";
	}
}
		