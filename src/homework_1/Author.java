package homework_1;

public class Author {
    private String authorName;
    private String authorLastName;
    String fullName;

    public Author(String name, String lastName) {
        this.authorName = name;
        this.authorLastName = lastName;
        this.fullName = name + lastName;
    }
    }

