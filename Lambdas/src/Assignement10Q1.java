
interface opera
{
	double operations(int a,int b);
	}
public class Assignement10Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opera addition=(int a,int b) -> (a+b);
		System.out.println("add "+addition.operations(13, 5));
		
		opera multi=(int a ,int b) ->(a*b);
		System.out.println("multi "+multi.operations(13, 5));
		
		opera divi=(int a,int b)->(a/b);
		System.out.println("division "+divi.operations(13, 5));
		
		opera sub=(int a,int b)->(a-b);
		System.out.println("subtraction "+sub.operations(13, 5));

	}

}
