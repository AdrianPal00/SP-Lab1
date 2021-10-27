package main.Leafs;

import main.Element;

public class Paragraph implements Element {
    private String text;

    public Paragraph() {
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print()
    {
        System.out.println("This is a main Paragraph: " + text);

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
