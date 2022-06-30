package org.example;

import java.util.ArrayList;

public interface IBookService {
    public void findBookByTitle(ArrayList<Book> list, Book book);

    public void findBookByCategory(ArrayList<Book> list, Book book);

    public void sortBookByPageNumber(ArrayList<Book> list);

    public void sortBookByReleaseYear(ArrayList<Book> list);
}
