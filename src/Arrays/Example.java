package Arrays;

public class Example {

    public static void main(String[] args) {

        Singleton ojb=Singleton.getInstance();

        System.out.println(ojb.hashCode());

        Singleton ojb2=Singleton.getInstance();

        System.out.println(ojb2.hashCode());

        System.out.println(SIngleton2.getInstance().hashCode());
        System.out.println(SIngleton2.getInstance().hashCode());
    }

}
