package InterfaceAssignment;

public class Penguin implements Animal,Swimmable {
    @Override
    public void feed() {
        System.out.println("Penguins are feeding themselves");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguins are making a sound");
    }

    @Override
    public void swim() {
        System.out.println("Penguins are swimming");
    }
}
