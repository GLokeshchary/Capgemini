package main.Question6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {
	@GetMapping("/calculate/{number1}/{number2}")
	public String calcu(@PathVariable int number1,@PathVariable int number2)
	{
		int add=number1+number2;
		int sub=number1-number2;
		int multi=number1*number2;
		int div=number1/number2;
		double sqrt=Math.sqrt(number2);
		
		return "Addition "+add+" "+
				"Subtraction "+sub+" "+
				"Multiplication "+multi+" "+
				"Division "+div+" "+
				"Squareroot "+sqrt;
		
	}

}
