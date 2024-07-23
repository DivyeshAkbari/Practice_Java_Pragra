package Inheritance;


class Vehicle
{
    private String make;
    private  String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void start()
    {
        System.out.println("Vehicle is Started" );
    }

    public void stop()
    {
        System.out.println("Vehicle is Stopped");
    }

    public void displayInfo()
    {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}

class Car extends Vehicle
{
    private int numDoors;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void displayInfo()
    {
        System.out.println("Methods from car");
        System.out.println("Doors is "+numDoors);
    }


}
class MotorCycle extends Vehicle
{
    private int mnumCylinders;

    public int getMnumCylinders() {
        return mnumCylinders;
    }

    public void setMnumCylinders(int mnumCylinders) {
        this.mnumCylinders = mnumCylinders;
    }

    public void displayInfo()
    {
        System.out.println("Methods from Motor Cycle");
        System.out.println("Doors is "+mnumCylinders);
    }
}

class ElectricCar extends Car
{
    private int batteruCapacity;

    public int getBatteruCapacity() {
        return batteruCapacity;
    }

    public void setBatteruCapacity(int batteruCapacity) {
        this.batteruCapacity = batteruCapacity;
    }

    public void displayInfo()
    {
        System.out.println("Methods from Electric Car");
        System.out.println("Batter Capacity is "+batteruCapacity);
    }
}
public class Example {

    public static void main(String[] args) {

        Car car=new Car();
        MotorCycle motorCycle=new MotorCycle();
        ElectricCar electricCar=new ElectricCar();


        car.setMake("xyz");
        car.setModel("porche");
        car.setYear(2017);


        car.displayInfo();
        car.setNumDoors(10);
        car.start();
        car.stop();

        motorCycle.setMnumCylinders(10);
        motorCycle.displayInfo();

        electricCar.setBatteruCapacity(1000);
        electricCar.displayInfo();


    }
}
