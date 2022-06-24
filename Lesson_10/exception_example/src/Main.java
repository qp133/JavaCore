import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//
//        int c = a/b;
//
//        System.out.println(c);

//        int[] arr = new int[-3];        //ArraySizeException

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập số phần tử mảng:");
                int x = Integer.parseInt(sc.nextLine());
//            System.out.println(x);
                int[] arr = new int[x];
                flag = false;
            } catch (NumberFormatException a) {
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println("Vui lòng nhập lại");
            } catch (NegativeArraySizeException e) {
                System.out.println("Kích thước mảng phải là 1 số dương");
                System.out.println("Vui lòng nhập lại");
            } finally {
                System.out.println("Khối này luôn được thực thi");
            }
        }

        //không nhập số mà nhập ký tự => InputMismatchException

//        try {
//            System.out.println("Nhập số phần tử mảng:");
//            int x = sc.nextInt();
////            System.out.println(x);
//            int[] arr = new int[x];
//        } catch (InputMismatchException a) {
//            System.out.println(a.toString());       //trả về tên lớp Exception để biết ngoại lệ nào xảy ra
//            a.printStackTrace();
//        } finally {
//            System.out.println("Khối này luôn được thực thi");
        }
}

