package lexicon.se.program2;

import java.time.LocalDate;

public class YoungAdultBook extends Book implements Loanable{

    public YoungAdultBook(){
        super();
        this.setCategory(Category.ADULT);
    }

    @Override
    public void loan() {
        System.out.println("This type of books are loanable!");
    }
}
