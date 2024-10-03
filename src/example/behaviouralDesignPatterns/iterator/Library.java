package example.behaviouralDesignPatterns.iterator;

public interface Library<T>
{
    MyIterator<T> createMyIterator();
}
