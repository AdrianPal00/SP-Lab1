public class Chapter {
    private String name;
    private SubChapter subChapter = new SubChapter();
    static int contor = 0;

    public int createSubChapter(String s) {
        contor++;
        return contor;

    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return new SubChapter();
    }
}
