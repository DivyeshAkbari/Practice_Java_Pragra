package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[]=new int[size];


        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Second largest number is "+array[size-2]);
    }
}

