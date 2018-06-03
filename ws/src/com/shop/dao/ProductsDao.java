package com.shop.dao;

import java.util.List;

import com.shop.my.Products;

public interface ProductsDao {

	public Products getProduct(String id);
	public List<Products> getProducts();
}
