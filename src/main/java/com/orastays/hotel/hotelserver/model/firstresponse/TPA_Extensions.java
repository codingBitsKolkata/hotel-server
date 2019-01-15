package com.orastays.hotel.hotelserver.model.firstresponse;


public class TPA_Extensions
{
    private AffiliateCommission AffiliateCommission;

    private Rate Rate;

    public AffiliateCommission getAffiliateCommission ()
    {
        return AffiliateCommission;
    }

    public void setAffiliateCommission (AffiliateCommission AffiliateCommission)
    {
        this.AffiliateCommission = AffiliateCommission;
    }

    public Rate getRate ()
    {
        return Rate;
    }

    public void setRate (Rate Rate)
    {
        this.Rate = Rate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [AffiliateCommission = "+AffiliateCommission+", Rate = "+Rate+"]";
    }
}