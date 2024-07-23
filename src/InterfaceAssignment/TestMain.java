package InterfaceAssignment;

public class TestMain {

    public static void main(String[] args) {

        Monkey m1=new Monkey();
        m1.climb();
        m1.feed();
        m1.makeSound();

        Penguin p1=new Penguin();
        p1.feed();
        p1.makeSound();
        p1.swim();
    }
}
