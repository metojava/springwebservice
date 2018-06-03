package com.shop.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.my.Products;

@Repository
public class ProductsDaoImpl implements ProductsDao {

	@Override
	public Products getProduct(String sid) {

		Products product = new Products();
		String connectionURL = "jdbc:mysql://localhost:3306/shop";

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(connectionURL, "root", "nbuser");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products where id=" + sid);

			while (rs.next()) {
				product.setPid(BigInteger.valueOf(rs.getInt(1)));
				product.setPname(rs.getString(2));
				product.setPdescr(rs.getString(3));
				product.setPprice(rs.getFloat(4));
				product.setPpicture(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return product;
	}

	@Override
	public List<Products> getProducts() {

		List<Products> products = new ArrayList<Products>();
		String connectionURL = "jdbc:mysql://localhost:3306/shop";

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(connectionURL, "root", "nbuser");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products");

			while (rs.next()) {
				Products product = new Products();
				product.setPid(BigInteger.valueOf(rs.getInt(1)));
				product.setPname(rs.getString(2));
				product.setPdescr(rs.getString(3));
				product.setPprice(rs.getFloat(4));
				product.setPpicture(rs.getString(5));
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return products;
	}

}
