package com.rest.gateway.helper;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class GatewayHelper {
	
	public static HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);		
		return headers;
	 
	}

}
