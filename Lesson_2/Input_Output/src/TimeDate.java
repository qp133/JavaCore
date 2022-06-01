import java.time.LocalDate;
import java.util.Scanner;

public class TimeDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập ngày: ");
        int day = sc.nextInt();

        System.out.println("Nhập tháng: ");
        int month = sc.nextInt();

        System.out.println("Nhập năm: ");
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date);
    }
}
