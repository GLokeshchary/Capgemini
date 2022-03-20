package RequestParam_HTMLFORM;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class Form {
	
	
	 @InitBinder
	  public void notdiplayfilednames(WebDataBinder binder)
	  {
		  //binder.setDisallowedFields(new String[] {"phno","add.pin"});
		  SimpleDateFormat dateformat=new SimpleDateFormat("yyyy**mm**dd");
		  binder.registerCustomEditor(Date.class, "DOB",new CustomDateEditor(dateformat, false));
		  binder.registerCustomEditor(String.class,	"username", new CustomPropertyEditior());
		  
	  }
	 
	@RequestMapping(value="/Admission",method = RequestMethod.GET)
	public ModelAndView display() throws Exception
	{
		ModelAndView mv=new ModelAndView("Admission");
		return mv;
		
	}
	@ModelAttribute
	public void adding(Model model)
	{
		model.addAttribute("msg","CHOOSING YOUR FAVOURITE ACTOR");
	}
	
	  @RequestMapping(value="/submit.html",method = RequestMethod.POST) 
	  public ModelAndView display1(@Valid @ModelAttribute("student1") Student student,BindingResult result) 
	  { 
		  if(result.hasErrors())
		  {
			  ModelAndView mv=new ModelAndView("Admission");
			  return mv;
			  
		  }
		  ModelAndView mv=new ModelAndView("submit");
	       return mv;
	  
	  }
	  @ResponseBody
	  @GetMapping("/students")
	  public List<Student> getstudents()
	  {
		  Student s1=new Student();
		  Student s2=new Student();
		  Student s3=new Student();
		  s1.setUsername("lokeshhary");
		  s2.setUsername("Ananth");
		  s3.setUsername("sanchit");
		  List<Student> list=new ArrayList<>();
		  list.add(s3);
		  list.add(s2);
		  list.add(s1);
		  return list;
		  
	  }
	  
	 
	 
}
