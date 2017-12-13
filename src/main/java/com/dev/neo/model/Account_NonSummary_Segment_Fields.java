package com.dev.neo.model;

import javax.xml.bind.annotation.XmlElement;

public class Account_NonSummary_Segment_Fields
{
	@XmlElement
    private String CashLimitFieldLength;//

	@XmlElement
    private String CurrentBalanceFieldLength;
	@XmlElement
    private String AmountOverdue;//
	@XmlElement
    private String ReportingMemberShortName;
	@XmlElement
    private String CashLimit;//
	@XmlElement
    private String PaymentHistory1FieldLength;//
	@XmlElement
    private String PaymentHistory2;//
    @XmlElement
    private String ReportingMemberShortNameFieldLength;
    @XmlElement
    private String HighCreditOrSanctionedAmountFieldLength;
    @XmlElement
    private String PaymentHistory2FieldLength;//
    @XmlElement
    private String PaymentHistory1;
    @XmlElement
    private String AmountOverdueFieldLength;//
    @XmlElement
    private String CreditLimitFieldLength;//
    @XmlElement
    private String DateReportedAndCertified;
    @XmlElement
    private String OwenershipIndicator;
    @XmlElement
    private String CurrentBalance;
    @XmlElement
    private String DateOpenedOrDisbursed;
    @XmlElement
    private String DateOfLastPayment;//
    @XmlElement
    private String PaymentHistoryStartDate;
    @XmlElement
    private String PaymentHistoryEndDate;
    @XmlElement
    private String HighCreditOrSanctionedAmount;
    @XmlElement
    private String AccountType;
    @XmlElement
    private String CreditLimit;//
    
    
    @XmlElement
    private String DateClosed;//
    
    
    public String getDateClosed() {
		return DateClosed;
	}

	public void setDateClosed(String dateClosed) {
		DateClosed = dateClosed;
	}

	public String getCashLimitFieldLength ()
    {
        return CashLimitFieldLength;
    }

    public void setCashLimitFieldLength (String CashLimitFieldLength)
    {
        this.CashLimitFieldLength = CashLimitFieldLength;
    }

    public String getCurrentBalanceFieldLength ()
    {
        return CurrentBalanceFieldLength;
    }

    public void setCurrentBalanceFieldLength (String CurrentBalanceFieldLength)
    {
        this.CurrentBalanceFieldLength = CurrentBalanceFieldLength;
    }

    public String getAmountOverdue ()
    {
    	
    	if(AmountOverdue==null) return "0";
    	
    	
    	else return AmountOverdue;
    }

    public void setAmountOverdue (String AmountOverdue)
    {
        this.AmountOverdue = AmountOverdue;
    }

    public String getReportingMemberShortName ()
    {
        return ReportingMemberShortName;
    }

    public void setReportingMemberShortName (String ReportingMemberShortName)
    {
        this.ReportingMemberShortName = ReportingMemberShortName;
    }

    public String getCashLimit ()
    {
        return CashLimit;
    }

    public void setCashLimit (String CashLimit)
    {
        this.CashLimit = CashLimit;
    }

    public String getPaymentHistory1FieldLength ()
    {
        return PaymentHistory1FieldLength;
    }

    public void setPaymentHistory1FieldLength (String PaymentHistory1FieldLength)
    {
        this.PaymentHistory1FieldLength = PaymentHistory1FieldLength;
    }

    public String getPaymentHistory2 ()
    {
        return PaymentHistory2;
    }

    public void setPaymentHistory2 (String PaymentHistory2)
    {
        this.PaymentHistory2 = PaymentHistory2;
    }

    public String getReportingMemberShortNameFieldLength ()
    {
        return ReportingMemberShortNameFieldLength;
    }

    public void setReportingMemberShortNameFieldLength (String ReportingMemberShortNameFieldLength)
    {
        this.ReportingMemberShortNameFieldLength = ReportingMemberShortNameFieldLength;
    }

    public String getHighCreditOrSanctionedAmountFieldLength ()
    {
        return HighCreditOrSanctionedAmountFieldLength;
    }

    public void setHighCreditOrSanctionedAmountFieldLength (String HighCreditOrSanctionedAmountFieldLength)
    {
        this.HighCreditOrSanctionedAmountFieldLength = HighCreditOrSanctionedAmountFieldLength;
    }

    public String getPaymentHistory2FieldLength ()
    {
        return PaymentHistory2FieldLength;
    }

    public void setPaymentHistory2FieldLength (String PaymentHistory2FieldLength)
    {
        this.PaymentHistory2FieldLength = PaymentHistory2FieldLength;
    }

    public String getPaymentHistory1 ()
    {
        return PaymentHistory1;
    }

    public void setPaymentHistory1 (String PaymentHistory1)
    {
        this.PaymentHistory1 = PaymentHistory1;
    }

