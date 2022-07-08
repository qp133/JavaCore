import java.util.Locale;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Util {
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    private static final String alphaUpperCase = alpha.toUpperCase();
    private static final String digits = "0123456789";
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits + specials;

    public static Random generator = new Random();
    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }

    public static String randomId(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length()-1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void loginMenu() {
        System.out.println("Bạn có các lựa chọn:");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("0 - Thoát chương trình");
    }

    public static void wrongPasswordMenu() {
        System.out.println("Bạn có thể thực hiện:");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("0 - Thoát chương trình");
    }

    public static void loginSuccess() {
        System.out.println("Bạn có thể thực hiện:");
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi password");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
    }
}
