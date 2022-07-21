package lexicon.se.program2;

import java.time.LocalDate;

public class ReferenceBook extends Book{
    public ReferenceBook() {
        super();
        this.setCategory(Category.NON_LOANABLE);
    }
}