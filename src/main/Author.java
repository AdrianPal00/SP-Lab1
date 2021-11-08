package main;

public class Author {

    private String name;

    public Author()
    {

    }
    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print()
    {
        System.out.println("Author's name is: " + this.getName());
    }
}