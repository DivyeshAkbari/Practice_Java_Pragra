package src.InnerClasses;

public class OuterClassDemo {

   static class InnerClassDemo{
        public void show(){
            System.out.println("Inside InnerClassDemo");
        }
    }
}

class Main{
    public static void main(String[] args) {


        //this is for normal inner class to create the ojbect
      /*  OuterClassDemo outerClassDemo = new OuterClassDemo();
        OuterClassDemo.InnerClassDemo obj=outerClassDemo.new InnerClassDemo();*/


        //this is for static inner class to create the object
        OuterClassDemo.InnerClassDemo obj=new OuterClassDemo.InnerClassDemo();
        obj.show();
    }
}
