package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Welcome extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
  
    public Welcome() 
    {
        super();
    }

	
    int counter =0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		counter++;
		
		String gn = request.getParameter("guestName");
		if(gn.startsWith("a"))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("ValidServlet");
			dispatcher.include(request, response);
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("InvalidServlet");
			dispatcher.forward(request, response);
		}
		
		/*String[] colour = request.getParameterValues("colours");
		if (colour == null) {
			response.getWriter().println("No colour selected");
		}
		
		for(String c: colour)
		{
			response.getWriter().println("<br/> <font color ="+c+">Hello" +gn + " Welcome to J's website");
		}*/
		
		//response.setContentType("text/html");
		
		//response.getWriter().println("<h1>You are visitor number :" + counter);
		//response.getWriter().println("<a href='SecondServlet2'><br/> check out this cool site</a>");


	}
	
}
