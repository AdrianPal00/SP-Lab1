package main;

public class DocumentManager {
    private static volatile DocumentManager INSTANCE;
    Book book;

    private DocumentManager(){
        if (INSTANCE != null)
        {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
    public static DocumentManager getInstance(){
        synchronized (DocumentManager.class) {
            if (INSTANCE == null) {
                INSTANCE = new DocumentManager();
            }
        }
        return INSTANCE;
    }

    public void setBook(Book myBook) {
        this.book = myBook;
    }

    public Book getBook() {
        return book;
    }

}
