package main;

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
    public void render() {
            loadImage().render();
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

    @Override
    public void accept(Visitor visitor) {
    visitor.visit(this);
    }
}
