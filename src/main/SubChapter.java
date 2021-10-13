package main;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<ElementType> myElements = new ArrayList<>();


    public SubChapter() {
    }

    public SubChapter(String name) {
        this.name = name;
    }

    public SubChapter(String name, List<ElementType> myElements) {
        this.name = name;
        this.myElements = myElements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElementType> getMyElements() {
        return myElements;
    }

    public void setMyElements(List<ElementType> myElements) {
        this.myElements = myElements;
    }



    public void createNewParagraph(String s) {
        this.myElements.add(new Paragraph(s));
    }

    public void createNewImage(String s) {
        this.myElements.add(new Image(s));

    }

    public void createNewTable(String s) {
        this.myElements.add(new Table(s));

    }

    public void print() {
        for (ElementType item : myElements)
        {
            item.print();
        }
    }



}
