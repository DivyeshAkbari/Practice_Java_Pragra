package Arrays;

public class Singleton {

    private static Singleton singleton ;
    private Singleton()
    {

    }

    //lazy way of creating single object
    public static Singleton getInstance()
    {
        if(singleton==null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}

