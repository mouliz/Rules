package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;

public class Address
{
	@XmlElement
    private String SegmentTag;

	@XmlElement
    private String PinCode;

	@XmlElement
    private String DateReported;

	@XmlElement
    private String AddressLine2FieldLength;

	@XmlElement
    private String ResidenceCode;//

	@XmlElement
    private String AddressSegmentTag;

	@XmlElement
    private String Length;

	@XmlElement
    private String PinCodeFieldLength;

	@XmlElement
    private String AddressLine1FieldLength;

	@XmlElement
    private String AddressLine1;

	@XmlElement
    private String AddressLine2;

	@XmlElement
    private String StateCode;

	@XmlElement
    private String AddressCategory;

    public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getPinCode ()
    {
        return PinCode;
    }

    public void setPinCode (String PinCode)
    {
        this.PinCode = PinCode;
    }

    public String getDateReported ()
    {
        return DateReported;
    }

    public void setDateReported (String DateReported)
    {
        this.DateReported = DateReported;
    }

    public String getAddressLine2FieldLength ()
    {
        return AddressLine2FieldLength;
    }

    public void setAddressLine2FieldLength (String AddressLine2FieldLength)
    {
        this.AddressLine2FieldLength = AddressLine2FieldLength;
    }

    public String getResidenceCode ()
    {
        return ResidenceCode;
    }

    public void setResidenceCode (String ResidenceCode)
    {
        this.ResidenceCode = ResidenceCode;
    }

    public String getAddressSegmentTag ()
    {
        return AddressSegmentTag;
    }

    public void setAddressSegmentTag (String AddressSegmentTag)
    {
        this.AddressSegmentTag = AddressSegmentTag;
    }

    public String getLength ()
    {
        return Length;
    }

    public void setLength (String Length)
    {
        this.Length = Length;
    }

    public String getPinCodeFieldLength ()
    {
        return PinCodeFieldLength;
    }

    public void setPinCodeFieldLength (String PinCodeFieldLength)
    {
        this.PinCodeFieldLength = PinCodeFieldLength;
    }

    public String getAddressLine1FieldLength ()
    {
        return AddressLine1FieldLength;
    }

    public void setAddressLine1FieldLength (String AddressLine1FieldLength)
    {
        this.AddressLine1FieldLength = AddressLine1FieldLength;
    }

    public String getAddressLine1 ()
    {
        return AddressLine1;
    }

    public void setAddressLine1 (String AddressLine1)
    {
        this.AddressLine1 = AddressLine1;
    }

    public String getAddressLine2 ()
    {
        return AddressLine2;
    }

    public void setAddressLine2 (String AddressLine2)
    {
        this.AddressLine2 = AddressLine2;
    }

    public String getStateCode ()
    {
        return StateCode;
    }

    public void setStateCode (String StateCode)
    {
        this.StateCode = StateCode;
    }

    public String getAddressCategory ()
    {
        return AddressCategory;
    }

    public void setAddressCategory (String AddressCategory)
    {
        this.AddressCategory = AddressCategory;
    }

    @Override
    public String toString()
    {
        return "Address [SegmentTag = "+SegmentTag+","
        		+ " PinCode = "+PinCode+", "
        	    + "DateReported = "+DateReported+", "
        	    + "AddressLine2FieldLength = "+AddressLine2FieldLength+", ResidenceCode = "+ResidenceCode+", AddressSegmentTag = "+AddressSegmentTag+", Length = "+Length+", PinCodeFieldLength = "+PinCodeFieldLength+", AddressLine1FieldLength = "+AddressLine1FieldLength+", AddressLine1 = "+AddressLine1+", AddressLine2 = "+AddressLine2+", StateCode = "+StateCode+", AddressCategory = "+AddressCategory+"]\n\n\n";
    }
}