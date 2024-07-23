package Abstraction;

public class AudioPlayer extends MediaDevice{

    private String songname;
    private String artist;


    @Override
    public void displayDetails() {

        System.out.println("Song name is "+songname);
        System.out.println("Artist name is "+artist);
    }

    public AudioPlayer(String songname, String artist) {
        this.songname = songname;
        this.artist = artist;
    }

    public void Play()
    {
        System.out.println("Playing the song");
    }
}
