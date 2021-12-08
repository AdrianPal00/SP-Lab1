package main;

import main.Element;
import main.Visitor;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print()
    {
        System.out.println("main Table with name: " + title);
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

    public void render() {
        System.out.println("Table with title: " + this.title);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
