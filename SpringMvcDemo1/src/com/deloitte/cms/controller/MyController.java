package com.deloitte.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	
	/*@RequestMapping("/addCustomer")
	public String ssds()
	{
		return "addCustomer";
	}
	@RequestMapping("/updateCustomer")
	public String ssdf()
	{
		return "updateCustomer";
	}
	@RequestMapping("/deleteCustomer")

	public String ssdg()
	{
		return "deleteCustomer";
	}
	@RequestMapping("/findCustomerById")

	public String ssgs()
	{
		return "findCustomerById";
	}
	@RequestMapping("/findAllCustomer")

	public String ssos()
	{
		return "findAllCustomer";
	}*/
	@RequestMapping("/doSome")

	public ModelAndView ssd() {
		ModelAndView view = new ModelAndView();
		view.addObject("message", "did you get the message");
		view.setViewName("sayHello");
		return view;
	}
}
