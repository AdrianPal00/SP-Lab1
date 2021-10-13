package main;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subchapters = new ArrayList<>();

    public  Chapter()
    {

    }

    public Chapter(String name) {
        this.name = name;
    }

    public Chapter(String name, List<SubChapter> subchapters) {
        this.name = name;
        this.subchapters = subchapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubChapter> getSubchapters() {
        return subchapters;
    }

    public void setSubchapters(List<SubChapter> subchapters) {
        this.subchapters = subchapters;
    }

    public int createSubChapter(String s) {
        SubChapter subChapter = new SubChapter(s);
        subchapters.add(subChapter);
        return this.subchapters.indexOf(subChapter);

    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return this.subchapters.get(indexSubChapterOneOne);
    }
}
