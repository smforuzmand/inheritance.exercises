package lexicon.se.program2;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ChildBook childBook1 = new ChildBook("The Runaway Bunny", "Margaret Wise Brown",
                LocalDate.parse("1942-01-01"));
        childBook1.setCategory(Category.CHILD);
        childBook1.setPages(95);
        YoungAdultBook youngAdultBook1 = new YoungAdultBook("LordOfRings", "J.J.Tolkin",
                LocalDate.of(1954, 07, 19));
        youngAdultBook1.setCategory(Category.ADULT);
        youngAdultBook1.setPages(150);
        ReferenceBook referenceBook1 = new ReferenceBook("Britannica", "Author: As of 2008, 4,411 named contributors",
                LocalDate.parse("1768-01-01"));
        referenceBook1.setCategory(Category.NON_LOANABLE);
        referenceBook1.setPages(12340);

        ArrayList<Book> typeBook = new ArrayList<>();
        typeBook.add(childBook1);
        typeBook.add(youngAdultBook1);
        typeBook.add(referenceBook1);



        //iterating through the array list helping the instanceof for an interface
        System.out.println("iterating through loanable");
        for (Book book : typeBook) {
            if (book instanceof Loanable) {
                System.out.println(book.getTitle()+" "+"are loanable");
            }
        }
        // Iterate through the array and only print out the book that is not loanable.
        System.out.println("iterating through not loanable");
        for (Book book : typeBook) {
            if (book.getCategory() == Category.NON_LOANABLE) {
                System.out.println(book.getTitle() +" "+ " is not loanable");
            }

        }
        System.out.println("iterating for CHILD category");
        for (Book book :typeBook){
            if(book.getCategory()==Category.CHILD){
                System.out.println(book.getTitle()+"this is a book for "+book.getCategory());
            }
        }
        System.out.println("iterating for ADULT category");
        for (Book book : typeBook){
            if (book.getCategory()==Category.ADULT){
                System.out.println(book.getTitle());
            }
        }

    }
}
