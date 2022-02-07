

public class Assignment5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try
		{
			 int c=a/b;
			 UnsupportedOperationException b1 =new UnsupportedOperationException("OPERATION NOT SUPPORTED");
			 throw b1;
			 
			
			
		}
		catch(UnsupportedOperationException b1)
		{
			System.out.println("Division by Zero");
			//e.printStackTrace();
		}
		finally {
			System.out.println("Program Exceuted");
		}
		


	}
	

}
