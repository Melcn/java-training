package WOtraining;

public class Book {

    private String author;
    private String name;

    private int publicationYear;
    private int pages;

    public Book() {

    }

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "auteur: " + author + " name : " + name + " pages ";
    }
}
