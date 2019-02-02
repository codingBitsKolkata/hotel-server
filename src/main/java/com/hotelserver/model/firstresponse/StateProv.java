package com.hotelserver.model.firstresponse;


public class StateProv
{
    private String StateCode;

    public String getStateCode ()
    {
        return StateCode;
    }

    public void setStateCode (String StateCode)
    {
        this.StateCode = StateCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [StateCode = "+StateCode+"]";
    }
}

