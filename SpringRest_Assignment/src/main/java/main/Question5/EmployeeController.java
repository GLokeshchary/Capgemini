package main.Question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@PostMapping("/employees")
	public void addemployee(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
	}
	@GetMapping("/employees/{id}")
	public Optional<Employee> getemp(@PathVariable String id)
	{
		return employeeRepository.findById(id);
	}
	@DeleteMapping("/employees/{id}")
	public void deleteemp(String id)
	{
		employeeRepository.deleteById(id);
	}
	@GetMapping("/employees")
	public List<Employee> getall()
	{
		List<Employee> list=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(list::add);
		return list;
	}
	@PutMapping("/employees/{id}")
	public String update(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		return "updated";
	}

}
