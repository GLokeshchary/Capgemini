package main.Question7_8_9.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.Question7_8_9.Controllers.repositories.CustomerRepository;
import main.Question7_8_9.models.Customer;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;
	@GetMapping("/customers")
	public List<Customer> getallcustomers()
	{
		return customerRepository.findAll();
	}
	/*@GetMapping("/customers/{customerid}")
	public Optional<Customer> getcustomer(@PathVariable Integer customerid)
	{
		return customerRepository.findById(customerid);
		
	}*/
	@PostMapping("/customers")
	public void addcustomers(@RequestBody Customer customer)
	{
		customerRepository.save(customer);
	}
	@PutMapping("/customers/{customerid}")
	public void updatecustomer(@RequestBody Customer customer,@PathVariable Integer customerid)
	{
		customerRepository.save(customer);
	}
	@DeleteMapping("/customers/{customerid}")
	public void deletecustomer(@PathVariable Integer customerid)
	{
		customerRepository.deleteById(customerid);
	}
	@GetMapping("/customers/{customerfirstname}")
	public Optional<Customer> getcusbyname(@PathVariable String customerfirstname)
	{
		return customerRepository.findByFirstName(customerfirstname);
	}
	@GetMapping("/getcustomer/{productname}")
	public List<Customer> getbycity(@PathVariable String productname)
	{
		return customerRepository.findByProductName(productname);
	}
	@GetMapping("/customers/page")
	public Map<String, Object> Getallemployeesinpage(@RequestParam(name = "pageno",defaultValue = "0") int pageno,
			                                         @RequestParam(name = "pagesize",defaultValue = "2") int pagesize,
			                                         @RequestParam(name = "sortby",defaultValue = "0") String sortby)
	{
		 Map<String, Object> response=new HashMap<>();
		 Sort sort=Sort.by(sortby);
		 Pageable pageable=PageRequest.of(pageno, pagesize, sort);
		 Page<Customer> customerpage=customerRepository.findAll(pageable);
		 response.put("data", customerpage.getContent());
		 response.put("Total no of Pages", customerpage.getTotalPages());
		 response.put("Total no of elements", customerpage.getTotalElements());
		 response.put("Get Current Pageno", customerpage.getNumber());
		return response;
	}
	//Query method 1//QueryExample
	@GetMapping("/customers/example")
	public List<Customer> getallbyexamples(@RequestBody Customer customer)
	{
		Example<Customer> example=Example.of(customer);
		return customerRepository.findAll(example);
	}

	
	
}
