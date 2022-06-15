public class Cau6 {
    static final String REGEX_EMAIL = "^(.+)@(\\S+)$";
    public static void main(String[] args) {
        String email = "quang@gmail.com";
        if(validateEmail((email))) {
            System.out.println("Email hợp lệ");
        } else  {
            System.out.println("Email không hợp lệ");
        }
    }

    public static boolean validateEmail(String email) {
        boolean flag = email.matches(REGEX_EMAIL);
        return flag;
    }
}
