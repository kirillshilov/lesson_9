package homework_1;

import java.util.Objects;

public class Book {
    private  String NameOfBook;
    private String Author;
    private  int PublicationYear;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return PublicationYear == book.PublicationYear && Objects.equals(NameOfBook, book.NameOfBook) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameOfBook, Author, PublicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "NameOfBook='" + NameOfBook + '\'' +
                ", Author='" + Author + '\'' +
                ", PublicationYear=" + PublicationYear +
                '}';
    }
}

