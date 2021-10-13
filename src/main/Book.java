package main;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }


    public Book(String title, List<Author> authors, List<Chapter> chapters) {
        this.title = title;
        this.authors = authors;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }
    public int createChapter (String chapterName)
    {
        Chapter chapter= new Chapter(chapterName);
        this.chapters.add(chapter);
        return this.chapters.indexOf(chapter);
    }

    public Chapter getChapter(int indexChapterOne) {
        return this.chapters.get(indexChapterOne);
    }

    public void print()
    {
        System.out.println("The name of the book is: " + this.getTitle());
        if (this.getAuthors().size()==0)
            System.out.println("The book has no known authors at the moment");
        else if (this.getAuthors().size()==1)
        {
            this.getAuthors().get(0).print();
        }
        else
        {
            System.out.print("The authors of the book are: " );
            for (Author author: this.authors) {
                System.out.print(author.getName() + " ");
                if (authors.indexOf(author) == authors.size() - 2)
                    System.out.print("and ");
            }
            System.out.println();

        }
    }
}
