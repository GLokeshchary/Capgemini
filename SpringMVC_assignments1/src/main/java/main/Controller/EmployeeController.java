package main.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import main.Models.Employee;
import main.respository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("")
	public String homepage()
	{
		return "homepage";
	}
	
	@GetMapping("/employees")
	public String getallemployees(Model model)
	{
		return listofpage(model, 1,"empname","asc");
	}
	@GetMapping("/page/{pagenumber}")
	public String listofpage(Model model,@PathVariable int pagenumber,@Param("sortfield") String sortfield,
			                                                          @Param("sortDir") String sortDir)
	{
		Sort sort =Sort.by(sortfield);
		sort=sortDir.equals("asc")? sort.ascending() : sort.descending();
		Pageable pageable=PageRequest.of(pagenumber-1, 5,sort);
		Page<Employee> page=employeeRepository.findAll(pageable);
		List<Employee> list=page.getContent();
		long totalelements = page.getTotalElements();
		int totalpages = page.getTotalPages();
		int currentpage = pagenumber;
		model.addAttribute("totalelements", totalelements);
		model.addAttribute("totalpages", totalpages);
		model.addAttribute("currentpage", currentpage);
		model.addAttribute("list", list);
		model.addAttribute("sortfield",sortfield);
		model.addAttribute("sortDir", sortDir);
		String reversesortdir=sortDir.equals("asc")?"desc":"asc";
		model.addAttribute("reversesortdir", reversesortdir);
		return "employee";
		
	}
	@GetMapping("/employees/new")
	public String AddEmployeeform(Model model)
	{
		model.addAttribute("employee", new Employee());
		model.addAttribute("pagetitle", "Add new Employee");
		return "Addemployeeform";
	}
	@PostMapping("/employees/save")
	public String Saveemployee(Employee employee ,RedirectAttributes redirectAttributes)
	{
		employeeRepository.save(employee);
		redirectAttributes.addFlashAttribute("message", "Employee Added Successfully");
		return "redirect:/employees";
	}
	@GetMapping("/employees/edit/{id}")
	public String showeditform(@PathVariable String id,Model model)
	{
		Employee emp = employeeRepository.findById(id).get();
		model.addAttribute("employee", emp);
		model.addAttribute("pagetitle", "Edit Employee");
		return "Addemployeeform";
	}
	@GetMapping("/employees/delete/{id}")
	public String deleteemployee(@PathVariable String id)
	{
		employeeRepository.deleteById(id);
		return "redirect:/employees";
	}

}
