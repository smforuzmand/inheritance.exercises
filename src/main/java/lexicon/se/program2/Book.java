package lexicon.se.program2;

import java.time.LocalDate;

public class Book {
    private String title;
    private String authorName;
    private LocalDate years;
    private int pages;

    private Category category;

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getYears() {
        return years;
    }

    public void setYears(LocalDate years) {
        this.years = years;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(int page) {
        this.pages = 100;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book(String title, String authorName, LocalDate years) {
        this.title = title;
        this.authorName = authorName;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", years=" + years +
                ", pages=" + pages +
                ", category=" + category +
                '}';
    }
}
