import java.util.Scanner;

public class Cau5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bài 5: ");
        System.out.println("Nhập kích thước hàng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kích thước cột: ");
        int col = Integer.parseInt(sc.nextLine());

        int[][] arrA = createArray(row, col);
        show(arrA);

        System.out.println("Đường chéo chính: ");
        duongCheoChinh(arrA, row, col);

        int[][] arrB = createArray(row,col);
        show(arrB);

        System.out.println("Tổng 2 mảng 2 chiều:");
        int[][] sumMultiArray = new int[row][col];
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                sumMultiArray[j][k] = arrA[j][k] + arrB[j][k];
            }
        }
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                System.out.print(sumMultiArray[j][k] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] createArray(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập phần tử thứ [%d][%d]: " , i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void duongCheoChinh(int[][] arr, int row, int col) {
        if (row == col) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        System.out.println(arr[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }
}
