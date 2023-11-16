package WOtraining;

public class Book {

    private String author;
    private String name;
    private String pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPages() {
        return pages;
    }
}
