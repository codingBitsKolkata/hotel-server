package com.hotelserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

@Configuration
public class SoapConfig {

	@Value("${yatra.url}")
	private String yatraURL;
	
	@Value("${package.path}")
	private String packagePath;
	
	@Bean
	public Jaxb2Marshaller marshaller() {

		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(packagePath);
		return marshaller;
	}

	@Bean
	public SoapClientInterceptor soapClientInterceptor() {
		return new SoapClientInterceptor();
	}

	@Bean
	public SearchClient searchClient(Jaxb2Marshaller marshaller) {

		SearchClient client = new SearchClient();
		client.setDefaultUri(yatraURL);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		client.setInterceptors(new ClientInterceptor[] { soapClientInterceptor() });
		return client;
	}
}
