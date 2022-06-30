package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    BookService service;
    ArrayList<Book> listBook;
    Scanner sc;

    public Controller(){
        service = new BookService();
        listBook = service.getAllBook();
        sc = new Scanner(System.in);
    }

    public void main() {
        while (true) {
            Util.menu();
            System.out.println("Lựa chọn của bạn là:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Thông tin toàn bộ sách:");
                    show(listBook);
                    break;
                case 2:
                    System.out.println("Tìm sách theo tên:");
                    findBookByTitle();
                    break;
                case 3:
                    System.out.println("Tìm sách theo thể loại");
                    findBookByCategory();
                    System.out.println("Đếm số lượng sách theo thể loại:");
                    countBookByCategory();
                    break;
                case 4:
                    System.out.println("Sắp xếp sách theo số trang");
                    sortBookByPageNumber();
                    break;
                case 5:
                    System.out.println("Sắp xếp sách theo năm xuất bản");
                    sortBookByReleaseYear();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void show(ArrayList<Book> list) {
        for (Book b : list ) {
            System.out.println(b.toString());
        }
    }

    public void findBookByTitle() {
        System.out.println("Nhập tên sách cần tìm:");
        String fBook = sc.nextLine();
        Book b = new Book();
        for (Book book : listBook) {
            if (book.getTitle().toLowerCase().contains(fBook.toLowerCase())) {
                b = book ;
                System.out.println(b);
            }
        }
        service.findBookByTitle(listBook, b);
    }

    public void findBookByCategory() {
        System.out.println("Nhập tên thể loại cần tìm:");
        String fBook = sc.nextLine();
        Book b = new Book();
        for (Book book : listBook) {
            for (String category : book.getCategory()) {
                if (category.toLowerCase().contains(fBook.toLowerCase())) {
                    b = book;
                    System.out.println(b);
                }
            }
        }
        service.findBookByCategory(listBook, b);
    }

    public void countBookByCategory() {
        Map<String, Integer> map = new HashMap<>();
        for (Book b : listBook) {
            for (String category : b.getCategory()) {
                if (map.containsKey(category)) {
                    map.put(category, map.get(category) + 1);
                } else {
                    map.put(category, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void sortBookByPageNumber() {
        service.sortBookByPageNumber(listBook);
        for (Book b : listBook) {
            System.out.println(b);
        }
    }

    public void sortBookByReleaseYear() {
        service.sortBookByReleaseYear(listBook);
        for (Book b : listBook) {
            System.out.println(b);
        }
    }
}
