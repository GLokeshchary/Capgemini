import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Assignement10Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
		StringBuilder str=new StringBuilder();
		/*for (String s : list) 
		{
			str.append(s.charAt(0));
			
			
		}*/
		//System.out.println(str);
		list.forEach(( String s)->str.append(s.charAt(0)));
		System.out.println(str);
		

	}

}
