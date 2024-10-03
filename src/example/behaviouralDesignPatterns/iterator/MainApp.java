package example.behaviouralDesignPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class MainApp
{

    public static void main(String[] args)
    {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Rich dad poor dad", "Robert T Kiyosaki"));
        bookList.add(new Book(2, "Think & grow rich", "Nepolian Hill"));
        bookList.add(new Book(3, "Zero to one", "Peter Thiel"));
        Library<Book> books = new BooksLibrary<>(bookList);

        MyIterator<Book> iterator = books.createMyIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
