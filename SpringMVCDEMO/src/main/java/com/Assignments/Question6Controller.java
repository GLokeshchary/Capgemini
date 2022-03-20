package com.Assignments;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Question6Controller {
	@RequestMapping(value = "/register",method = RequestMethod.GET )
	public ModelAndView display()
	{
		ModelAndView mv=new ModelAndView("register");
		return mv;
	}
	@RequestMapping(value = "/show",method = RequestMethod.POST)
	public ModelAndView display1(@Valid @ModelAttribute("cus") Customer cus,BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView mv=new ModelAndView("register");
			return mv;
			
		}
		ModelAndView mv=new ModelAndView("registerdetails");
		return mv;
		
		
	}

}
