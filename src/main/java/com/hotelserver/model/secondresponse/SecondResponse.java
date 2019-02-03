
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondResponse {

    @SerializedName("soap:Envelope")
    @Expose
    public SoapEnvelope soapEnvelope;

}
