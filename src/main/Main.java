package main;

import main.Leafs.*;

public class Main {
    public static void main(String[] args) {

        /*
        Lab 1
        main.Book discoTitanic = new main.Book("Disco Titanic");
        discoTitanic.createNewParagraph("main.Paragraph 1");
        discoTitanic.createNewParagraph("main.Paragraph 2");
        discoTitanic.createNewParagraph("main.Paragraph 3");
        discoTitanic.createNewImage("main.Image 1");
        discoTitanic.createNewParagraph("main.Paragraph 4");
        discoTitanic.createNewTable("main.Table 1");
        discoTitanic.createNewParagraph("main.Paragraph 5");
        discoTitanic.print();
         */

        /*
        Lab 2
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
*/

        /*
        Lab 3
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.add(new Paragraph("Multumesc celor care ..."));
        noapteBuna.add(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));

        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        noapteBuna.print();

         */

    }
}