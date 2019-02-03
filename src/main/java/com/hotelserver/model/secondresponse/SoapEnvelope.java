
package com.hotelserver.model.secondresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoapEnvelope {

    @SerializedName("xmlns:soap")
    @Expose
    public String xmlnsSoap;
    @SerializedName("soap:Body")
    @Expose
    public SoapBody soapBody;

}
