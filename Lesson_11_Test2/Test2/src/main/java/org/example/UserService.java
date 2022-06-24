package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class UserService {
    ArrayList<User> list = new ArrayList<>();
    public static void readJsonFile(ArrayList<User> list, Gson gson) {
        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<User>>(){}.getType();

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Sai đường dẫn File");
        }
        for (User u : list) {
            System.out.println(u);
        }
    }


}
