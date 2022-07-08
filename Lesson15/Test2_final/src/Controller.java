import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    UserService service;
    ArrayList<User> listUser;

    public Controller() {
        sc = new Scanner(System.in);
        service = new UserService();
        listUser = service.getAllUser();
    }

    public void main() {
        while (true) {
            Util.loginMenu();
            System.out.println("Bạn có thể thực hiện:");
            int choice = Integer.parseInt(sc.nextLine());   //Xử lý ngoại lệ
            switch (choice) {
                case 1:
                    //Đăng nhập
                    User userLogin = login();   //Xử lý ngoại lệ
                    System.out.println("Xin chào " + userLogin.getUsername());
                    loginSuccess(userLogin);
                    break;
                case 2:
                    //Đăng ký
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public User login() {
        User loginUser = null;
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập username: ");
            String username = sc.nextLine();
            for (User u : listUser) {
                if (u.getUsername().equals(username)) {
                    System.out.println("Nhập password: ");
                    String password = sc.nextLine();
                    if (u.getPassword().equals(password)) {
                        loginUser = u;
                        flag = false;
                    } else {        //Sai mật khẩu
                        Util.wrongPasswordMenu();
                        System.out.println("Lựa chọn của bạn là:");
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                return login();
                            case 2:
                                //Quên mật khẩu
                                break;
                            case 0:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                        }
                        flag = false;
                    }
                } else {     //Sai username
                    flag = true;
                    System.out.println("Vui lòng đăng nhập lại.");
                }
            }
        }

        return loginUser;
    }

    public void loginSuccess(User user) {
        while (true) {
            Util.loginSuccessMenu();
            System.out.println("Lựa chọn của bạn là:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //Thay đổi username
                    String newUserName = inputNewUsername();
                    service.updateUsername(user, newUserName);
                    System.out.println(user.getUsername());
                    break;
                case 2:
                    //Thay đổi email
                    String newEmail = inputNewEmail();
                    service.updateEmail(user, newEmail);
                    System.out.println(newEmail);
                    break;
                case 3:
                    //Thay đổi password
                    break;
                case 4:
                    //Đăng xuất
                    main();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public String inputNewUsername() {
        String username = null;
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập username: ");
            username = sc.nextLine();
            for (User u : listUser) {
                if (u.getUsername().equals(username)) {
                    System.out.println("Username này đã tồn tại trong hệ thống, vui lòng nhập lại.");
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return username;
    }

    public String inputNewEmail() {
        String newEmail = null;
        while (newEmail == null) {
            try {
                System.out.println("Nhập email:");
                newEmail = sc.nextLine();
                if (!validDate.validDateEmail(newEmail)) throw new MyException("Email không hợp lệ");
                if (checkEmailExsist(newEmail)) {
                    newEmail = null;
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
        return newEmail;
    }

    public boolean checkEmailExsist(String email) {
        for (User u : listUser) {
            if (u.getEmail().equals(email)) {
                System.out.println("Email đã tồn tại");
                return true;
            }
        }
        return false;
    }

}


