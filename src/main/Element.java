package main;

public interface Element {
    public abstract void print();

    public abstract void addElement(Element element);

    public void remove(Element element);

    public Element get(int i);



}
