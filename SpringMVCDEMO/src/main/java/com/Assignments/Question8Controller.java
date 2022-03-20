package com.Assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Question8Controller {
	@RequestMapping(value="/i18n")
	public ModelAndView display() 
	{
		ModelAndView mv=new ModelAndView("languages");
		return mv;
		
	}
	

}
