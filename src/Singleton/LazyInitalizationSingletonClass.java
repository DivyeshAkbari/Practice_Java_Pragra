package src.Singleton;
public class LazyInitalizationSingletonClass {

    private static LazyInitalizationSingletonClass singleObject;
    private LazyInitalizationSingletonClass()
    {

    }

    //lazy initalization of object
    //so now it is a threadsafe as well.
    public static LazyInitalizationSingletonClass getObject()
    {
        if(singleObject==null)
        {
            synchronized (LazyInitalizationSingletonClass.class) {
                if(singleObject==null) {
                    singleObject = new LazyInitalizationSingletonClass();
                }
            }
        }
        return singleObject;
    }
}
