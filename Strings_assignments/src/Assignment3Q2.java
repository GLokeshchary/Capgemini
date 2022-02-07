import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment3Q2 {
	public void Select()
	{
		int a=1;
		int b=2;
		int c=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
		int select=sc.nextInt();
		 int count=0;
		int prices[];
		ArrayList<Integer> array=new ArrayList<>();
		if(select==a)
		{
			System.out.println("Insert "+(count=+1)+"st price");
			int price=sc.nextInt();
			array.add(price);
			System.out.println("Price has been saved to the file");
			
		}
		else if(select==b)
		{
			double sum = 0;
			for(int i1 = 0; i1 < array.size(); i1++)
			    sum += array.get(i1);
			
			System.out.println(sum);
		}
		else if(select==c)
		{
			System.out.println("Exit program");
		}
		else
			
		{
			System.out.println("Enter only 1 and 2 And 3 values.");
		}
	}
	public static void main(String[] args) 
	{
		Assignment3Q2 ass11=new Assignment3Q2();
		Scanner sc12=new Scanner(System.in);
		ass11.Select();
		System.out.println("Do you want to enter price for more items? (Yes/No)");
		String y_N=sc12.next();
		if(y_N=="Yes" || y_N=="y")
		{
			ass11.Select();
		}
		else
		{
			//System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
			ass11.Select();

			
		}
		
	}

}
