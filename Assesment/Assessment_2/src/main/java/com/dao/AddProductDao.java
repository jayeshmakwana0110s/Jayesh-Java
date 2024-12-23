package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.ProductModel;
import com.util.DBUtil;

public class AddProductDao {
	Connection cn = null;
	public int AddProductInfo(ProductModel model)
	{
		int x = 0;
		cn = new DBUtil().getConnection();
		String query = "insert into product(productName,productCategory,productModel,price,productDescription,image) values(?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = cn.prepareStatement(query);
			stmt.setString(1, model.getProductName());
			stmt.setString(2, model.getProductCategory());
			stmt.setString(3, model.getProductModel());
			stmt.setString(4, model.getPrice());
			stmt.setString(5, model.getProductDescription());
			stmt.setString(6, model.getImage());
			x = stmt.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}
