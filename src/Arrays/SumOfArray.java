package Arrays;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0,avg=0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;

        System.out.println("The sum of the elements of the array is "+sum);
        System.out.println("The average of the elements of the array is "+avg);
    }
}
