package src.CollectionFramework.List.SetStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleSet {

    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<>();

        HashSet<Integer> ints=new HashSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(60);

        Set<Integer> treeSet2=new TreeSet<>();
        treeSet2.add(78);
        treeSet2.add(58);
        treeSet2.add(48);
        treeSet2.add(38);
        treeSet2.add(null);


        System.out.println("Elements are "+treeSet);


        //treeSet.remove(10);
        //System.out.println(treeSet);

//        System.out.println("Hash code is "+treeSet.hashCode());
//
//        System.out.println(treeSet.equals(treeSet2));
//        System.out.println(treeSet.containsAll(treeSet2));
//        System.out.println(treeSet.contains(10));
//
//        treeSet.removeAll(treeSet);
//        System.out.println(treeSet);
//        treeSet.retainAll(treeSet);
        System.out.println(treeSet2);

    }
}
