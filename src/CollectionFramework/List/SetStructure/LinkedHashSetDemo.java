package src.CollectionFramework.List.SetStructure;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> set1=new LinkedHashSet(10,0.75f);

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);

        System.out.println(set1);
    }
}
