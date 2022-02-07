class TaxAmount{
    public double calculateTaxAmount(int ctc)
    {
    	double tax = 0;
    	int slabA=180000;
    	int slabB=300000;
        int slabC=500000;
        int slabD=1000000;
    	if(ctc<slabA) 
    	{
    		tax=0;
    	}
    	else if((ctc<slabB)&&(ctc>slabA))
    	{
    		tax=(ctc-slabA)*0.1;
    	}
    	else if((ctc<slabC)&&(ctc>slabB))
    	{
    		tax=(ctc-slabB)*0.2;
    		tax+=34000;
    	}
    	else if((ctc<slabD)&&(ctc>slabC))
    	{
    		tax=(ctc-slabC)*0.3;
    		tax+=94000;
    	}
		return tax;
    }
}
public class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxAmount tx=new TaxAmount();
		double taxamount=tx.calculateTaxAmount(100000);
		System.out.print(taxamount);

	}

}
