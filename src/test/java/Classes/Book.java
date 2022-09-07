package Classes;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthor;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAdditionalAuthor(Author[] additionalAuthor) {
        this.additionalAuthor = additionalAuthor;
    }

    public Author getAuthor() {
        return author;
    }

    public Author[] getAdditionalAuthor() {
        return additionalAuthor;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}