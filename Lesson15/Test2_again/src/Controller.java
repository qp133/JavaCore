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
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //Đăng nhập
                    User userLogin = login();       //Xử lý ngoại lệ
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
        User userLogin = null;
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập username:");
            String username = sc.nextLine();
            for (User u : listUser) {
                if (u.getUsername().equals(username)) {
                    System.out.println("Nhập password:");
                    String password = sc.nextLine();
                    if (u.getPassword().equals(password)) {
                        userLogin = u;
                        flag = false;
                    } else {
                        //Sai mật khẩu
                        Util.wrongPasswordMenu();
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                login();
                                break;
                            case 2:
                                //Quên mật khẩu
                                forgetPassword();
                                break;
                            case 0:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                        }
                    }
                } else {
                    //Sai username
                    flag = true;
                    System.out.println("Vui lòng đăng nhập lại.");
                }
            }
        }
        return userLogin;
    }

    public void loginSuccess(User user) {
        while (true) {
            Util.loginSuccess();
            System.out.println("Lựa chọn của bạn là:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //Thay đổi username
                    String newUsername = inputNewUsername();
                    service.updateNewUsername(user, newUsername);
                    System.out.println(user.getUsername());
                    break;
                case 2:
                    //Thay đổi email
                    String newEmail = inputNewEmail();
                    service.updateNewEmail(user, newEmail);
                    System.out.println(user.getEmail());
                    break;
                case 3:
                    //Thay đổi password
                    String newPassword = inputNewPassword();
                    service.updateNewPassword(user, newPassword);
                    System.out.println("Thay đổi password thành công.");
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
            System.out.println("Nhập username:");
            username = sc.nextLine();
            for (User u : listUser) {
                if (u.getUsername().equals(username)) {
                    System.out.println("Username đã tồn tại trong hệ thống, vui lòng nhập lại.");
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
                if(!validate.validateEmail(newEmail)) throw new MyException("Email không hợp lệ");
                if (checkEmailExist(newEmail)) {
                    newEmail = null;
                }
            }catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
        return newEmail;
    }

    public boolean checkEmailExist(String email) {
        for (User u : listUser) {
            if (u.getEmail().equals(email)) {
                System.out.println("Email đã tồn tại");
                return true;
            }
        }
        return false;
    }

    public String inputNewPassword() {
        String newPassword = null;
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập password:");
            newPassword = sc.nextLine();
            for (User u : listUser) {
                if (u.getPassword().equals(newPassword)) {
                    System.out.println("Bạn vui lòng nhập mật khẩu mới không trùng với mật khẩu cũ.");
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return newPassword;
    }

    public User forgetPassword(User user) {
        String email = null;
        while (email == null) {
            try {
                System.out.println("Nhập email:");
                email = sc.nextLine();
                if(!validate.validateEmail(email)) {
                    throw new MyException("Email không hợp lệ");
                } else {
                    System.out.println("Nhập email thành công");
                    String newPassword = inputNewPassword();
                    service.updateNewPassword(user, newPassword);
                    System.out.println("Đăng nhập lại:");
                    login();
                    email = null;
                }
            }catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
        return user;
    }
}
