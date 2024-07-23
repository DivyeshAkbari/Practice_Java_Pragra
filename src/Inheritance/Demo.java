package src.Inheritance;
class Parent{
    public int a;
}

class Child extends Parent{
    private int b;

    public Child(int b) {
        this.b = b;
    }
}
public class Demo {
    public static void main(String[] args) {
        Child c=new Child(10);
        c.a=10;
    }
}


