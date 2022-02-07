class Result{
    public void declareResults( double marks1, double marks2, double marks3)
    {
    	double sum=marks1+marks2+marks3;
    	if(sum>60)/*1......*/
    	{
    		System.out.println("Passed");
    	}
    	else 
    	{
    		System.out.println("falied");
    	}
    	if(marks1>60 && marks2>60)/*2............*/
    	{
    		System.out.println("Promoted");
    	}
    	else if(marks2>60 && marks3>60)
    	{
    		System.out.println("Promoted");
    	}
    	else if(marks1>60 && marks3>60) 
    	{
    		System.out.println("Promoted");
    	}
    	if(marks1>60 && marks2<60 && marks3<60)/*3.............*/
    	{
    		System.out.println("falied");
    	}
    	else if(marks2>60 && marks1<60 && marks3<60)
    	{
    		System.out.println("falied");
    	}
    	else if(marks3>60 && marks2<60 && marks1<60)
    	{
    		System.out.println("falied");
    	}
    			
    			
    	
    }
}
public class Assignment1Q4 {
	 public static void main(String[] args) 
	 {
		 Result ass =new Result();
		ass.declareResults(10, 10, 10);
		ass.declareResults(70, 10, 10);
		ass.declareResults(10, 20, 40);
		ass.declareResults(10, 30, 40);
		 
	 }
	 

}
