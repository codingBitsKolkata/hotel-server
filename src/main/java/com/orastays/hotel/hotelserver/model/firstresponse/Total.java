package com.orastays.hotel.hotelserver.model.firstresponse;



public class Total
{
    private String CurrencyCode;

    public String getCurrencyCode ()
    {
        return CurrencyCode;
    }

    public void setCurrencyCode (String CurrencyCode)
    {
        this.CurrencyCode = CurrencyCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CurrencyCode = "+CurrencyCode+"]";
    }
}
