import java.util.HashSet;

public class Assignment6Q1<T> 
{
	private T id;
	private T name;
	private T dept;
	public Assignment6Q1(T id,T name,T dept) 
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		
	}
	public void display()
	{
		HashSet<T> hs=new HashSet<>();
		hs.add(id);
		hs.add(name);
		hs.add(dept);
		//hs.add(1);
		for(T e:hs)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6Q1<String> str=new Assignment6Q1<String>("101", "lokesh", "cse");
		str.display();

	}

}
