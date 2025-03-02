package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.BookModel;
import com.model.CustomerModel;
import com.util.DBUtil;

public class CustomerDao 
{
	Connection cn=null;
	
	public int customerRegistration(CustomerModel rmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into customer(firstname,lastname,address,city,pincode,mobno,email,password) values(?,?,?,?,?,?,?,?)";
		
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getAddress());
			st.setString(4, rmodel.getCity());
			st.setInt(5, rmodel.getPincode());
			st.setString(6, rmodel.getMobno());
			st.setString(7, rmodel.getEmail());
			st.setString(8, rmodel.getPassword());
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	public CustomerModel customerLogin(CustomerModel lmodel)
	{
		CustomerModel model=null;
		cn=new DBUtil().getConnectionData();
		String qry="select * from customer where email=? and password=?";
		
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new CustomerModel();
				model.setCustomerid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setAddress(rs.getString(4));
				model.setCity(rs.getString(5));
				model.setPincode(rs.getInt(6));
				model.setMobno(rs.getString(7));
				model.setEmail(rs.getString(8));
				model.setPassword(rs.getString(9));
			}
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public String getSubProductName(int subproductid)
	{
		String subproductname=null;
		cn=new DBUtil().getConnectionData();
		String qry="select * from subproduct where subproductid=?";
		
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, subproductid);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				subproductname=rs.getString(3);
			}
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return subproductname;
	}
	public int bookProduct(BookModel bmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into book(subproductid,customerid,bookdate,totalprice,bookstatus,paymentstatus) values(?,?,?,?,?,?)";
		
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, bmodel.getSubproductid());
			st.setInt(2, bmodel.getCustomerid());
			st.setString(3, bmodel.getBookdate());
			st.setInt(4, bmodel.getTotalprice());
			st.setString(5, bmodel.getBookstatus());
			st.setString(6, bmodel.getPaymentstatus());
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}
