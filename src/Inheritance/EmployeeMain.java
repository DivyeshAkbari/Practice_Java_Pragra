package Inheritance;
class Employee
{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void calCulatePay()
    {
        System.out.println("Employee calculate pay");
    }
}
class FullTimeEmployee extends Employee
{
    private int salary;

    final int fixed=10;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void calCulatePay()
    {
        System.out.println("Calculate pay from Full-time");
        System.out.println("Salary of full time employees is "+(10000*fixed)+" Dollors");

    }
}
class PartialTimeEmployee extends Employee
{
    private int salary;

    final int fixed=5;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void calCulatePay()
    {
        System.out.println("Calculate pay from Part-time");

        System.out.println("Salary of Part time employees is "+(10000*fixed)+" Dollors");
    }
}
public class EmployeeMain {
    public static void main(String[] args) {

        FullTimeEmployee ft = new FullTimeEmployee();

        ft.setName("Xyz");
        ft.setId(101);

        ft.calCulatePay();

        PartialTimeEmployee pt=new PartialTimeEmployee();

        pt.setName("Abc");
        pt.setId(102);

        pt.calCulatePay();

    }
}
