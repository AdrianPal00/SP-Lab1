public class SubChapter {
    private String name;
    private Image image = new Image("newImage");
    private Paragraph paragraph = new Paragraph("newParagraph");
    private Table table = new Table("newTable");

    public SubChapter() {
    }

    public SubChapter(String name) {
        this.name = name;
    }

    public SubChapter(String name, Image image, Paragraph paragraph, Table table) {
        this.name = name;
        this.image = image;
        this.paragraph = paragraph;
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }


    public void createNewParagraph(String s) {
        System.out.println("Paragraph: " + s);
    }

    public void createNewImage(String s) {
    }

    public void createNewTable(String s) {
    }

    public void print() {
        image.print();
        paragraph.print();
        table.print();
    }
}
