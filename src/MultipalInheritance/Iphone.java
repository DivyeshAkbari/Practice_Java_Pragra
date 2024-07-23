package src.MultipalInheritance;

public class Iphone implements Appstore, AssitiveAI {

    @Override
    public void apps() {
        System.out.println("Iphone apps");
    }

    @Override
    public void a() {

    }

    @Override
    public void voiceSpeech() {
        System.out.println("Iphone voice speech");
    }
}
