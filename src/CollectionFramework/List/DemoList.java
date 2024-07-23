package src.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(null);
        System.out.println("List size is "+list.size());

        System.out.println(list.get(11));
    }
}
