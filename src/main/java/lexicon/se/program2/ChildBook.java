package lexicon.se.program2;

import java.time.LocalDate;

public class ChildBook extends Book implements Loanable{

    public ChildBook() {
        super();
        this.setCategory(Category.CHILD);
    }


    @Override
    public void loan() {
        System.out.println("This types of books are loanable!"+toString());
    }
}
