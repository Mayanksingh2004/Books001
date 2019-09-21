package main;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBN;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public Book(String bookName, String authorName, String ISBN) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return "\n-----------------------------\n"+
                "Book Name:\t"+getBookName()+
                "\nAuthor Name:\t"+getAuthorName()+
                "\nISBN:\t"+getISBN()+
                "\n-----------------------------\n";
    }
}
