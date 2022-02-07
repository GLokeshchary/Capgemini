
public class Assignment4Q2 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("StringBuffer");
		StringBuffer str1=new StringBuffer(" is a peer class of String");
		StringBuffer str2=new StringBuffer(" that provides much of ");
		StringBuffer str3=new StringBuffer(" the functionality of strings");
		System.out.println(str.append(str1));
		System.out.println(str.append(str2));
		System.out.println(str.append(str3));
		str.insert(7, " insert text");
		System.out.println(str);
		System.out.println(str.reverse());
		
		
		
	}

}
