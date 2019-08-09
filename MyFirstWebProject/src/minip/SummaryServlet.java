package minip;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SummaryServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public SummaryServlet() 
    {
        super();
    }
    
    String company= null;
    
    public void init(ServletConfig config) throws ServletException 
    {
    	
    	    ServletContext context = config.getServletContext();
    	    company =context.getInitParameter("company"); 
    	    
    	    
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		response.getWriter().println("<h1>Your company name is " +company+ "<br/></h1>");
		HttpSession session = request.getSession();
		int bill = (Integer)session.getAttribute("bill");
		String username = (String) session.getAttribute("username");
		response.getWriter().println("<h1>Thanks for shopping " +username+ ".<br/>"+ "Your total bill amount is " +bill+ "</h1>");
		
	}

}
