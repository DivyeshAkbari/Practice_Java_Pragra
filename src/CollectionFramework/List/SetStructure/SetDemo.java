package src.CollectionFramework.List.SetStructure;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set1=new TreeSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(1);

        for(Integer s:set1)
        {
            System.out.println(s);
        }

        Set<Character> charset=new TreeSet<>();
        charset.add('z');
        charset.add('y');
        charset.add('x');
        charset.add('w');
        charset.add('v');

        for(Character c:charset)
        {
            System.out.println(c);
        }
    }
}
