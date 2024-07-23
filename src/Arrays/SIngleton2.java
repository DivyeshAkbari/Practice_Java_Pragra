package Arrays;

public class SIngleton2 {

    //eager way of creating singleton ojbect
    private static SIngleton2 obj=new SIngleton2();

    public static SIngleton2 getInstance(){
        return obj;
    }
}
