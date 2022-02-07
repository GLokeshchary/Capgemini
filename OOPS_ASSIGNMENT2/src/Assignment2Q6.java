
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() 
    {
		return "persist in filePersistence class";
    	
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
		return "Persist in databasepersistance class";}
}

public class Assignment2Q6 {
    public static void main(String[] args) 
    {
    	Persistence ps=new FilePersistence();
    	Persistence ps1=new DatabasePersistence();
    	System.out.println(ps.persist());
    	System.out.println(ps1.persist());
    }
}