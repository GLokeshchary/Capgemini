class BubbleSort{

    public void bubbleSort(int arr[]) 
    {
    	int len=arr.length;
    	for(int i=0;i<len-1;i++)
    	{
    		for(int j=0;j<len-1-i;j++)
    		{
    			if(arr[j]>arr[j+1])
    			{
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
		
    }

}
public class Assignment1Q8 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		BubbleSort b =new BubbleSort();
		System.out.println("ARRAY");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		b.bubbleSort(arr);
		System.out.println("SORTED ARRAY");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		
		

	}

}
