package com.service2;
import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.*;

import jakarta.servlet.*;


public class GenericServletExample extends GenericServlet{  
	public void service(ServletRequest req,ServletResponse res)  
			throws IOException,ServletException{  
			  
			res.setContentType("text/html");  
			  
			PrintWriter out=res.getWriter();  
			out.print("<html><body>");  
			out.print("<b>hello generic servlet</b>"); 
			out.println("<a href='NewFile.html'><br>Home Page</b></a>");
			out.print("</body></html>");  
			  
			}  
			}