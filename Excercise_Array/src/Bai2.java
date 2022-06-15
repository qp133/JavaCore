import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);

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
}
