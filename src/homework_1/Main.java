package homework_1;
public class Main {
    public static void main(String[] args) {
            Author joann = new Author("Joanne", "Rowling");
            Book harryPotter = new Book  (joann.fullName, 2000, "Harry Potter");

            Author chechov = new Author("Антон","Чехов");
            Book garden = new Book(chechov.fullName, 2019, "Вишневый сад");
    }
}
