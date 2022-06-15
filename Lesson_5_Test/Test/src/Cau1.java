import java.util.Scanner;

public class Cau1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bài 1: ");
        hinhVuong();
        hinhTamGiac();
        hinhTamGiac2();
    }

    public static void hinhVuong() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }

    public static void hinhTamGiac() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }

    public static void hinhTamGiac2() {
        System.out.println();
        int h = 4;
        for (int i = 1; i <= h; i++) {
            for (int j = i; j < h; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
