package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Đọc file Json lấy dữ liệu tất cả bộ phim
 * Sắp xếp các bộ phim theo năm công chiếu
 * Tìm phim theo tên
 * Tìm phim theo thể loại
 */
public class App 
{

    Scanner sc ;

    static ArrayList<Movie> list = new ArrayList<>();

    static Gson gson = new Gson();

    public static void main( String[] args )
    {
        readJsonFile(list, gson);

        System.out.println("--------------");

        findMovieByReleaseYear();

    }

    public static void readJsonFile(ArrayList<Movie> list, Gson gson) {
        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Sai đường dẫn File");
        }
        for (Movie m : list) {
                System.out.println(m);
        }
    }

    public int releaseYearInput() {
        sc = new Scanner(System.in);
        System.out.println("Nhập năm công chiếu:");

        int year;

        boolean flag = true;
        while (flag) {
            try {
                year = Integer.parseInt(sc.nextLine());
                if (year < 0) throw new InputMismatchException("Năm công chiếu cần phải là số dương");

                flag = false;
                return year;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại.");
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu, vui lòng nhập lại");
            }
        }
        return 0;
    }

    public static Movie findMovieByReleaseYear() {
        System.out.println("Dữ liệu bộ phim theo năm công chiếu:");
        int year = releaseYearInput();
        for (Movie m : list) {
            if (m.getReleaseYear() == year) {
                return m;
            }
        }
        return null;
    }

}
