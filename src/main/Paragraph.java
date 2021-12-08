package main;

import main.AllignStrategy;
import main.Element;
import main.Visitor;

public class Paragraph implements Element, AllignStrategy {
    private String text;
    AllignStrategy allignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void render() {
        if(allignStrategy == null)
            System.out.println("This is a main Paragraph: " + text);
        else
            allignStrategy.render(text);


    }

    public void setAlignStrategy(AllignStrategy allignStrategy)
    {
        this.allignStrategy = allignStrategy;
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

    @Override
    public void render(String paragraph) {
    }
}
