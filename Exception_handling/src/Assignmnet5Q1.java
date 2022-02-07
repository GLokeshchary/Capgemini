
public class Assignmnet5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try
		{
			 int c=a/b;
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Program Exceuted");
		}

	}

}
