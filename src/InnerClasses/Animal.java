package InnerClasses;

public interface Animal {

     void bark();
     void eat();
     void sleep();

}

class TestMain{
    public static void main(String[] args) {
        Animal animal = new Animal() {


            @Override
            public void bark() {
                System.out.println("barking...");
            }

            @Override
            public void eat() {
                System.out.println("eating...");
            }

            @Override
            public void sleep() {
                System.out.println("sleeping...");
            }
        };


        animal.bark();
        animal.eat();
        animal.sleep();
    }
}
