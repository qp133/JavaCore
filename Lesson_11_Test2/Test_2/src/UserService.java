import java.util.ArrayList;
import java.util.Scanner;

public class UserService implements IUserService{
    public ArrayList<User> getAllUser() {
        ArrayList<User> listUser= new ArrayList<>();
        listUser.add(new User("quang", "q123456", "quang@gmail.com",false));
        listUser.add(new User("nam", "Nnam2", "nam@gmail.com", false));
        listUser.add(new User("khanh", "kHanH3", "khanh@gmail.com", false));
        listUser.add(new User("linh", "Linh4", "linh@gmail.com", false));
        listUser.add(new User("chi", "chiChi5", "chi@gmail.com", false));
        listUser.add(new User("trung", "Trung6trung6", "trung@gmail.com", false));
        listUser.add(new User("hoa", "Hhoaaa777", "hoa@gmail.com", false));
        return listUser;
    }

    public boolean checkUsername(ArrayList<User> list, String username) {
        boolean flag = false;
        for (User u : list) {
            if(u.getUsername().equals(username)) {
                flag = true;
            }
        }
        return flag;
    }

    public boolean checkPassword(ArrayList<User> list, String password) {
        boolean flag = false;
        for (User u : list) {
            if (u.getPassword().equals(password)) {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void updateUsername(User user, String newUsername) {
        user.setUsername(newUsername);
    }

    @Override
    public void updateEmail(User user, String newEmail) {
        user.setEmail(newEmail);
    }

    @Override
    public void updatePassword(User user, String newPassword) {
        user.setPassword(newPassword);
    }


}
