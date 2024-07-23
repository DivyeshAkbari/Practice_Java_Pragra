package src.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(20);
        list.add(10);

        Collections.sort(list);
        System.out.println(list);

        //find minimum
        System.out.println(Collections.min(list));

        //find maximum
        System.out.println(Collections.max(list));

        //unmodifiable

        Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(list);
        unmodifiableCollection.add(30);

         unmodifiableCollection.remove(30);
    }
}
