package com.devonforce.shoaeb;

import javax.jws.WebService;

@WebService(endpointInterface="com.devonforce.shoaeb.CalWebService", 
portName="CalWebServicePort",
serviceName="CalWebService")
public class CalWebServiceImpl implements CalWebService {

	@Override
	public int add(int a, int b) {
		
		return a + b;
	}

}
