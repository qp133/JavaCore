import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    ArrayList<User> list;
    UserService service;

    public Controller() {
        service = new UserService();
        list = service.getAllUser();
        sc = new Scanner(System.in);
    }

    public void main(){
        while (true) {
            Util.menu();
            System.out.println("Lựa chọn của bạn là:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Input(list);
                    loginSucceed(list);
                    break;
                case 2:
                    User newUser = createNewUser();
                    service.addNewUser(list, newUser);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


    public void show(ArrayList<User> list) {
        for (User u : list) {
            System.out.println(u.toString());
        }
    }

    public String Input(ArrayList<User> list){
        //username input
        boolean flag;
        Scanner sc = new Scanner(System.in);
        String username;
        do {
            String usernamePattern = "\\w+";
            System.out.print("Nhập username: ");
            username = sc.nextLine();

            flag = username.matches(usernamePattern) && checkUsername(username);

            if (!flag) System.out.println("Kiểm tra lại username, vui lòng nhập lại");
        } while (!flag);
        System.out.println("Username hợp lệ");

        //password input
        String password;
        do {
            System.out.print("Nhập password: ");
            password = sc.nextLine();

            flag = checkPassword(password);

            if (!flag) {
                System.out.println("Kiểm tra lại password, vui lòng nhập lại");
                Util.wrongPassword();
                int wrongPass = Integer.parseInt(sc.nextLine());
                switch (wrongPass) {
                    case 1:
                        Input(list);
                        break;
                    case 2:
                        System.out.println("Nhập email để đổi mật khẩu:");
                        String emailInput = sc.nextLine();
                        for (User u : list) {
                            if (emailInput.equals(u.getEmail())) {
                                u.setActive(true);
                                System.out.println("Đổi mật khẩu mới:");
                                updatePassword();
                            }
                        }
                        main();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này.");
                        main();
                }
            }
        } while (!flag);
        System.out.println("Password hợp lệ");
        for (User u : list) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                u.setActive(true);
            }
        }
        return null;
    }

    public boolean checkUsername(String username) {
        return service.checkUsername(list, username);
    }

    public boolean checkPassword(String password) {
        return service.checkPassword(list, password);
    }

    public void loginSucceed(ArrayList<User> list){
        System.out.println("Chào mừng, bạn có thể thực hiện các công việc sau:");
        Util.submenu();
        int subMenu = Integer.parseInt(sc.nextLine());
        switch (subMenu) {
            case 1:
                System.out.println("Thay đổi username:");
                updateUsername();
                loginSucceed(list);
                break;
            case 2:
                System.out.println("Thay đổi Email:");
                updateEmail();
                loginSucceed(list);
                break;
            case 3:
                System.out.println("Thay đổi password:");
                updatePassword();
                loginSucceed(list);
                break;
            case 4:
                System.out.println("Đăng xuất");
                main();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

    public void updateUsername() {
        String newUsername = sc.nextLine();
        for (User u : list) {
            if (u.isActive()) {
                service.updateUsername(u, newUsername);
                System.out.println("Thông tin sau khi thay đổi: " + u);
            }
        }
    }

    public void updateEmail() {
        String newEmail = sc.nextLine();
        for (User u : list) {
            if (u.isActive()) {
                service.updateEmail(u, newEmail);
                System.out.println("Thông tin sau khi thay đổi: " + u);
            }
        }
    }

    public void updatePassword() {
        String newPassword = sc.nextLine();
        for (User u : list) {
            if (u.isActive()) {
                service.updatePassword(u, newPassword);
                System.out.println("Thông tin sau khi thay đổi: " + u);
            }
        }
    }

    public User createNewUser() {
        String username;
        boolean flag;
        do {
            System.out.println("Nhập username: ");
            username = sc.nextLine();
            flag = !checkUsername(username);
            if (!flag) {
                System.out.println("Username bị trùng, vui lòng nhập lại");
            }
        } while(!flag);
        System.out.println("Username hợp lệ");

        String email;
        do {
            System.out.println("Nhập Email: ");
            email = sc.nextLine();
            flag = checkEmail(email) ;

            if (!flag) {
                System.out.println("Email bị trùng, vui lòng nhập lại");
            }
        } while(!flag);
        System.out.println("Email hợp lệ");

        System.out.println("Nhập password: ");
        String password = sc.nextLine();

        boolean active = false;

        return new User(username, password, email, active);
    }

    public boolean checkEmail(String email) {
        return service.checkEmail(list, email);
    }
}