package ExceptionHandling;

import java.util.Scanner;

public class Exception {


    public static void main(String[] args) {


        int [] arr=new int[5];

        System.out.println("Enter 5 elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }


        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
}
