import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment10Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Remove the words that have odd lengths from the list";
		String str[]=s.split(" ");
		List<String> list=new ArrayList<String>();
		list.add("loki");
		list.add("hary");
		list.add("pspk");
		//ListIterator<String> itr=list.listIterator();
		/*while(itr.hasNext())
		{
			String s1=itr.next();
			if(s1.length()%3==0)
			{
				itr.remove();
				
			}
		}
		
		System.out.println(list);*/
		list.removeIf(t-> (t.length()%3==0));
		System.out.println(list);

	}

}
