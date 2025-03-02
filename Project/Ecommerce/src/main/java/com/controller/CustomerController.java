package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.model.BookModel;
import com.model.CustomerModel;
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		PrintWriter out=response.getWriter();
		if(action.equals("registration"))
		{
			CustomerModel cmodel=new CustomerModel();
			cmodel.setFirstname(request.getParameter("firstname"));
			cmodel.setLastname(request.getParameter("lastname"));
			cmodel.setAddress(request.getParameter("address"));
			cmodel.setCity(request.getParameter("city"));
			cmodel.setPincode(Integer.parseInt(request.getParameter("pincode")));
			cmodel.setMobno(request.getParameter("mobno"));
			cmodel.setEmail(request.getParameter("email"));
			cmodel.setPassword(request.getParameter("password"));
			
			int x=new CustomerDao().customerRegistration(cmodel);
			if(x>0)
			{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Registration successfully..')");
				out.println("window.location.href='clogin.jsp';");
				out.println("</script>");
			}
			else
			{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Registration unsuccessfully..')");
				out.println("window.location.href='cregistration.jsp';");
				out.println("</script>");
			}
		}
		else if(action.equals("login"))
		{
			CustomerModel lmodel=new CustomerModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			
			CustomerModel model=new CustomerDao().customerLogin(lmodel);
			if(model !=null)
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("model", model);
				session.setAttribute("firstname", model.getFirstname());
				session.setAttribute("lastname", model.getLastname());
				session.setAttribute("customerid", model.getCustomerid());
				response.sendRedirect("cust-home.jsp");
			}
			else
			{
				response.sendRedirect("clogin.jsp");
			}
		}
		else if(action.equals("book"))
		{
			BookModel bmodel=new BookModel();
			bmodel.setSubproductid(Integer.parseInt(request.getParameter("subproductid")));
			bmodel.setCustomerid(Integer.parseInt(request.getParameter("customerid")));
			
			Date d1=new Date();
			SimpleDateFormat s1=new SimpleDateFormat("dd/MM/YYYY");
			bmodel.setBookdate(s1.format(d1));
			bmodel.setTotalprice(Integer.parseInt(request.getParameter("totalprice")));
			
			bmodel.setBookstatus("Pending");
			bmodel.setPaymentstatus("Pending");
			
			int x=new CustomerDao().bookProduct(bmodel);
			if(x>0)
			{
				response.sendRedirect("payment.jsp?totalprice="+bmodel.getTotalprice());
			}
			
		}
	}

}
