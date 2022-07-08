import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Util {
    public static String formatDate(LocalDate date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strDate = date.format(dateFormatter);
        return strDate;
    }

    private static Random generator = new Random();
    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }

    public static void menu() {
        System.out.println("1 - Truy vấn số dư tài khoản");
        System.out.println("2 - Chuyển tiền");
        System.out.println("3 - Xem lịch sử giao dịch");
        System.out.println("0 - Thoát chương trình");
    }
}
