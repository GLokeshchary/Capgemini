package main.Question1_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	//Question1
	@GetMapping("/hello")
	public String display()
	{
		return "Hello World";
	}
	/*Question2*/
	@GetMapping("/user/{username}/{password}")
	public String display1(@PathVariable String username,@PathVariable String password)
	{
		String username1="lokeshchary";
		String  password1= "loki0901";
		if(username.equals(username1) && password.equals(password1))
		{
			return "valid user";
		}
		else
		{
			return "Invalid User";
		}
	}
	//Question 3
	@Autowired
	Ziprepository ziprepository;
	@GetMapping("/zipcode/{id}")
	public Optional<Zipcode> getzipcode(@PathVariable String id)
	{
		return  ziprepository.findById(id);
	}
	@PostMapping("/zipcode")
	public void addzipcode(@RequestBody Zipcode zipcode)
	{
		ziprepository.save(zipcode);
	}
	@GetMapping("/zipcode")
	public List<Zipcode> getall()
	{
		List<Zipcode> codes=new ArrayList<>();
		ziprepository.findAll().forEach(codes::add);
		return codes;
	}

}
