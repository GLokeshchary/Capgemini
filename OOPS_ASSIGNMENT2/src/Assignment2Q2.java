
import java.util.ArrayList;
import java.util.Collections;

class Manager extends Assignment2Q2 
{
    @Override
    public int getSalary(int salary) 
    {
        int incentive = 5000;
		return incentive+salary;
    }
}

class Labour extends Assignment2Q2 
{
    @Override
    public int getSalary(int salary)
    {
        int overtime = 500;
		return overtime+salary;
    }
}


public class Assignment2Q2 
{
	 public int getSalary(int salary)
	    {
			return salary;
			}
	public static void main(String[] args) {
		
		int salary = 10000;
		Assignment2Q2 ass2=new Assignment2Q2();
		Manager mang1= new Manager();
		Labour lab =new Labour();
		/*int mang1salary = mang1.getSalary(salary);
		int labou = lab.getSalary(salary);
		System.out.println(mang1salary);
		System.out.println(labou);*/
		ArrayList<Integer> employee=new ArrayList<>();
		
		employee.add(lab.getSalary(salary));
		employee.add(mang1.getSalary(salary));
		int sum =0;
		for(int i:employee)
		{
			sum=sum+i;
		}
		System.out.println("total salaries $"+sum);
		
	}
	    
	   
	 
}

