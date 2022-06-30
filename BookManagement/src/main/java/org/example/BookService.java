package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;

public class BookService implements IBookService{
    Gson gson = new Gson();

    //Chuyển json sang ArrayList
    public ArrayList<Book> getAllBook() {
        ArrayList<Book> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("book.json");
            Type type = new TypeToken<ArrayList<Book>>(){}.getType();

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Sai đường dẫn file");
        }
        return list;
    }


    @Override
    public void findBookByTitle(ArrayList<Book> list, Book book) {
        book.getTitle();
    }

    @Override
    public void findBookByCategory(ArrayList<Book> list, Book book) {
        book.getCategory();
    }

    @Override
    public void sortBookByPageNumber(ArrayList<Book> list) {
        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
    }

    @Override
    public void sortBookByReleaseYear(ArrayList<Book> list) {
        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getReleaseYear() - o2.getReleaseYear();
            }
        });
    }
}
