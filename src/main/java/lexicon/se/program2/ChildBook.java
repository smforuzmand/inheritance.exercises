package lexicon.se.program2;

import java.time.LocalDate;

public class ChildBook extends Book implements Loanable{

    public ChildBook() {
        super();
        this.setCategory(Category.CHILD);
    }

    public ChildBook(int page) {
        super(page);
    }

    public ChildBook(String title, String authorName, LocalDate years) {
        super(title, authorName, years);
    }

    @Override
    public void loan() {
        System.out.println("This types of books are loanable!"+toString());
    }
}
