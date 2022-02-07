package Collection2;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

enum Gender{Male,female};
class contact
{
	long phonenumber;
	String Name;
	String Email;
	Gender gen;
	
	public contact(long phno,String name,String email,Gender gen) 
	{
		this.phonenumber=phno;
		this.Name=name;
		this.Email=email;
		this.gen=gen;
		
	}
	public long getphno()
	{
		return phonenumber;
	}
	//override
	public String toString()
	{
		return phonenumber+" "+Name+" "+Email+" "+gen;
		
	}
	//override
}
public class Assignment8Q1 
{
	public static void main(String[] args) {
		TreeMap<Long,contact> tree=new TreeMap<Long, contact>(Collections.reverseOrder());
		contact c1=new contact(9381572080L, "chary", "loki@gmail.com", Gender.Male);
		contact c2=new contact(9885026204L, "Raju", "raju@.com", Gender.Male);
		contact c3=new contact(8121628223L, "harshitha", "kukka@gmail.com", Gender.female);
		contact c4=new contact(6302757240L, "Abhinav", "ABhi@.com", Gender.Male);
		//c1.toString();
		tree.put(c1.phonenumber, c1);
		tree.put(c2.phonenumber, c2);
		tree.put(c3.phonenumber, c3);
		tree.put(c4.phonenumber, c4);
		
		Set<Entry<Long,contact>> entry=tree.entrySet();
		for (Entry<Long, contact> e : entry) 
		{
			System.out.println(e.getKey());

			System.out.println(e.getValue());
			
			
		}
		
	}

}
