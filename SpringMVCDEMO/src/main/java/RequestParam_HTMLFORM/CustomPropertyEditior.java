package RequestParam_HTMLFORM;


import java.beans.PropertyEditorSupport;

public class CustomPropertyEditior extends PropertyEditorSupport {

	@Override
	public void setAsText(String username) throws IllegalArgumentException {
		if(username.contains("Mr.") || username.contains("Mrs."))
		{
			setValue(username);
		}
		else
		{
			username="Mr."+username;
			setValue(username);
		}
		
		
	}

	

}
