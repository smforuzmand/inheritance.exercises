package lexicon.se.program2;

import java.time.LocalDate;

public class ReferenceBook extends Book{
    public ReferenceBook() {
        super();
        this.setCategory(Category.NON_LOANABLE);
    }

    public ReferenceBook(int page) {
        super(page);
    }

    public ReferenceBook(String title, String authorName, LocalDate years) {
        super(title, authorName, years);
    }
}