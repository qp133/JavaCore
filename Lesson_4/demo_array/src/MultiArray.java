public class MultiArray {
    public static void main(String[] args) {
        int row = 3;    //Số hàng
        int col = 2;    //Số cột

        int[][] array = new int[row][col];

        array[0][0] = 5;
        array[0][1] = 7;

        array[1][0] = 2;
        array[1][1] = 4;

        array[2][0] = 1;
        array[2][1] = 6;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[] arr = {1,2,3,4,5,6};      //khai báo nhanh mảng 1 chiều, chưa cần biết kích thước
        int[][] muultiArr = { {1,2,3},
                              {4,5,6},
                              {7,8,9} };

    }
}
