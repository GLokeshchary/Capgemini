package com.Assignments;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZipcodeVadilation implements ConstraintValidator<ValidZipcode,Long> {

	@Override
	public boolean isValid(Long value, ConstraintValidatorContext context) {
		Customer cus=new Customer();
		String city=cus.getCity();
		Boolean legit=true;
		if(city=="Hyderabad")
		{
			long zipcode=500072;
			if(value==zipcode)
			{
				return legit;
			}
			else
			{
				return legit=false;
			}
		}
		if(city=="Pune")
		{
			long zipcode=111045;
			if(value==zipcode)
			{
				return legit;
			}
			else
			{
				return legit=false;
			}
		}
		if(city=="Benguluru")
		{
			long zipcode=530068;
			if(value==zipcode)
			{
				return legit;
			}
			else
			{
				return legit=false;
			}
		}
		if(city=="Mumbai")
		{
			long zipcode=400001;
			if(value==zipcode)
			{
				return legit;
			}
			else
			{
				return legit=false;
			}
		}
		return legit;
	}
	

}
