package example.behaviouralDesignPatterns.iterator;

import java.util.List;

public class BooksLibrary<E> implements Library
{
    List<E> books;

    public BooksLibrary(List<E> books) {
       this.books =  books;
    }

    @Override
    public MyIterator createMyIterator()
    {
        return new LibraryIterator();
    }

    class LibraryIterator implements MyIterator<E> {

        int index;

        @Override
        public boolean hasNext()
        {
            return index < books.size();
        }

        @Override
        public E next()
        {
            if(hasNext()) {
                return books.get(index++);
            }
            return null;
        }

    }

}
