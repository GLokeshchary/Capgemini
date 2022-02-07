
public class Assignment4Q3 {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Assignments on StringBuffer Class");
		
		StringBuilder str1=new StringBuilder(" is a peer class of String");
		StringBuilder str2=new StringBuilder(" that provides much of ");
		StringBuilder str3=new StringBuilder(" the functionality of strings");
		System.out.println(str.append(str1));
		System.out.println(str.append(str2));
		System.out.println(str.append(str3));
		str.insert(7, " insert text");
		System.out.println(str);
		System.out.println(str.reverse());
	}

}
