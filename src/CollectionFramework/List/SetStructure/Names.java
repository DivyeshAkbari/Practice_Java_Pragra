package src.CollectionFramework.List.SetStructure;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the names for existing press no");

        Set<String> nameSet=new TreeSet<>();
        String names;
        while(true)
        {
            names=sc.next();
            if(names.equals("no"))
            {
                break;
            }
            nameSet.add(names);
        }

        System.out.println(nameSet);
    }
}
