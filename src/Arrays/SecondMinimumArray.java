package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinimumArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr []=new int [size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("second minimum array is: "+arr[1]);

    }
}
