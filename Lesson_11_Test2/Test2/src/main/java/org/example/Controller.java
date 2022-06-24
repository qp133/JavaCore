package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    ArrayList<User> list = new ArrayList<>();

    UserService service = new UserService();
    Gson gson = new Gson();

    public void main() {
        UserService.readJsonFile(list, gson);

        sc = new Scanner(System.in);
        while (true) {
            Util.menu();
            System.out.println("Lựa chọn của bạn là:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Đăng nhập");
                    usernameInput();
                    checkUserName();

                    passWordInput();
                    checkPassword();

                    loginSucceed();
                    Util.submenu();
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



    public String usernameInput() {
        boolean flag;
            do {
                String usernamePattern = "\\w+";
                System.out.print("Nhập user name: ");
                String input = sc.next();
                flag = input.matches(usernamePattern);
                if (!flag) {
                    System.out.println("Kiểm tra lại username, vui lòng nhập lại");
                }
            } while (!flag);
        return null;
    }

    public String checkUserName() {
        String input = usernameInput();
        for (User u : list) {
            if (u.getUsername().contains(input)) {
                System.out.println("Username hợp lệ");
            }
        }
        System.out.println("Username hợp lệ");
        return null;
    }

    public String passWordInput() {
        boolean flag;
        do {
            String passwordPattern = "\\w+";
            System.out.print("Nhập password: ");
            String input = sc.next();
            flag = input.matches(passwordPattern);
            if (!flag) {
                System.out.println("Sai password");
                Util.wrongPassword();
            }
        } while (!flag);
        return null;
    }

    public String checkPassword() {
        String input = passWordInput();
        for (User u : list) {
            if (u.getPassword().contains(input)) {
                System.out.println("Password hợp lệ");
            }
        }
        System.out.println("Password hợp lệ");
        return null;
    }

    public void loginSucceed() {
        System.out.println("Đăng nhập thành công, chào mừng");

        while (true) {
            Util.submenu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }

    }
}
