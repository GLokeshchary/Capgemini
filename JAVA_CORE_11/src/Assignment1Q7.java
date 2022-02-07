class SearchArray{
    public void searchArray(int[] arr,int toCheckValue)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==toCheckValue)
        	{
        		System.out.println("yes its exists");
        
        	}
        	else
        	{
        		System.out.println("No its not exists");
        	}
    		
    	}
   
    	/*if(toCheckValue.contains(arr))
    	{
    		return true;
    
    	}
    	else
    	{
    		return false;
    	}*/
    }
}
public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray sc1=new SearchArray();
        sc1.searchArray(arr, valueToCheck);
        
        

	}

}
