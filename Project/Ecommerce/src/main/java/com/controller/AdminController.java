package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.AdminDao;
import com.model.ProductModel;
import com.model.SubProductModel;
@WebServlet("/AdminController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
maxFileSize = 1024 * 1024 * 512, // 512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("login"))
		{
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			if(username.equals("admin") && password.equals("admin"))
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else
			{
				response.sendRedirect("admin/index.jsp");
			}
		}
		else if(action.equals("addproduct"))
		{
			ProductModel pmodel = new ProductModel();
			pmodel.setProductname(request.getParameter("productname"));
			pmodel.setCompanyname(request.getParameter("companyname"));
			
			String savePath = "C:\\Users\\LearnVern\\eclipse-workspace123\\Project3to4\\src\\main\\webapp\\productimage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			
			Part file=request.getPart("image");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
		   
			
			pmodel.setImage(fileName);
			
			int x = new AdminDao().addProduct(pmodel);
			if(x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else 
			{
				response.sendRedirect("admin/addnewproduct.jsp");
			}
		}
		else if(action.equals("addsubproduct"))
		{
			SubProductModel spmodel = new SubProductModel();
			spmodel.setProductid(Integer.parseInt(request.getParameter("productid")));
			spmodel.setSubproductname(request.getParameter("subproductname"));
			spmodel.setFeatures(request.getParameter("features"));
			spmodel.setPrice(request.getParameter("price"));
			
			String savePath = "C:\\Users\\LearnVern\\eclipse-workspace123\\Project3to4\\src\\main\\webapp\\productimage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			
			Part file=request.getPart("image");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
		   
			
			spmodel.setImage(fileName);
			
			int x = new AdminDao().addSubProduct(spmodel);
			if(x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else 
			{
				response.sendRedirect("admin/addsubproduct.jsp");
			}
		}
	}

}
