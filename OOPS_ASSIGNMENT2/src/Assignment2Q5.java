

class Rectangle5 extends Shape5 {
    @Override
    public String draw() 
    {
    	return "Hey i am rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() 
    {
    	return "Hey i am Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() 
    {
    	return "hey i am Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) 
    {
    	Shape5 db=new Rectangle5();
    	Shape5 db1=new Line5();
    	Shape5 db2=new Cube5();
    	System.out.println(db.draw());
    	System.out.println(db1.draw());
    	System.out.println(db2.draw());
    }
}