package main.Leafs;

import main.Element;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private final String imageName;

    public Image(String imageName) {

        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print()
    {
        System.out.println("This is an Image: " + imageName);
    }

    @Override
    public void addElement(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}
