import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String formatDate(Date date) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = myFormat.format(date);
        return strDate;
    }
    public static void menu() {
        System.out.println("1 - Truy vấn số dư tài khoản");
        System.out.println("2 - Chuyển tiền");
        System.out.println("3 - Xem lịch sử giao dịch");
        System.out.println("0 - Thoát chương trình");
    }
}
