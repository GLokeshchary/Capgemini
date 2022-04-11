package main.resource;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Value("${my.greeting:Defaultvalue}")
	private String greetingmessage;
	
	@Value("Some STring")
	private String some;
	
	/*@Value("${my.list.values}")
	private List<String> listvalues;*/
	
	/*@Value("#{${dbvalues}}")
	private Map<String, String> dbvalues;*/
	
	@Autowired
	private DbSettings dbSettings;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/greet")
	public String greeting() 
	{
		return greetingmessage;
	}
	@GetMapping("/greet2")
	public String greeting2() 
	{
		return dbSettings.getConnection()+dbSettings.getHost()+dbSettings.getPort();
	}
	
	@GetMapping("/envdetails")
	public String envDetails() {
		return environment.toString();
	}

}
