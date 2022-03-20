package com.Assignments;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ContactValidation  implements ConstraintValidator<ValidContact,String>{

	//("^[0-9]{10,12}$")])
	

	@Override
	public boolean isValid(String contactField, ConstraintValidatorContext context) {
		return contactField != null && contactField.matches("[0-9]+")
		          && (contactField.length() > 8) && (contactField.length() < 14);
	}

}
