package src.GarbageCollection;

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        GarbageCollectionDemo gcdemo1=new GarbageCollectionDemo();
        GarbageCollectionDemo gcdemo2=new GarbageCollectionDemo();

        //this is first way to object becomes eligible for GC
        gcdemo1=null;

        //this is seond way to do it.
        //gcdemo1=gcdemo2;


        //This is one way to call Garbage Collector basically to tell JVM or to request JVM to collect it
        System.gc();

        //This is second way to request it basicallu runtime is class and it is a singleton class and getRuntime is
        //method static method to get object of class and gc is method.

        //Runtime.getRuntime().gc();
        System.out.println("Main Method is done");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize methos is done");
    }
}
