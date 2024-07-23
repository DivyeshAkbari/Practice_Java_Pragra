package Abstraction;

public class VideoPlayer extends MediaDevice{

    private String title;
    private int duration;

    public VideoPlayer(String title, int duration) {

        this.title = title;
        this.duration = duration;
    }

    public void play()
    {
        System.out.println("Playing the video");
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
    }
}
