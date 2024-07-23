import java.util.Scanner;

public class Array {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an aarray");
        int size=sc.nextInt();
        String [] name=new String[size];

        System.out.println("Enter the Element of an array");
        for(int i=0;i<size;i++)
        {
            name[i]=sc.next();
        }

        System.out.println("Your elements of an array is given below");
        for(String  var :name)
        {
            System.out.println(var);
        }
    }
}
