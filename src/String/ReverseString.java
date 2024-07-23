package String;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();



        char ch[]=new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }

        for( char Char:ch)
        {
            System.out.println(ch);
        }


       String str = "GeeksForGeeks";

        // Creating array of string length
        // using length() method
        char[] ch1 = new char[str.length()];

        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < str.length(); i++) {
            ch1[i] = str.charAt(i);
        }

        // Printing the elements of array
        // using for each loop
        for (char c :ch1) {
            System.out.println(c);
        }
        /*int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the string: ");
        size = sc.nextInt();
        char [] ch=new char[size];

        System.out.println("Enter the string: ");
        sc.nextLine();

        for(int i=0; i<size; i++)
        {
            ch[i]=sc.next().charAt(0);
        }

        for(int i=size-1; i>=0; i--)
        {
            System.out.print(ch[i]);
        }*/
    }
}
