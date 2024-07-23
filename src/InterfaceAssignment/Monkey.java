package InterfaceAssignment;

public class Monkey implements Animal,Climbable {
    @Override
    public void feed() {

        System.out.println("Monkey is having Banana");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey makes sound");
    }

    @Override
    public void climb() {
        System.out.println("Monkey climbs");
    }
}
