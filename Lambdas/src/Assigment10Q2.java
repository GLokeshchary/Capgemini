
import java.util.ArrayList;
import java.util.List;

interface List1
{
	public   List<Assigment10Q2> listOforders(ArrayList<Assigment10Q2> list);
	}



public class Assigment10Q2 {
	private  int totalprice;
	private String status;

	public Assigment10Q2(int totalprice, String status) {
		//super();
		this.totalprice = totalprice;
		this.status = status;
	}
	public static  ArrayList<Assigment10Q2> listOfOrders(ArrayList<Assigment10Q2> orders) 
	{
		orders.add(new Assigment10Q2(1000, "Accpeted"));
		orders.add(new Assigment10Q2(2000, "Completed"));
		orders.add(new Assigment10Q2(3000, "Completed"));
		return orders;
	}
	public String toString()
	{
		return totalprice+" "+status;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Assigment10Q2 ass1=new  Assigment10Q2(1000, "Accpeted");
		
		list1.add(ass1);*/
		ArrayList<Assigment10Q2> list1=new ArrayList<>();
		System.out.println("BEFORE RESTRICTIONS----------------------");
		System.out.println(listOfOrders(list1));
		System.out.println("AFTER RESTRICTIONS----------------------");
		/*for (Assigment10Q2 assigment10q2 : list1) 
		{
			if(assigment10q2.totalprice>1000 && (assigment10q2.status.equals("Accpeted") || assigment10q2.status.equals("Completed")))
					{
				System.out.println(assigment10q2);
				
					}
			
		}*/
		list1.forEach(a->{if(a.totalprice>1000 && (a.status.equals("Accpeted") || a.status.equals("Completed")))
					{
				System.out.println(a);
				
					}}
		);
	
		

	}

}
