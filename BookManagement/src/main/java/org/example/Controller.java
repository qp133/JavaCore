package org.example;

import java.util.ArrayList;
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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
}
