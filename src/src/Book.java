public class Book {
    private String title;
    private String myText="";

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String myText) {
        this.title = title;
        this.myText = myText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

    public void createNewParagraph(String str)
    {
        this.myText = this.myText +  "\n" + str;
    }

    public void createNewImage(String img)
    {
        this.myText = this.myText + "\n" + "This is my Image: " + img;
    }

    public void createNewTable(String table)
    {
        this.myText = this.myText + "\n" + "This is my Table: " + table;
    }

    public void print()
    {
        System.out.println(this.myText);
    }
}
