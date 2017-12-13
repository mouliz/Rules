package com.dev.neo.model;

public class MyPojo
{
    private CreditReport CreditReport;

    public CreditReport getCreditReport ()
    {
        return CreditReport;
    }

    public void setCreditReport (CreditReport CreditReport)
    {
        this.CreditReport = CreditReport;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CreditReport = "+CreditReport+"]";
    }
}
	