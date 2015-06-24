package com.shop.dao;

import com.shop.my.Products;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProductsDaoImpl pd = new ProductsDaoImpl();
		Products p = pd.getProduct("1");
		System.out.println("product" + p.getPdescr());
	}

}
