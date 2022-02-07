package Collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment8Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		ArrayList<Integer> list=new  ArrayList<Integer>();
		for (int i = 1; i <=10; i++)
		{
			list.add(i);
			
		}
		set.addAll(list);
		set.add(2);
		set.add(3);
		System.out.println(set);

	}

}
