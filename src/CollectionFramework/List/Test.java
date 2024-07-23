package List;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Employee e1=new Employee(101,"Divyesh","Akbari","divyeshkabari@gmail.com","Toronto",24);
        Employee e2=new Employee(102,"xyz","pqr","abc@gmail.com","Niagra",25);
        Employee e3=new Employee(103,"abc","def","abcdef@gmail.com","Malton",26);
        List<Employee> e1List=new ArrayList<Employee>();
        e1List.add(e1);
        e1List.add(e2);
        e1List.add(e3);


        for(int i=0;i<e1List.size();i++){
            Employee e=e1List.get(i);
            if(e.getCity().equalsIgnoreCase("toronto")){
                System.out.println("Found out the Emploee City");
                System.out.println("id is "+e.getId());
                System.out.println("First Name is "+e.getFirstname());
                System.out.println("Last Name "+e.getLastname());
                System.out.println("City is "+e.getCity());
                System.out.println("Email is "+e.getEmail());
                break;
            }
            else {
                System.out.println("Found out the Employee");
            }
            System.out.println(" ");
        }

        for(int i=0;i<e1List.size();i++)
        {
            Employee e=e1List.get(i);

            if(e.getAge()>=24)
            {
                System.out.println("Found out the Employees By their age");

                System.out.println("id is "+e.getId());
                System.out.println("First Name is "+e.getFirstname());
                System.out.println("Last Name "+e.getLastname());
                System.out.println("City is "+e.getCity());
                System.out.println("Email is "+e.getEmail());
                System.out.println("Age is "+e.getAge());

            }

            System.out.println(" ");
        }
    }
}
