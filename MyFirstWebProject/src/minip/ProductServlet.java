package minip;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ProductServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ProductServlet() 
    {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String gn= request.getParameter("guestName");
		HttpSession session = request.getSession();
		session.setAttribute("username", gn);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Second.html");
		dispatcher.forward(request, response);
	}

}
