package main;

public class Main {
    public static void main(String[] args) {

        /*main.Book discoTitanic = new main.Book("Disco Titanic");
        discoTitanic.createNewParagraph("main.Paragraph 1");
        discoTitanic.createNewParagraph("main.Paragraph 2");
        discoTitanic.createNewParagraph("main.Paragraph 3");
        discoTitanic.createNewImage("main.Image 1");
        discoTitanic.createNewParagraph("main.Paragraph 4");
        discoTitanic.createNewTable("main.Table 1");
        discoTitanic.createNewParagraph("main.Paragraph 5");
        discoTitanic.print();
         */

        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        Author rpNiculescu = new Author("Mirel Petre Niculescu");
        discoTitanic.addAuthor(rpNiculescu);
        discoTitanic.print();
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        System.out.println(chp1.getName());
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        System.out.println(scOneOne.getName());
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.print();


    }
}