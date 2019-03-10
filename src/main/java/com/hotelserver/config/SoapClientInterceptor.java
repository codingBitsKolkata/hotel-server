package com.hotelserver.config;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

public class SoapClientInterceptor implements ClientInterceptor {
	
	private static final Logger LOGGER = LogManager.getLogger(SoapClientInterceptor.class);

	private String requestPayload;
	private String responsePayload;
	private String completionPayload;

	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {

		SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getRequest();
		SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			soapMessage.writeTo(out);
			requestPayload = new String(out.toByteArray());
			System.err.println("requestPayload ==>> "+requestPayload);
		} catch (SOAPException | IOException e) {
			LOGGER.error("Error occurred while handling SOAP request. Error: " + e.getMessage(), e);
		}

		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {

		SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
		SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			soapMessage.writeTo(out);
			responsePayload = new String(out.toByteArray());
			System.err.println("responsePayload ==>> "+responsePayload);
		} catch (SOAPException | IOException e) {
			LOGGER.error("Error occurred while handling SOAP response. Error: " + e.getMessage(), e);
		}

		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {

		SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
		SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			soapMessage.writeTo(out);
			responsePayload = new String(out.toByteArray());
		} catch (SOAPException | IOException e) {
			LOGGER.error("Error occurred while handling SOAP fault. Error: " + e.getMessage(), e);
		}

		return true;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {

		SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
		SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			soapMessage.writeTo(out);
			completionPayload = new String(out.toByteArray());
			System.err.println("completionPayload ==>> "+completionPayload);
		} catch (SOAPException | IOException e) {
			LOGGER.error("Error occurred while handling SOAP completion. Error: " + e.getMessage(), e);
		}
	}

	public String getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(String requestPayload) {
		this.requestPayload = requestPayload;
	}

	public String getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(String responsePayload) {
		this.responsePayload = responsePayload;
	}

	public String getCompletionPayload() {
		return completionPayload;
	}

	public void setCompletionPayload(String completionPayload) {
		this.completionPayload = completionPayload;
	}
}
