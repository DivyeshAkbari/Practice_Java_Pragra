package src.Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SingletonList {

    public static void main(String[] args) {

        List<String> singletonList = Collections.singletonList("Divyesh");

        System.out.println("Singltonlist is "+singletonList.get(0));


        //so in a singlton list we can not perform any king of operation such
        //as add,remove update
        try
        {
            //singletonList.add("Nikhar");
            singletonList.remove("Divyesh");
        }
        catch (UnsupportedOperationException e)
        {
           System.out.println("List can not be modified because it is a singleton list");
        }


    }
}
