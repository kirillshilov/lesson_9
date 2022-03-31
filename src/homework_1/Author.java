package homework_1;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastName;
    String fullName;

    public Author(String name, String lastName) {
        this.authorName = name;
        this.authorLastName = lastName;
        this.fullName = name + " " + lastName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public String getAuthorLastName(){
        return this.authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(fullName, author.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}

