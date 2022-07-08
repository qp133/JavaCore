import java.util.regex.Pattern;

public class validate {
    public static String REGEX_EMAIL = "^(.+)@(\\S+)$";
    public static boolean validateEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

}
