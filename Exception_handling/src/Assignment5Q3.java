import java.util.Scanner;
class  IllegalBankTransactionException extends Exception
{
	 IllegalBankTransactionException()
	 {
		 System.out.println("IllegalBankTransactionException ");
		 
	 }
	 IllegalBankTransactionException(String str)
	 {
		 super(str);
	 }
	}

class  InsufficientBalanceException extends Exception
{
	 InsufficientBalanceException()
	 {
		 //System.out.println("InsufficientBalanceException ");
	 }
	 InsufficientBalanceException(String a)
	 {
		 super(a);
	 }
	}
public class Assignment5Q3 {

	public static void main(String[] args) throws IllegalBankTransactionException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		long id;
		System.out.print("Enter here $");
		double bal=sc.nextDouble();
		double deposit=sc.nextDouble();
		double total=bal+deposit;
		//System.out.println(total);
		try {
			if(bal==0)
			{
				System.out.println("Balance is Zero");
			}
			else
			{
				System.out.println("Balance is $"+total);
			}
			System.out.println("DO YOU WANT TO WITHDRAW MONEY IF YES|NO Type 1|2");
			int c =sc.nextInt();
			if(c==1)
			{
				System.out.println("Enter withdrawal money");
				double withdraw=sc.nextDouble();
				if(withdraw>total)
				{
					InsufficientBalanceException e=new InsufficientBalanceException("U HAVE LESS AMOUNT IN THE ACCOUNT");
					throw e;
					
				}
				else if(withdraw<0)
				{
					throw new IllegalBankTransactionException();
				}
				else
				{
					total=total-withdraw;
					System.out.println("Current balance $"+total);
				}
			}
			
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		} catch (IllegalBankTransactionException e1) {
			e1.printStackTrace();
		}
		finally {
			System.out.println("Program completed");
		}

	}

}
