package RequestParam_HTMLFORM;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy =ActorValidation.class )
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidActor
{
	//String listofactors() default "PSPK|PB";
	String message() default "Please provide valid actor;"+
                    "Accpeted are PSPK, PB(choose from these)";
	public Class<?>[] groups() default {};  
	Class<? extends Payload>[] payload() default {};
	}
