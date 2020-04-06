package BookArrayList;

import java.util.ArrayList;
import java.util.Date;

public class BooksArrayListTest {


    public static void main(String[] args) {
        Date d1 = new Date();
        BooksArrayList book1 = new BooksArrayList("Aniefiok Akpan", "The man in the mirror", d1);

        BooksArrayList book2 = new BooksArrayList("Aniefiok John", "What shall i offer", d1);
        BooksArrayList book3 = new BooksArrayList("Aniefiok godson", "The man in the mirror", d1);
        BooksArrayList book4 = new BooksArrayList("Joy Akpan", "The man in the mirror", d1);

        ArrayList<BooksArrayList> bookList = new ArrayList<BooksArrayList>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        System.out.printf("%n%s%20s%30s%n", "name", "Title", "Date");
        for (BooksArrayList book : bookList) {
            System.out.printf("%n%s%25s%40s%n", book.getName(), book.getTitle(), book.getDate());
        }
//        This is executed at run time hence it is called dynamic binding.
        System.out.println(book1.Palindrome("test"));
    }
}

