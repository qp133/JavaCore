import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("ngoc", "ngoc@gmail.com", "123456789"));

        return list;
    }

    public void updateUsername(User user, String newUserName) {
        user.setUsername(newUserName);
    }

    public void updateEmail(User user, String newEmail) {
        user.setEmail(newEmail);
    }

    public void updatePassword(User user, String newPassword) {
        user.setPassword(newPassword);
    }

}
