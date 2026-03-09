public class Book {
    private String book;
    private String bookId;
    private String author;

    public Book(String book, String bookId, String author){
        this.book = book;
        this.bookId = bookId;
        this.author = author;
    }
    public String getBookName(){
        return book;
    }
    public String getBookId(){
        return bookId;
    }
    public String getAuthor(){
        return author;
    }
}
