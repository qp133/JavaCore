package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String formatDate(Date date) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = myFormat.format(date);
        return strDate;
    }

    public static void menu() {
        System.out.println("Bạn có thể thực hiện:");
        System.out.println("1 - In thông tin các bộ phim");
        System.out.println("2 - Sắp xếp phim theo tên");
        System.out.println("3 - Sắp xếp phim theo thời lượng");
        System.out.println("4 - Sắp xếp phim theo lượt xem");
        System.out.println("5 - Đếm mỗi thể loại có bao nhiêu phim");
        System.out.println("0 - Thoát chương trình");
    }
}
