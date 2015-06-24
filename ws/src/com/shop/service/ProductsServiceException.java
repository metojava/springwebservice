package com.shop.service;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.SERVER)
public class ProductsServiceException extends Exception {

	public ProductsServiceException(String message)
	{
		
		super(message);
	}
}
