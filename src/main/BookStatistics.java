package main;

public class BookStatistics implements Visitor{

    private int nr_images;
    private int nr_tables;
    private int nr_paragraphs;

    public BookStatistics() {
        this.nr_images = 0;
        this.nr_tables = 0;
        this.nr_paragraphs = 0;
    }

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Section section) {
    }

    @Override
    public void visit(TableOfContents tableOfContents) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        this.nr_paragraphs ++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        this.nr_images ++;
    }

    @Override
    public void visit(Image image) {
        this.nr_images ++;
    }

    @Override
    public void visit(Table table) {
        this.nr_tables ++;
    }

    public void printStatistics() {
        System.out.println("Nr of images: " + this.nr_images);
        System.out.println("Nr of paragraphs: " + this.nr_paragraphs);
        System.out.println("Nr of tables: " + this.nr_tables);

    }
}
