package main;

public class Image extends ElementType {
    private String imageName;

    public Image()
    {

    }
    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void print()
    {
        System.out.println("This is an Image: " + imageName);
    }
}
