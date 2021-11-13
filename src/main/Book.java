package main;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private String title;
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }


    public List<Author> getAuthors() {
        return authors;
    }


    public void addAuthor(Author author)
    {
        this.authors.add(author);
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
        }
            System.out.println();

            super.print();

        }
}