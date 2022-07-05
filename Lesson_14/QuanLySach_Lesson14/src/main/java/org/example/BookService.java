package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class BookService {

    Gson gson = new Gson();

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

    public void show(ArrayList<Book> list) {
        list.forEach(i -> System.out.println(i));
    }

    public ArrayList<Book> getBookByName(ArrayList<Book> list, String name) {
        ArrayList<Book> listBook = new ArrayList<>();
        for (Book b : list) {
            if (b.getTitle().contains(name)) {
                listBook.add(b);
            }
        }
//        listBook = (ArrayList<Book>) list.stream().filter(i -> i.getTitle().contains(name));
        return listBook;
    }

    public ArrayList<Book> getBookByCategory(ArrayList<Book> list, String category) {
        ArrayList<Book> listBook = new ArrayList<>();
        for (Book b : list) {
            String[] categories = b.getCategory();
            for (int i = 0; i < categories.length; i++) {
                if (categories[i].equalsIgnoreCase(category)) {
                    listBook.add(b);
                }
            }
        }
        return listBook;
    }

    public void sortByPageNumber(ArrayList<Book> list) {
        list.stream().sorted((o1,o2) -> o1.getPageNumber() - o2.getPageNumber())
                .forEach(o -> System.out.println(o));
    }

    public void sortByReleaseDate(ArrayList<Book> list) {
        list.stream().sorted((o1,o2) -> o1.getReleaseDate().compareTo(o2.getReleaseDate()))
                .forEach(o -> System.out.println(o));
    }
}
