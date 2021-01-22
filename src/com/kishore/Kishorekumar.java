package com.kishore;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Kishorekumar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized and redirected to welcome.jsp page");
    }
 
    public void processRequest(HttpServletRequest a, HttpServletResponse b) throws ServletException, IOException 
	{
		b.setContentType("text/html");
        try (PrintWriter out = b.getWriter()) {
          try {
            RequestDispatcher view = a.getRequestDispatcher("welcome.jsp");
            view.forward(a,b);
			  }
	      finally {
            out.close();
            }
        }
        
    }
    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}



