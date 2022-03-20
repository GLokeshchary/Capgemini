package com.Assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Question1Controller {
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public ModelAndView display2()
	{
		ModelAndView  model=new ModelAndView("index1");
		return model;
		
	}
	@RequestMapping("/question1")
	public ModelAndView display()
	{
		ModelAndView  model=new ModelAndView("question_1");
		return model;
	}

}
