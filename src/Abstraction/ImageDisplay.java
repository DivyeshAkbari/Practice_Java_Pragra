package Abstraction;

public class ImageDisplay extends MediaDevice {

    private String image;
    private String resolution;

    public ImageDisplay(String image, String resolution) {
        this.image = image;
        this.resolution = resolution;
    }

    @Override
    public void displayDetails() {
        System.out.println("Image: " + image);
        System.out.println("Resolution: " + resolution);
    }

    public void displayImage()
    {
        System.out.println("Displaying the image");
    }
}
