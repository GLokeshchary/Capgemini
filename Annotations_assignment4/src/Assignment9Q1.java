import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@ Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface test
{
	int value() default 10;

}
public class Assignment9Q1 {
	@test(value=21)
	public void get()
	{
		System.out.println("HEY hi i am get method");
		
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Assignment9Q1 ass=new Assignment9Q1();
		ass.get();
		Class c=ass.getClass();
		Method m=c.getMethod("get");
		test t=m.getAnnotation(test.class);
		System.out.println(t.value());

	}

}
