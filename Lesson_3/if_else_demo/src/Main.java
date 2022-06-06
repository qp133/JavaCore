import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 13;

        if(x % 2 == 0) {
            System.out.println(x + " là số chẵn");
        } else {
            System.out.println(x + " là số lẻ");
        }

        System.out.println("Done!!!");

//        int a = 5;
//        int b = 7;
//        int c = 10;
//        if (a < b) {
//            if(a < c ) {
//                System.out.println(a + " là số nhỏ nhất");
//            } else {        // a > c
//                System.out.println(c + " là số nhỏ nhất");
//            }
//        }

        double bmi = 17.7;
        if(bmi < 18) {
            System.out.println("Tỉ lệ cơ thể hơi gầy");
        } else if (bmi >= 18 && bmi <= 22) {
            System.out.println("Bạn bình thường");
        } else {
            System.out.println("Bạn thừa cân");
        }

        //Cho 3 cạnh a,b,c nhập vào từ bàn phím
        //Kiểm tra 3 cạnh có hợp thành 1 tam giác hay không?
        //Điều kiện: Tổng 2 cạnh lớn hơn cạnh còn lại.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất:");
        int a = sc.nextInt();
        System.out.println("Nhập độ dài cạnh thứ hai:");
        int b = sc.nextInt();
        System.out.println("Nhập độ dài cạnh thứ ba:");
        int c = sc.nextInt();

        if(a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh hợp lại thành 1 tam giác");
        } else {
            System.out.println("Ba cạnh không hợp thành tam giác");
        }
    }
}
