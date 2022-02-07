
class single
{

	private static single obj;
	public String s;
	
	private single()
	{
		s="hey boss";
	}
	public static single single()
	{
		if(obj==null)
		{
			obj=new single();
		}
		return obj;
	}
	public void msg()
	{
		System.out.println("hey i am done with singketon class");
	}
	}

public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 single db =single.single();
		 single db1 =single.single();
		 single db2 =single.single();
		 single db3 =single.single();
		 System.out.println(db.hashCode());
		 System.out.println(db1.hashCode());
		 System.out.println(db2.hashCode());
		 System.out.println(db3.hashCode());
		 
		 System.out.println(db3.s);

	}

}