package RequestParam_HTMLFORM;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=Exception.class)
	  public String HandleException(Exception e)
	  {
		  System.out.println("Unknown Exception occured "+e);
		return "Exception";
		  
	  }
}
