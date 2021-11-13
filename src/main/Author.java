package main;

public class Author {

    private final String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print()
    {
        System.out.println("Author's name is: " + this.getName());
    }
}
