package src.GarbageCollection;

class ObjectA {
    ObjectB b;
}

class ObjectB {
    ObjectA a;
}

public class IslandOfIsolationExample {

    /*
        So here we have objectA and objectB so objectA has reference of objectB
        and vice versa.

        Normally, you would have references to these objects from your main program.
        But if we are loosing the reference of object by assigning null values to it.
        it's like cutting off the connection to the island.
        This means, in your Java program, no variable points to ObjectA or ObjectB anymore.

        The main program doesn't have any way to reach ObjectA or ObjectB anymore.

        Java's garbage collector sees that these objects are isolated.
        Since they are no longer needed by the main program, they are cleaned up
     */
    public static void main(String[] args) {
        // Create instances of ObjectA and ObjectB
        ObjectA a = new ObjectA();
        ObjectB b = new ObjectB();

        // They are referening to each other
        a.b = b;
        b.a = a;

        // Lose the references from the main program
        a = null;
        b = null;

        // Now, ObjectA and ObjectB are on an isolated island

        System.gc();
        System.out.println("Main Method is done");
    }


    //The finalize() method may not be called immediately when we call System.gc().
    // The System.gc() method suggests that the JVM run the garbage collector,
    // but it does not guarantee that the garbage collector will actually run immediately.
    // Also, the finalize() method is deprecated and its behavior can be unpredictable.

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finally gets executed");
    }
}
