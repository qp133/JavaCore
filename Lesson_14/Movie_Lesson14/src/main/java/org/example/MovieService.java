package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MovieService {
    Gson gson = new Gson();

    public ArrayList<Movie> getAllMovie() {
        ArrayList<Movie> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("movie.json");

            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            list = gson.fromJson(reader,type);
        } catch (Exception e) {
            System.out.println("Sai đường dẫn File");
        }
        return list;
    }

    public void show(ArrayList<Movie> list) {
        list.forEach(o -> System.out.println(o));
    }

    public void sortByTitle(ArrayList<Movie> list) {
        list.stream().sorted((o1,o2) -> o1.getTitle().compareTo(o2.getTitle()))
                .forEach(o -> System.out.println(o));
    }

    public void sortByLength(ArrayList<Movie> list) {
        list.stream().sorted((o1,o2) -> o1.getLength() - o2.getLength())
                .forEach(o -> System.out.println(o));
    }

    public void sortByView(ArrayList<Movie> list) {
        list.stream().sorted((o1,o2) -> o1.getView() - o2.getView())
                .forEach(System.out::println);
    }

    public void countByCategory(ArrayList<Movie> list) {
        Map<String, Integer> map = new HashMap<>();
        for (Movie m : list) {
            for (String category : m.getCategory()) {
                if (map.containsKey(category)) {
                    map.put(category, map.get(category) + 1);
                } else {
                    map.put(category, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Thể loại " + entry.getKey() + " - " + entry.getValue() + " bộ phim");
        }
    }


}
