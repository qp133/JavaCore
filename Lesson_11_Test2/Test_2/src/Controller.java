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

    public void main() {
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

    public String Input(ArrayList<User> list) {
        //username input
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            String usernamePattern = "\\w+";
            System.out.print("Nhập username: ");
            String username = sc.nextLine();

            flag = username.matches(usernamePattern) && checkUsername(username);

            if (!flag) System.out.println("Kiểm tra lại username, vui lòng nhập lại");
        } while (!flag);
        System.out.println("Username hợp lệ");

        //password input
        do {
            System.out.print("Nhập password: ");
            String password = sc.nextLine();

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
                        String email = sc.nextLine();
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
        return null;
    }

    public boolean checkUsername(String username) {
        return service.checkUsername(list, username);
    }

//    public String passwordInput(ArrayList<User> list) {
//        boolean flag;
//        Scanner sc = new Scanner(System.in);
//        String passwordPattern = "\\w+";
//        System.out.print("Nhập password: ");
//        String input = sc.nextLine();
//
//        flag = input.matches(passwordPattern) && checkPassword(input);
//
//        if (!flag) {
//            System.out.println("Kiểm tra lại password, vui lòng nhập lại");
//            Util.wrongPassword();
//            int wrongPass = Integer.parseInt(sc.nextLine());
//            switch (wrongPass) {
//                case 1:
//                    passwordInput(list);
//                    break;
//                case 2:
//                    System.out.println("Nhập email để đổi mật khẩu:");
//                    String email = sc.nextLine();
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Không có lựa chọn này.");
//                    main();
//            }
//        }
//        System.out.println("Password hợp lệ");
//        return null;
//    }

    public boolean checkPassword(String password) {
        return service.checkPassword(list, password);
    }

    public void loginSucceed(ArrayList<User> list) {
        System.out.println("Chào mừng, bạn có thể thực hiện các công việc sau:");
        Util.submenu();
        int subMenu = Integer.parseInt(sc.nextLine());
        switch (subMenu) {
            case 1:
                System.out.println("Thay đổi username");
                break;
            case 2:
                break;
            case 3:
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

    public void updateUsername(User user, String newUsername) {

    }
}