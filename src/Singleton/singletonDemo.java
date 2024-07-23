package src.Singleton;

public class singletonDemo {

    public static void main(String[] args) {

        LazyInitalizationSingletonClass object1 = LazyInitalizationSingletonClass.getObject();

        LazyInitalizationSingletonClass object2=LazyInitalizationSingletonClass.getObject();
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
    }
}
