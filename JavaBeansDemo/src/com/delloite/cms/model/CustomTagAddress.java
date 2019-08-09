package com.delloite.cms.model;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport 
{
	public int doStartTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h2>Address of deloitte</h2>");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
