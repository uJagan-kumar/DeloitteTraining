package minip;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BillAmountServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public BillAmountServlet() 
    {
        super();
    
    }
    String company= null;
    
    public void init(ServletConfig config) throws ServletException 
    {
    	
    	    company =config.getInitParameter("company"); 
    	    
    	    
    }
	

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	String[] item = request.getParameterValues("items");
    	int billAmount =0;
    	response.getWriter().println("<h1>Your company name is " +company+ "<br/></h1>");
    	
		if (item == null) {
			response.getWriter().println("No items selected");
		}
		
		for(String i: item)
		{
			response.getWriter().println("You have selected " +i);
			response.getWriter().println("<br/>");
			billAmount= billAmount+10;
			
		}
		
		int totalBillAmount = billAmount;
		HttpSession session = request.getSession();
		session.setAttribute("bill",totalBillAmount );
		
		response.getWriter().println("<a href='SummaryServlet'><br/> Proceed to checkout</a>");
		
    }
    
    
   
	
	
}
