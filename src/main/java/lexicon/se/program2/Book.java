package lexicon.se.program2;

import java.time.LocalDate;

public class Book {
    String title;
    String authorName;
    LocalDate years;
    int page;

    public enum category {ADULT, NON_LOANABLE, CHILD}

    ;

category category1 = category.CHILD;
category category2=category.ADULT;
category category3 = category.NON_LOANABLE;





    public Book(int page) {
        this.page = 100;
    }

    public Book(String title, String authorName, LocalDate years) {
        this.title = title;
        this.authorName = authorName;
        this.years = years;
    }
}
