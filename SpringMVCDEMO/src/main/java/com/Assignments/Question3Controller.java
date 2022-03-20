package com.Assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Question3Controller {
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView display()
	{
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping(value="/details",method = RequestMethod.POST)
	public ModelAndView display1(@ModelAttribute("log") login log)
	{
		boolean b=true;
		System.out.println(b);
		if(b==true)
		{
			ModelAndView mv=new ModelAndView("Success");
			return mv;
		}
		else
		{
			ModelAndView mv=new ModelAndView("Error");
			return mv;
			
		}
		
	}

}
