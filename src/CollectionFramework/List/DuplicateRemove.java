package src.CollectionFramework.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(223);
        list.add(453);
        list.add(254);
        list.add(5423);
        list.add(34);
        list.add(24);
        list.add(34);
        list.add(24);
        list.add(54);
        list.add(54);
        list.add(54312);
        list.add(4353);
        list.add(43);

        Set<Integer> set=new HashSet<>();

        set.addAll(list);

        System.out.println(set);



    }
}
