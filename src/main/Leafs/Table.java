package main.Leafs;

import main.Element;

public class Table implements Element {
    private String title;

    public Table() {
    }

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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
}
