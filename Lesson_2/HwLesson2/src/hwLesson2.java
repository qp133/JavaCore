import java.util.Random;
import java.util.Scanner;

public class hwLesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Mời bạn nhập vào số number: ");
        int number = sc.nextInt();

        int randomNumber = rd.nextInt(1,100);

        System.out.println("Số number vừa nhập: " + number);
        System.out.println("Số ngẫu nhiên từ 0 đến 100: " + randomNumber);

        System.out.println("So sánh: " + (number>randomNumber ? "Số number lớn hơn số ngẫu nhiên" : "Số number nhỏ hơn số ngẫu nhiên"));
    }
}
