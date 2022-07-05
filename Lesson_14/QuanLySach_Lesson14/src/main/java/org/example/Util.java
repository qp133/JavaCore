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
        System.out.println("1 - Lấy thông tin toàn bộ sách");
        System.out.println("2 - Tìm sách theo tên");
        System.out.println("3 - Tìm sách theo thể loại");
        System.out.println("4 - Sắp xếp sách theo số trang");
        System.out.println("5 - Sắp xếp sách theo năm xuất bản");
        System.out.println("0 - Thoát chương trình");
    }
}
