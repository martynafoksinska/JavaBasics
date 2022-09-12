package Classes;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public void addBook(){
        for (int i = 0; i < books.length; i++) {
            this.books = new Book[i];
        }

    }
}
