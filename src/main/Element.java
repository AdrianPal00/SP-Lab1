package main;

public interface Element {

    void render();

    void addElement(Element element);

    void remove(Element element);

    Element get(int i);

    void accept(Visitor visitor);



}
