import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bài 1:");
        System.out.println("Nhập vào họ tên của bạn: ");
        String name = sc.nextLine();

        String rs = Bai1.standardize(name);
        System.out.println(rs);

        System.out.println("Tên của bạn khi nhập: " + name);
        System.out.println("Tên của bạn khi chuẩn hóa: " + rs);

        System.out.println();

        System.out.println("Bài 2:");
        System.out.println("Nhập kích thước hàng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kích thước cột: ");
        int col = Integer.parseInt(sc.nextLine());

        int[][] array = Bai2.createArray(row, col);
        Bai2.show(array);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] += 1;
                }
            }
            System.out.println();
        }
        Bai2.show(array);
    }
}
