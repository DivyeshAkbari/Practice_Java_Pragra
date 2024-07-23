package src.Abstraction;

abstract class myAbstractClass{
    private  int a;

    public myAbstractClass(int a){
        this.a=a;
        System.out.println("Inside my Abstract Class Method "+a);
    }
}
class AbstractDemo extends myAbstractClass{

    public AbstractDemo(int a)
    {
        super(a);
        System.out.println("Inside AbstractDemo Class Method");
    }
}
public class ConstructorWithABstraction {

    public static void main(String[] args)
    {
        myAbstractClass demo=new AbstractDemo(10);
    }
}
