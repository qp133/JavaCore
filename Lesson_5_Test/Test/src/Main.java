import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bài 1: ");
        hinhVuong();
        hinhTamGiac();

        System.out.println();

        System.out.println("Bài 2: ");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println(str);
        System.out.println("Số từ trong chuỗi: " + countWordString(str));
        System.out.println("Số lần xuất hiện ký tự o: " + countO(str));

        System.out.println();

        System.out.println("Bài 3: ");
        Random rd = new Random();
        int randomNumbers = rd.nextInt();
        System.out.println("Số ngẫu nhiên: " + randomNumbers);
        System.out.println("Số ngẫu nhiên " + randomNumbers + (isPrimeNumber(randomNumbers) ? " là số nguyên tố" : " không là số nguyên tố"));

        System.out.println();

        System.out.println("Bài 4:");
        System.out.println("10 số nguyên tố đầu tiên:");
        int demSoNguyenTo = 0;
        int i = 0;
        while (demSoNguyenTo < 10) {
            if (isPrimeNumber(i)) {
                System.out.print(i + "\t");
                demSoNguyenTo++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Các số nguyên tố nhỏ hơn 10:");
        for (int j = 0; j < 10; j++) {
            if (isPrimeNumber(j)) {
                System.out.print(j + "\t");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Bài 5: ");
        System.out.println("Nhập kích thước hàng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kích thước cột: ");
        int col = Integer.parseInt(sc.nextLine());

        System.out.println();

        int multiArray[][]  = new int[row][col];
        System.out.println("Mảng 2 chiều thứ nhất:");

        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                System.out.printf("Nhập phần tử thứ [%d][%d]: ", j,k);
                multiArray[j][k] = sc.nextInt();
            }
        }

        System.out.println("Mảng 2 chiều thứ nhất vừa nhập:");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                System.out.print(multiArray[j][k] + "\t");
            }
            System.out.println();
        }

        System.out.println("Các phần tử nằm trên đường chéo chính của mảng: ");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                if(j == k) {
                    System.out.print(multiArray[j][k] + "\t");
                }
            }
        }

        System.out.println();
        System.out.println();

        int multiArray2[][]  = new int[row][col];
        System.out.println("Mảng 2 chiều thứ hai: ");

        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                System.out.printf("Nhập phần tử thứ [%d][%d]: ", j,k);
                multiArray2[j][k] = sc.nextInt();
            }
        }

        System.out.println("Mảng 2 chiều thứ hai vừa nhập:");
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                System.out.print(multiArray2[j][k] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Tổng 2 ma trận vừa nhập:");
        int[][] sumMultiArray = new int[row][col];
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                sumMultiArray[j][k] = multiArray[j][k] + multiArray2[j][k];
            }
        }
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                System.out.print(sumMultiArray[j][k] + "\t");
            }
            System.out.println();
        }

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

    public static int countWordString(String str) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n' ) {
                if(check) {
                    count++;
                    check =false;
                }
            } else {
                check = true;
            }
        }
        return count;
    }

    public static int countO(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
