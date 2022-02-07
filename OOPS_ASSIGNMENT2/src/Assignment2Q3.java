import java.util.ArrayList;
import java.util.Scanner;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
		return totalDeposits;}
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
		return fixedDepositAmount;}
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int totalcash=0;
    	cash.add(1000);
    	cash.add(10000);
    	cash.add(200);
    	for(int i=0;i<cash.size();i++)
    	{
    		totalcash+=cash.get(i);
    		
    	}
		return totalcash;
		}
    public int getCash()
    {
    	Scanner sc=new Scanner(System.in);
    	CurrentAccount cu=new CurrentAccount();
    	SavingsAccount sa=new SavingsAccount();
    	System.out.println("DO you want savings account:2 or Current account:1");
    	int c=sc.nextInt();
    	int smth = 0;
    	if(c==1)
    	{
    		System.out.println("WELCOME TO CURRENT ACCCOUNT");
    		int c1=cu.getCash();
    		System.out.println("GET CASH");
    		int c2=sc.nextInt();
    		if(c2>cu.creditLimit && c2>c1)
    		{
    			System.out.println("credit limit exceeded");
    			
    		}
    		else
    		{
    			
    			return smth=c2;
    		}
    		
    	}
    	else//here 2
    	{
    		System.out.println("WELCOME TO SAVINGS ACCCOUNT");
    		int b=sa.getCash();
    		System.out.println("GET CASH");
    		int b2=sc.nextInt();
    		if(b2>sa.fixedDepositAmount)
    		{
    			System.out.println("DESPOSIT SHOULD BE "+sa.fixedDepositAmount);
    		}
    		else
    		{
    			return smth=b2;
    		}
    		
    	}
		return smth;
		}
    public static void main(String[] args) 
    {
    	Assignment2Q3 ass1=new Assignment2Q3();
    	ArrayList<Integer> list = new ArrayList<>();
    	System.out.println(ass1.totalCashInBank(list));
    	System.out.println(ass1.getCash());
    }
}

