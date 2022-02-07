class Login{
    String userId = "chary",password = "password";
    int count=0;
    public void loginUser(String user, String pass) 
    {
    	String sc1="Welcome"+userId;
    	
		if((user==userId)&&(password==pass))
		{
			System.out.println(sc1);
		}
		else
		{
			System.out.println("invalid userbname or password");
			count+=1;
			if(count==3)
			{
				System.out.println("contact admin");
			}
		}
		
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lg=new Login();
		lg.loginUser("chary", "passwor");
		lg.loginUser("chary0", "passwod");
		lg.loginUser("chary1", "passwrd");
		lg.loginUser("chary", "password");
	

	}

}
