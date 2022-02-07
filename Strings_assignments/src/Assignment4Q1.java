
public class Assignment4Q1 {
	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(str.length());
		String str1="Hello";
		String str2=" How are you";
		String str3=str1.concat(str2);
		System.out.println(str1.concat(str2));
		System.out.println(str3);
		String str5="Java String pool refers to collection of Strings which are stored in heap memory";
	    System.out.println(str5.toLowerCase());
	    System.out.println(str5.toUpperCase());
	    System.out.println(str5.replace('a','$'));
	    System.out.println(str5.contains("collection"));
	    String str6="java string pool refers to collection of strings which are stored in heap memory";
	    System.out.println(str5.equals(str6));
	    System.out.println(str5.equalsIgnoreCase(str6));
	    System.out.println(str5.toLowerCase().contentEquals(str6.toLowerCase()));
	}

}
