class something<T>
{
	T obj;
	something(T obj)
	{
		super();
		this.obj=obj;
	}
 public <T> void free()
{
	 System.out.println(obj);
	 System.out.println("HEY THIS IS GENERIC METHOD");
	}
	
}

public class Genericclass<T> {
	public static void main(String[] args) {
		Integer obj=10;
		String obj1="HI THIS LOKESHCHARY";
		something<Integer> ob=new something<>(obj);
		something<String> ob1=new something<>(obj1);
		ob.<Integer>free();
		ob1.free();
	}
}
