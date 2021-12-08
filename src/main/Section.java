package main;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String name;
    private List<Element> components = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    public Section() {

    }

    @Override
    public void render() {
        System.out.println("My section is: " + this.name);
        for (Element component : components)
        {
            component.render();
        }
    }

    @Override
    public void addElement(Element element) {
        components.add(element);
    }

    @Override
    public void remove(Element element) {
        components.remove(element);
    }

    @Override
    public Element get(int i) {
        return components.get(i);
    }


    @Override
    public void accept(Visitor visitor) {
        components.forEach(c -> c.accept(visitor));
    }

    public void add(Element e)
    {
        components.add(e);
    }

    @Override
    public String toString() {
        return "Section{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }
}
