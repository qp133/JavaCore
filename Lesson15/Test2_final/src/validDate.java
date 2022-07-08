import java.util.regex.Pattern;

public class validDate {
    public static String REGEX_EMAIL = "^(.+)@(\\S+)$";
    public static boolean validDateEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
}
