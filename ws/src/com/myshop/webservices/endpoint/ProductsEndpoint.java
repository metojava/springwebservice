package com.myshop.webservices.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.myshop.webservices.getproductsservices.GetProductsRequest;
import com.myshop.webservices.getproductsservices.GetProductsResponse;
import com.shop.service.ProductsService;

@Endpoint
public class ProductsEndpoint {

	private static final String GET_TARGET_NAMESPACE = "http://com/myshop/webservices/getProductsServices";

	@Autowired
	ProductsService productsService;

	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}

	@PayloadRoot(localPart = "GetProductsRequest", namespace = GET_TARGET_NAMESPACE)
	public @ResponsePayload
	GetProductsResponse getProductsDetails(
			@RequestPayload GetProductsRequest request) {
		System.out.println("Get User !");
		GetProductsResponse response = new GetProductsResponse();
		try {
			response.setProductsDetails(productsService.getProduct(request
					.getPid()));
		} catch (Exception ex) {

			ex.printStackTrace();
		}
		return response;
	}

}
