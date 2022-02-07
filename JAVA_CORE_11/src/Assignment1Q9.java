class Students
{
	 public int totalMarks(int marks1,int marks2,int marks3)
	 {
		 int sum=marks1+marks2+marks3;
		 return sum;
	 }
	 public double AvgMarks(int marks1,int marks2,int marks3) 
	 {
		 double avg=(marks1+marks2+marks3)/3;
		 return avg;
	 }
	
	
	
}
class studentA extends Students
{
	
	}

public class Assignment1Q9
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Students s1=new Students();
		studentA s2=new studentA();
		int total=s1.totalMarks(10, 20, 30);
		double avg=s1.AvgMarks(10,20,30);
		System.out.println(total);
		System.out.println(avg);
		

	}

}
