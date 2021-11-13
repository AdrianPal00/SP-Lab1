package main;

import main.Leafs.Image;

public class ImageProxy implements Element {

    private final String imageName;
    private Image realImage;

    public ImageProxy(String imageName) {
            this.imageName = imageName;
        }

    public Image loadImage() {

        if (this.realImage == null)
            this.realImage = new Image(imageName);

        return this.realImage;
    }

    @Override
    public void print() {
            loadImage().print();
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
