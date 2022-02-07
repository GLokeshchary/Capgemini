
public class Assignemnt7Q2 {
	 //var cannot be used in an instance and global variable declaration.
	//var z1=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var can be used in a local variable declaration.
		var x = 100;
		var y = 1.900;
		var z = 'c';
	    var p = "chary";
	    var q = false;
	    System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
        //----------------------------------------
       //var cannot be used as a Generic type.
        //var<var> al = new ArrayList<>();
      //----------------------------------------
        // var cannot be used with the generic type.
        //var<Integer> al = new ArrayList<Integer>();
      //----------------------------------------
        //var cannot be used without explicit initialization.
        //// declaration without
        // initialization
        //var variable;
          // This is also not valid
        //var variable = null;
      //----------------------------------------
        //var cannot be used with Lambda Expression.
        //var obj = (a, b) -> (a + b);
      //----------------------------------------
        //var cannot be used for method parameters and return type.
        //var method1() { return ("Inside Method1");
        //void method2(var a) { System.out.println(a); }
      //----------------------------------------

	}

}
