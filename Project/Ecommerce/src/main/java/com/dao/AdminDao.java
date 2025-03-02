package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.ProductModel;
import com.model.SubProductModel;
import com.util.DBUtil;

public class AdminDao {
	Connection cn =null;
	
	public int addProduct(ProductModel pmodel)
	{
		int x = 0;
		cn = new DBUtil().getConnectionData();
		String qry = "insert into product(productname,companyname,image) values(?,?,?)";
		try 
		{	
			PreparedStatement st = cn.prepareStatement(qry);
			st.setString(1, pmodel.getProductname());
			st.setString(2, pmodel.getCompanyname());
			st.setString(3, pmodel.getImage());
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}
	
	public int addSubProduct(SubProductModel spmodel)
	{
		int x = 0;
		cn = new DBUtil().getConnectionData();
		String qry = "insert into subproduct(productid,subproductname,features,price,image) values(?,?,?,?,?)";
		try 
		{	
			PreparedStatement st = cn.prepareStatement(qry);
			st.setInt(1, spmodel.getProductid());
			st.setString(2, spmodel.getSubproductname());
			st.setString(3, spmodel.getFeatures());
			st.setString(4, spmodel.getPrice());
			st.setString(5, spmodel.getImage());
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}
}