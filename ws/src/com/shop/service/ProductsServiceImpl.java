package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ProductsDao;
import com.shop.my.Products;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	ProductsDao productsDao;

	public void setProductsDao(ProductsDao productsDao) {
		this.productsDao = productsDao;
	}

	@Override
	public Products getProduct(String id) throws ProductsServiceException {

		Products prod = productsDao.getProduct(id);
		return prod;
	}

	@Override
	public List<Products> getProducts() {
		List<Products> products = productsDao.getProducts();
		return products;
	}

}
