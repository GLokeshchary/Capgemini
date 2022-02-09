import java.util.function.*;
public class Assignment10Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable modify=()-> System.out.println("MODIFIER");
		modify.run();
		
		Supplier<Double> product=()-> Math.random();
		System.out.println(product.get());
		
		Consumer<Integer> display=(a)-> System.out.println(a);
		display.accept(15);
		
		
		

	}

}
