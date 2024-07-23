package Arrays;

import java.util.Scanner;

public class Min_Max {


   static int min_max (int a[],int flag)
    {
        int max=a[0];
        int min=a[0];
        if(flag==0) {
            for (int i = 0; i < a.length; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
        }
        if(flag==1)
        {
            for(int i=0;i<a.length;i++)
            {
                if(min>a[i])
                {
                    min=a[i];
                }
            }
        }
        if(flag==0) {
            return max;
        }
        else {
            return min;
        }
    }


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Maximum element is "+min_max(a,0));
        System.out.println("Minimum element is "+min_max(a,1));
    }
}
