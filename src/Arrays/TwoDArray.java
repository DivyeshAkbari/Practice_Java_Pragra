package Arrays;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        int a1[][]=new int[3][3];
        int a2[][]=new int[3][3];

        Scanner sc=new Scanner(System.in);
        int sum[][]=new int[3][3];

        System.out.println("Enter the Elements of first Array");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the Elements of second Array");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }

        System.out.println("sum of given array is");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j]=a1[i][j]+a2[i][j];
            }
        }

        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("  ");
        }
    }
}
