package RequestParam_HTMLFORM;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ActorValidation implements ConstraintValidator<IsValidActor,String>{
	
	public String Listofactors;

	@Override
	public boolean isValid(String actor, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(actor==null)
		{
			return false;
		}
		if(actor.matches("PSPK|PB"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
