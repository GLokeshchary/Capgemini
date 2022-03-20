package com.Assignments;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ZipcodeVadilation.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface ValidZipcode {
	String message() default "zipcode is not same as city;";

	public Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
