import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int AuthorID() default 1;
	String Author();
	String Supervisior();
	String date();
	String time();
	int version();
	
}
@info(AuthorID = 10,Author = "LOKI",Supervisior = "CSE",date = "07/02/2022",time = "9:00",version = 2)
public class Assignment9Q2 {
	
	@info(AuthorID = 11,Author = "chary",Supervisior = "eCSE",date = "07/02/2022",time = "9:19",version = 3)
	private String s;
	
	@info(AuthorID = 12,Author = "Kumar",Supervisior = "ECE",date = "07/02/2022",time = "9:20",version = 3)
     private int k;
	
	@info(AuthorID = 13,Author = "method",Supervisior = "computer",date = "07/02/2022",time = "9:25",version = 4)
	public void print()
	{
		System.out.println(s+" "+k);
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException 
	{
		// TODO Auto-generated method stub
		Assignment9Q2 ass1=new Assignment9Q2();
		ass1.s="pspk";
		ass1.k=10101010;
		ass1.print();
		Class c=ass1.getClass();
		info i=(info) c.getAnnotation(info.class);
		System.out.println("---------CLASS ANNOTATIONS--------------");
		System.out.println("ID "+i.AuthorID());
		System.out.println("ID "+i.Author());
		System.out.println("ID "+i.Supervisior());
		System.out.println("ID "+i.date());
		System.out.println("ID "+i.time());
		System.out.println("ID "+i.version());
		System.out.println("-------------FIELS ANNOTATIONS-----------");
		Field f=c.getDeclaredField("s");
		info i1=f.getAnnotation(info.class);
		System.out.println("ID "+i1.AuthorID());
		System.out.println("ID "+i1.Author());
		System.out.println("ID "+i1.Supervisior());
		System.out.println("ID "+i1.date());
		System.out.println("ID "+i1.time());
		System.out.println("ID "+i1.version());
		System.out.println("-------------METHOD ANNOTATIONS-----------");
		Method m=c.getMethod("print");
		info i2=m.getAnnotation(info.class);
		System.out.println("ID "+i2.AuthorID());
		System.out.println("ID "+i2.Author());
		System.out.println("ID "+i2.Supervisior());
		System.out.println("ID "+i2.date());
		System.out.println("ID "+i2.time());
		System.out.println("ID "+i2.version());
		
		
		

	}

}
