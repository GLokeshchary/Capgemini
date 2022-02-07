
public class Assignment1Q3 {
	public double simpleInterest(double principalAmount,int time,double interestRate)
	{
		return ((principalAmount*time*interestRate)/100);
		
	}
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
    	double compound = Math.pow((principalAmount*(1+interestRate)),(time-principalAmount));
		return compound;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1Q3 sim=new Assignment1Q3();
		System.out.println(sim.simpleInterest(1000, 2, 5));
		System.out.println(sim.compoundInterest(1000, 2, 5));

	}

}
