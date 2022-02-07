
abstract class A
{
	abstract void  work();
	void help()
	{
		System.out.println("HEY i am A");
	}
}
class B extends A
{

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("HEY i am B");
		
	}
	}

public class Assignment2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A db1=new A();/*Cannot instaniate Abtsract class*/
		/*A db1=new A(){

			@Override
			void work() {
				// TODO Auto-generated method stub
				
			}};*/ //its creates an anoymouns class
		A db =new B();
		db.help();
		db.work();

	}

}