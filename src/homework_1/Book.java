package homework_1;

public class Book {
    private static String NameOfBook;
    private String Author;
    private static int PublicationYear;
    public Book (String  Author, int publicationYear, String nameOfBook) {
        this.Author = Author;
        this.NameOfBook = nameOfBook;
        this.PublicationYear = publicationYear;
    }
    public String getNameOfBook (){
        return this.NameOfBook;
    }
    public String getAuthor (){
        return this.Author;
    }
    public int getPublicationYear (){
        return this.PublicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.PublicationYear = publicationYear;
    }
}