    public String getAmountOverdueFieldLength ()
    {
        return AmountOverdueFieldLength;
    }

    public void setAmountOverdueFieldLength (String AmountOverdueFieldLength)
    {
        this.AmountOverdueFieldLength = AmountOverdueFieldLength;
    }

    public String getCreditLimitFieldLength ()
    {
        return CreditLimitFieldLength;
    }

    public void setCreditLimitFieldLength (String CreditLimitFieldLength)
    {
        this.CreditLimitFieldLength = CreditLimitFieldLength;
    }

    public String getDateReportedAndCertified ()
    {
        return DateReportedAndCertified;
    }

    public void setDateReportedAndCertified (String DateReportedAndCertified)
    {
        this.DateReportedAndCertified = DateReportedAndCertified;
    }

    public String getOwenershipIndicator ()
    {
        return OwenershipIndicator;
    }

    public void setOwenershipIndicator (String OwenershipIndicator)
    {
        this.OwenershipIndicator = OwenershipIndicator;
    }

    public String getCurrentBalance ()
    {
        return CurrentBalance;
    }

    public void setCurrentBalance (String CurrentBalance)
    {
        this.CurrentBalance = CurrentBalance;
    }

    public String getDateOpenedOrDisbursed ()
    {
        return DateOpenedOrDisbursed;
    }

    public void setDateOpenedOrDisbursed (String DateOpenedOrDisbursed)
    {
        this.DateOpenedOrDisbursed = DateOpenedOrDisbursed;
    }

    public String getDateOfLastPayment ()
    {
        return DateOfLastPayment;
    }

    public void setDateOfLastPayment (String DateOfLastPayment)
    {
        this.DateOfLastPayment = DateOfLastPayment;
    }

    public String getPaymentHistoryStartDate ()
    {
        return PaymentHistoryStartDate;
    }

    public void setPaymentHistoryStartDate (String PaymentHistoryStartDate)
    {
        this.PaymentHistoryStartDate = PaymentHistoryStartDate;
    }

    public String getPaymentHistoryEndDate ()
    {
        return PaymentHistoryEndDate;
    }

    public void setPaymentHistoryEndDate (String PaymentHistoryEndDate)
    {
        this.PaymentHistoryEndDate = PaymentHistoryEndDate;
    }

    public String getHighCreditOrSanctionedAmount ()
    {
    	
    	if(HighCreditOrSanctionedAmount==null) return "0";
        return HighCreditOrSanctionedAmount;
    }

    public void setHighCreditOrSanctionedAmount (String HighCreditOrSanctionedAmount)
    {
        this.HighCreditOrSanctionedAmount = HighCreditOrSanctionedAmount;
    }

    public String getAccountType ()
    {
        return AccountType;
    }

    public void setAccountType (String AccountType)
    {
        this.AccountType = AccountType;
    }

    public String getCreditLimit ()
    {
    	if(CreditLimit==null) return "0";
    	else return CreditLimit;
    }

    public void setCreditLimit (String CreditLimit)
    {
        this.CreditLimit = CreditLimit;
    }

	@Override
	public String toString() {
		return "Account_NonSummary_Segment_Fields [CashLimitFieldLength=" + CashLimitFieldLength
				+ ", CurrentBalanceFieldLength=" + CurrentBalanceFieldLength + ", AmountOverdue=" + AmountOverdue
				+ ", ReportingMemberShortName=" + ReportingMemberShortName + ", CashLimit=" + CashLimit
				+ ", PaymentHistory1FieldLength=" + PaymentHistory1FieldLength + ", PaymentHistory2=" + PaymentHistory2
				+ ", ReportingMemberShortNameFieldLength=" + ReportingMemberShortNameFieldLength
				+ ", HighCreditOrSanctionedAmountFieldLength=" + HighCreditOrSanctionedAmountFieldLength
				+ ", PaymentHistory2FieldLength=" + PaymentHistory2FieldLength + ", PaymentHistory1=" + PaymentHistory1
				+ ", AmountOverdueFieldLength=" + AmountOverdueFieldLength + ", CreditLimitFieldLength="
				+ CreditLimitFieldLength + ", DateReportedAndCertified=" + DateReportedAndCertified
				+ ", OwenershipIndicator=" + OwenershipIndicator + ", CurrentBalance=" + CurrentBalance
				+ ", DateOpenedOrDisbursed=" + DateOpenedOrDisbursed + ", DateOfLastPayment=" + DateOfLastPayment
				+ ", PaymentHistoryStartDate=" + PaymentHistoryStartDate + ", PaymentHistoryEndDate="
				+ PaymentHistoryEndDate + ", HighCreditOrSanctionedAmount=" + HighCreditOrSanctionedAmount
				+ ", AccountType=" + AccountType + ", CreditLimit=" + CreditLimit + "]\n\n\n";
	}

 

}
