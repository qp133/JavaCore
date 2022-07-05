package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    MovieService service;
    ArrayList<Movie> listMovie;

    public Controller() {
        sc = new Scanner(System.in);
        service = new MovieService();
        listMovie = service.getAllMovie();
    }

    public void main() {
        while (true) {
            Util.menu();
            System.out.println("Lựa chọn của bạn là:");
            int choose = inputNumber();
            switch (choose) {
                case 1:
                    service.show(listMovie);
                    break;
                case 2:
                    System.out.println("Sắp xếp phim theo tên:");
                    service.sortByTitle(listMovie);
                    break;
                case 3:
                    System.out.println("Sắp xếp phim theo thời lượng:");
                    service.sortByLength(listMovie);
                    break;
                case 4:
                    System.out.println("Sắp xếp phim theo lượt xem:");
                    service.sortByView(listMovie);
                    break;
                case 5:
                    System.out.println("Đếm xem mỗi thể loại có bao nhiêu bộ phim");
                    service.countByCategory(listMovie);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public int inputNumber() {
        boolean flag = true;
        while(flag) {
            try{
                int choose = Integer.parseInt(sc.nextLine());
                return choose;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        }
        return 0;
    }
}
