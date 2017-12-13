package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;

public class ScoreSegment
{
	@XmlElement
    private String ScoreDate;

	@XmlElement
    private String ReasonCode1;

	@XmlElement
    private String ReasonCode2;

	@XmlElement
    private String ReasonCode3;

	@XmlElement
    private String ScoreCardName;
	
	@XmlElement
    private String Length;

	@XmlElement
    private String ReasonCode4;

	@XmlElement
    private String ReasonCode4FieldLength;

	@XmlElement
    private String ScoreCardVersion;

	@XmlElement
    private String ReasonCode2FieldLength;

	@XmlElement
    private String ReasonCode1FieldLength;

	@XmlElement
    private String ScoreName;

	@XmlElement
    private String Score;

	@XmlElement
    private String ReasonCode3FieldLength;

    public String getScoreDate ()
    {
        return ScoreDate;
    }

    public void setScoreDate (String ScoreDate)
    {
        this.ScoreDate = ScoreDate;
    }

    public String getReasonCode1 ()
    {
        return ReasonCode1;
    }

    public void setReasonCode1 (String ReasonCode1)
    {
        this.ReasonCode1 = ReasonCode1;
    }

    public String getReasonCode2 ()
    {
        return ReasonCode2;
    }

    public void setReasonCode2 (String ReasonCode2)
    {
        this.ReasonCode2 = ReasonCode2;
    }

    public String getReasonCode3 ()
    {
        return ReasonCode3;
    }

    public void setReasonCode3 (String ReasonCode3)
    {
        this.ReasonCode3 = ReasonCode3;
    }

    public String getScoreCardName ()
    {
        return ScoreCardName;
    }

    public void setScoreCardName (String ScoreCardName)
    {
        this.ScoreCardName = ScoreCardName;
    }

    public String getLength ()
    {
        return Length;
    }

    public void setLength (String Length)
    {
        this.Length = Length;
    }

    public String getReasonCode4 ()
    {
        return ReasonCode4;
    }

    public void setReasonCode4 (String ReasonCode4)
    {
        this.ReasonCode4 = ReasonCode4;
    }

    public String getReasonCode4FieldLength ()
    {
        return ReasonCode4FieldLength;
    }

    public void setReasonCode4FieldLength (String ReasonCode4FieldLength)
    {
        this.ReasonCode4FieldLength = ReasonCode4FieldLength;
    }

    public String getScoreCardVersion ()
    {
        return ScoreCardVersion;
    }

    public void setScoreCardVersion (String ScoreCardVersion)
    {
        this.ScoreCardVersion = ScoreCardVersion;
    }

    public String getReasonCode2FieldLength ()
    {
        return ReasonCode2FieldLength;
    }

    public void setReasonCode2FieldLength (String ReasonCode2FieldLength)
    {
        this.ReasonCode2FieldLength = ReasonCode2FieldLength;
    }

    public String getReasonCode1FieldLength ()
    {
        return ReasonCode1FieldLength;
    }

    public void setReasonCode1FieldLength (String ReasonCode1FieldLength)
    {
        this.ReasonCode1FieldLength = ReasonCode1FieldLength;
    }

    public String getScoreName ()
    {
        return ScoreName;
    }

    public void setScoreName (String ScoreName)
    {
        this.ScoreName = ScoreName;
    }

    public String getScore ()
    {
        return Score;
    }

    public void setScore (String Score)
    {
        this.Score = Score;
    }

    public String getReasonCode3FieldLength ()
    {
        return ReasonCode3FieldLength;
    }

    public void setReasonCode3FieldLength (String ReasonCode3FieldLength)
    {
        this.ReasonCode3FieldLength = ReasonCode3FieldLength;
    }

    @Override
    public String toString()
    {
        return "ScoreSegment:\n [ScoreDate = "+ScoreDate+", ReasonCode1 = "+ReasonCode1+", ReasonCode2 = "+ReasonCode2+", ReasonCode3 = "+ReasonCode3+", ScoreCardName = "+ScoreCardName+", Length = "+Length+", ReasonCode4 = "+ReasonCode4+", ReasonCode4FieldLength = "+ReasonCode4FieldLength+", ScoreCardVersion = "+ScoreCardVersion+", ReasonCode2FieldLength = "+ReasonCode2FieldLength+", ReasonCode1FieldLength = "+ReasonCode1FieldLength+", ScoreName = "+ScoreName+", Score = "+Score+", ReasonCode3FieldLength = "+ReasonCode3FieldLength+"]\n\n\n";
    }
}
