import java.util.ArrayList;

public class UserService {
    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(986845196, "quang123", 123456789, 5000000));
        list.add(new User(988345568, "trung456", 234567890, 5000000));
        list.add(new User(973622819, "nghia789", 345678901, 5000000));
        list.add(new User(937281939, "quan012", 456789012, 5000000));
        list.add(new User(934673828, "linh345",567890123, 5000000));
        list.add(new User(913948893, "mai678", 678901234, 5000000));
        return list;
    }



}
