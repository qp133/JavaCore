import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kiểu dữ liệu[] tên_mảng;

//        int[] array;

        //Cấp phát bộ nhớ
        //<Tên mảng> = new <kiểu dữ liệu>[Kích tước mảng>

//        array = new int[5];
//
//        String[] strArray = new String[5];

        //Gán giá trị cho các phần tử mảng
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;

        //Lấy kích thước mảng:
//        System.out.println("Kích thước mảng: " + array.length);

        //Duyệt và in ra các phần tử mảng
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println();
//
//        System.out.println("Phần tử đầu tiên: " + array[0]);
//        System.out.println("Phần tử ở vị trí cuối cùng: " + array[array.length-1]);

        //Viết chương trình tạo mảng số nguyên gồm n phần tử (n nhập vào từ bàn phím). Thực hiện:
        // * Nhập phần tử cho mảng và in mảng ra màn hình
        // * Hiển thị phần tử tại vị trí index = 2
        // * Tính tổng các phần tử trong mảng
        // * In ra màn hình các số chẵn và tổng các số đó
        // * Sắp xếp mảng theo thứ tự tăng dần
        // * Sắp xếp mảng theo thứ tự giảm dần
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ [%d]: ", i);
            numbers[i] = sc.nextInt();
        }
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + "\t");
        }

//         * Hiển thị phần tử tại vị trí index = 2
        System.out.println();
        System.out.println("numbers[2] = " + numbers[2]);

//         * Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];      // sum = sum + numbers[i]
        }
        System.out.println("Tổng các phần tử trong mảng: " + sum);

//         * In ra màn hình các số chẵn và tổng các số đó
        int sumChan = 0;

        System.out.println("Các số chẵn của mảng: ");
        for (int i = 0; i < n; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + "\t");
                sumChan += numbers[i];
            }
        }
        System.out.println();
        System.out.println("Tổng các số chẵn là: " + sumChan);

        // * Sắp xếp tăng dần
        // Cách 1:
//        Arrays.sort(numbers);
//        System.out.println("Sắp xếp các phần tử tăng dần: ");
//        System.out.println(Arrays.toString(numbers));

        //Cách 2
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if(numbers[i] > numbers[j]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//        System.out.println("Sắp xếp các phần tử tăng dần: ");
//        System.out.println(Arrays.toString(numbers));

        //Tạo mảng chuỗi gồm n phần tử (n nhập vào từ bàn phím)
        // * Nhập thông tin cho các phần tử
        // * In thông tin ra màn hình
        // * Đếm số lần "Java" xuất hiện trong mảng
        // * Nhập vào từ bàn phím chuỗi bất kỳ, kiêm tra chuỗi đó ở vị trí nào của mảng
//        System.out.println("Nhập vào số phẩn tử của mảng: ");
//        int n = sc.nextInt();
//        String[] strArray = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Nhập phần tử thứ [%d]: ", i);
//            strArray[i] = sc.next();
//        }

//
//        System.out.println("Các phần tử trong mảng là: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(strArray[i] + "\t");
//        }
//
//        System.out.println();

        // * Số lần Java xuất hiện trong mảng
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if(strArray[i].contains("Java")) {      //contains: kiểm tra chuỗi strArray có chứa chuỗi con ko
//                count++;
//            }
//        }
//        System.out.println("Số lần xuất hiện của Java trong mảng: " + count);

//        *Cách 2:
//        for (String str : strArray) {
//            if(str == "Java") {
//                System.out.println(str);
//            }
//        }

        // * Nhập vào từ bàn phím chuỗi bất kỳ, kiêm tra chuỗi đó ở vị trí nào của mảng
//        System.out.println("Nhập chuỗi bất kỳ: ");
//        String s = sc.next();
//
//        for (int i = 0; i < n; i++) {
//            if(strArray[i].equals(s)) {
//                System.out.println("Vị trí chuỗi " + s + " xuất hiện trong mảng: " + i);
//            }
//        }

//        for (int num: numbers) {
//            System.out.println(num);
//        }

    }
}