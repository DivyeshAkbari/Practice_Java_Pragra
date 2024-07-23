package Abstraction;

public class Implementation {

    public static void main(String[] args) {

        AudioPlayer a1=new AudioPlayer("XYz","ABC");
        a1.displayDetails();
        a1.Play();


        VideoPlayer v1=new VideoPlayer("Introduction to Java",1);
        v1.displayDetails();
        v1.play();


        ImageDisplay i1=new ImageDisplay("PQR","4k");
        i1.displayDetails();
        i1.displayImage();
    }
}
