import java.util.ArrayList;

public class UserService {
    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("quang", "quang@gmail.com", "quang123"));
        list.add(new User("ngoc", "ngoc@gmail.com", "ngoc456"));
        list.add(new User("hung", "hung@gmail.com", "hung789"));
        list.add(new User("minh", "minh@gmail.com", "minh012"));
        list.add(new User("linh", "linh@gmail.com", "linh345"));
        list.add(new User("trung", "trung@gmail.com", "trung678"));
        return list;
    }

    public void updateNewUsername(User user, String newUsername) {
        user.setUsername(newUsername);
    }

    public void updateNewEmail(User user, String newEmail) {
        user.setEmail(newEmail);
    }

    public void updateNewPassword(User user, String newPassword) {
        user.setPassword(newPassword);
    }
}
