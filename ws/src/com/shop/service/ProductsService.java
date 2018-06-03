package com.shop.service;

import java.util.List;

import com.shop.my.Products;

public interface ProductsService {

	public Products getProduct(String id) throws ProductsServiceException;
	public List<Products> getProducts();
}
