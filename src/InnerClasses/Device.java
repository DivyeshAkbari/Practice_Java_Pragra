package InnerClasses;

abstract public class Device {

    public abstract void test();
}

class Maintest{
    public static void main(String[] args) {


        //this is anonymous inner class
        Device device = new Device() {
            @Override
            public void test() {
                 System.out.println("Tesing....");
            }
        };

        device.test();
    }
}
