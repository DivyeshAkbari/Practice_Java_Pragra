package src.ImmutableClass;
class Engine{
    int speed;
    Engine(int speed)
    {
        this.speed=speed;
    }
}
public final class ImmutableClass {

    private final int id;
    private final String name;
    private final Engine engine;

    public ImmutableClass(int id, String name,Engine e) {
        this.id = id;
        this.name = name;

        Engine newEngine=new Engine(e.speed);
        this.engine=newEngine;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Engine e=new Engine(50);
        ImmutableClass obj=new ImmutableClass(101,"Divyesh",e);

        System.out.println(obj.getName());
        System.out.println(obj.getId());

        e.speed=70;
        System.out.println(obj.engine.speed);
    }
}
