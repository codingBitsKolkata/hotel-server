package com.hotelserver.model.firstresponse;



public class Taxes
{
    private String Amount;

    public String getAmount ()
    {
        return Amount;
    }

    public void setAmount (String Amount)
    {
        this.Amount = Amount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Amount = "+Amount+"]";
    }
}
