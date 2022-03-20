package com.Assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Question2Controller {
	
	@RequestMapping(value = "/simple", method = RequestMethod.GET)
	public ModelAndView display1()
	{
		ModelAndView model=new ModelAndView("SimpleInterestForm");
		return model;
	}
	
	
	
	@RequestMapping(value = "/simplesubmit",method = RequestMethod.POST)
	public ModelAndView display(@ModelAttribute("simple") simpleinterest si)
	{
		int cal=si.calculate();
		
		ModelAndView model = new ModelAndView("SimpleInterest");
		model.addObject("cal",cal);
		
		return model;
	}

}
