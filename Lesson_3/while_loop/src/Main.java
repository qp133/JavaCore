import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 0;
//
//        while(i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        int age = 0;
        Scanner sc = new Scanner(System.in);
//        while (age < 18) {
//            System.out.println("Nhập tuổi: ");
//            age = sc.nextInt();
//        }
//        System.out.println("Bạn đủ tuổi bầu cử");
//
//        Random rd = new Random();
//        int rdNumber = rd.nextInt(100);

//        int number = 0;
//
//        while (number != rdNumber) {
//            System.out.println("Đoán số: ");
//            number = sc.nextInt();
//            if(number == rdNumber) {
//                System.out.println("Bạn đoán trúng số rồi!");
//            }
//        }

//        boolean flag = true;
//        while (flag) {
//            System.out.println("Đoán số: ");
//            int number = sc.nextInt();
//
//            if(number < rdNumber) {
//                System.out.println("Số bạn đoán nhỏ hơn, vui lòng đoán lại:");
//            } else if (number > rdNumber) {
//                System.out.println("Số bạn đoán lớn hơn, vui lòng đoán lại:");
//            } else {
//                System.out.println("Bạn đoán trúng số rồi.");
//                flag = false;
//            }
//        }

//        do {
//            System.out.println("Xin chào");
//        } while (false) ;


//        int age = -1;
//        do {
//            System.out.println("Nhập tuổi");
//            age = sc.nextInt();
//        } while (age <= 0);
//
//        System.out.println("tuổi của bạn là: " + age);

        //1. Viết chương trình giải phương trình bậc nhất 1 ẩn ax + b = 0, với a,b nhập từ bàn phím.
//        int a = -1;
//        do {
//            System.out.println("Nhập a: ");
//            a = sc.nextInt();
//        } while (a == 0);
//        System.out.println("Nhập b: ");
//        int b = sc.nextInt();
//        System.out.println("Phương trình 1 ẩn là: " + a + "x" + " + " + b + " = 0");
//
//        System.out.println("Nghiệm của phương trình: x = " + (double)(-b/a));

        //2. Viết chương trình giải phương trình bậc hai 1 ẩn: ax^2 + bx + c = 0
        //với a,b,c nhập từ bàn phím.
        int a = -1;
        do {
            System.out.println("Nhập a: ");
            a = sc.nextInt();
        } while (a == 0);
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();

        float delta = b*b - 4*a*c;
        if(delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            double x1 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("x1 = " + x1);
            double x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Phương trình có nghiệm kép: x = " + (-b/(2*a)));
        }
    }
}
