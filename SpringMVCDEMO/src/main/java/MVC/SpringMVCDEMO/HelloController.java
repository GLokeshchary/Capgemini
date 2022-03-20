package MVC.SpringMVCDEMO;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class HelloController{
	@RequestMapping("/welcome/{countryname}/{username}")
	public ModelAndView display(@PathVariable Map<String,String> pathvars)
	{
	    String country=pathvars.get("countryname");
	    String name=pathvars.get("username");
		ModelAndView mv=new ModelAndView("NewFile");
		//mv.addObject("hey","ANNTATIONS USING ");
		return mv;
	}
	@ModelAttribute
	public void adding(Model mv)
	{
		mv.addAttribute("hey", "ANNTATIONS USING ");
	}
	@RequestMapping("/html")
	public ModelAndView display2()
	{
		/*
		 * String country=pathvars.get("countryname"); String
		 * name=pathvars.get("username");
		 */
		ModelAndView mv=new ModelAndView("NewFile");
		//mv.addObject("hey","ANNTATIONS USING qwertyuiop");
		return mv;
	}
	
	
}
