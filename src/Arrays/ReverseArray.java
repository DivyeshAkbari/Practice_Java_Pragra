package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};


        System.out.println("Original array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();


        int start = 0;
        int end = array.length - 1;
        while (start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;


            start++;
            end--;
        }


        System.out.println("Reversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

