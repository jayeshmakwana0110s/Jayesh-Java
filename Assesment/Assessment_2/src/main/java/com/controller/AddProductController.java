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

import com.dao.AddProductDao;
import com.model.ProductModel;

@WebServlet("/AddProductController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
maxFileSize = 1024 * 1024 * 512, // 512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB

public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddProductController() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductModel model = new ProductModel();
	    model.setProductName(request.getParameter("productname"));
	    model.setProductCategory(request.getParameter("productcategory"));
	    model.setProductModel(request.getParameter("productmodel"));
	    model.setPrice(request.getParameter("price"));
	    model.setProductDescription(request.getParameter("productdescription"));

	    String savePath = "C:\\Pawor2\\Ecommerce_ASS\\src\\main\\webapp\\productimage";
	    File fileSaveDir = new File(savePath);
	    if (!fileSaveDir.exists()) {
	        fileSaveDir.mkdir();
	    }

	    Part file = request.getPart("image"); // Fixed parameter name
	    String fileName = extractfilename(file);
	    file.write(savePath + File.separator + fileName);

	    model.setImage(fileName);
	    int x = new AddProductDao().AddProductInfo(model);
	    if (x > 0) {
	        request.setAttribute("msg", "Product added successfully!");
	        request.getRequestDispatcher("index.jsp").forward(request, response);
	    } else {
	        request.setAttribute("msg", "Failed to add product.");
	        request.getRequestDispatcher("addproduct.jsp").forward(request, response);
	    }
	}

}
