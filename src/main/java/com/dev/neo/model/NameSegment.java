
package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;


public class NameSegment
{
	@XmlElement
    private String SegmentTag;
	@XmlElement
    private String DateOfBirth;
	@XmlElement
    private String ConsumerName1FieldLength;
	@XmlElement
    private String ConsumerName2FieldLength;
	@XmlElement
    private String Length;
	@XmlElement
    private String DateOfBirthFieldLength;
	@XmlElement
    private String Gender;
	@XmlElement
    private String ConsumerName2;
	@XmlElement
    private String ConsumerName1;
	@XmlElement
    private String GenderFieldLength;

    public String getSegmentTag ()
    {
        return SegmentTag;
    }

    public void setSegmentTag (String SegmentTag)
    {
        this.SegmentTag = SegmentTag;
    }

    public String getDateOfBirth ()
    {
        return DateOfBirth;
    }

    public void setDateOfBirth (String DateOfBirth)
    {
        this.DateOfBirth = DateOfBirth;
    }

    public String getConsumerName1FieldLength ()
    {
        return ConsumerName1FieldLength;
    }

    public void setConsumerName1FieldLength (String ConsumerName1FieldLength)
    {
        this.ConsumerName1FieldLength = ConsumerName1FieldLength;
    }

    public String getConsumerName2FieldLength ()
    {
        return ConsumerName2FieldLength;
    }

    public void setConsumerName2FieldLength (String ConsumerName2FieldLength)
    {
        this.ConsumerName2FieldLength = ConsumerName2FieldLength;
    }

    public String getLength ()
    {
        return Length;
    }

    public void setLength (String Length)
    {
        this.Length = Length;
    }

    public String getDateOfBirthFieldLength ()
    {
        return DateOfBirthFieldLength;
    }

    public void setDateOfBirthFieldLength (String DateOfBirthFieldLength)
    {
        this.DateOfBirthFieldLength = DateOfBirthFieldLength;
    }

    public String getGender ()
    {
        return Gender;
    }

    public void setGender (String Gender)
    {
        this.Gender = Gender;
    }

    public String getConsumerName2 ()
    {
        return ConsumerName2;
    }

    public void setConsumerName2 (String ConsumerName2)
    {
        this.ConsumerName2 = ConsumerName2;
    }

    public String getConsumerName1 ()
    {
        return ConsumerName1;
    }

    public void setConsumerName1 (String ConsumerName1)
    {
        this.ConsumerName1 = ConsumerName1;
    }

    public String getGenderFieldLength ()
    {
        return GenderFieldLength;
    }

    public void setGenderFieldLength (String GenderFieldLength)
    {
        this.GenderFieldLength = GenderFieldLength;
    }

    @Override
    public String toString()
    {
        return "NameSegment: \n [SegmentTag = "+SegmentTag+", DateOfBirth = "+DateOfBirth+", ConsumerName1FieldLength = "+ConsumerName1FieldLength+", ConsumerName2FieldLength = "+ConsumerName2FieldLength+", Length = "+Length+", DateOfBirthFieldLength = "+DateOfBirthFieldLength+", Gender = "+Gender+", ConsumerName2 = "+ConsumerName2+", ConsumerName1 = "+ConsumerName1+", GenderFieldLength = "+GenderFieldLength+"]\n\n\n";
    }
}
			
	