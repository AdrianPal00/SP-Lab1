package main.Leafs;

import main.Element;

public class Image implements Element {
    private final String imageName;

    public Image(String imageName) {

        this.imageName = imageName;

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
