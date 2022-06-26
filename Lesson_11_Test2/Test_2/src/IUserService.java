import java.util.ArrayList;

public interface IUserService {
    public void updateUsername(User user, String newUsername);

    public void updateEmail(User user, String newEmail);

    public void updatePassword(User user, String newPassword);

    public void addNewUser(ArrayList<User> list, User user);

}
