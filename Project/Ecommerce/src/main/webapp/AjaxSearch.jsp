<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%  
    String productname=request.getParameter("val");  
    if(productname==null||productname.trim().equals(""))
    {  
    	out.print("<p>Please enter name!</p>");  
    }
    else
    {  
    	try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project3to4","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from product where productname like '"+productname+"%'");  
    		ResultSet rs=ps.executeQuery();  
      		if(!rs.isBeforeFirst()) 
      		{      
     			out.println("<p>No Record Found!</p>");   
    		}
      		else
      		{  
    			/* out.print("<table border='1' cellpadding='2' width='100%'>");  
    			out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>City</th><th>State</th><th>Country</th></tr>");  
    			while(rs.next())
    			{  
    				out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");  
    			}  
    			out.print("</table>"); */  
    			 
    			while(rs.next())
    			{  
      			 out.println("<section id='blog'><div class='container'><div class='d-flex justify-content-between align-items-center'> <div>  <h6><span class='text-primary'>|</span>Product</h6> <h3 class='display-6 fw-semibold'>View Main Product</h3> </div></div>");
      		    
      		      
      		        
      		      
      		     out.println("<div class='row mt-5'><div class='col-lg-3 col-md-6 mb-4 mb-lg-0'><div class='card-item'><div class='card border-0 bg-transparent'><div class='card-image position-relative'></div></div>"); 
      		       
      		        
      		     out.println("<div class='card-body p-0 mt-2'><span class='text-capitalize text-black-50'>"+rs.getString(3) +"</span><a href='index.html'><b>"+rs.getString(2)+"</b> </a><span></span> </p> </div> </div> </div> </div></div> </section>");         
      		             
    			}    
    			
    		}  
    		con.close();  
    	}
    	catch(Exception e)
    	{
    		out.print(e);
    	}  
    }  
    %>  