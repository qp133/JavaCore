import Service.UsersManagement;
import model.Users;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UsersManagement management = new UsersManagement();
        Users[] arrUsers = management.getAllUsers();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập email:");
        String email = sc.nextLine();
        System.out.println("Nhập password");
        String password = sc.nextLine();

        boolean checkLogin = management.checkLogin(email, password, arrUsers);

        if(checkLogin) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Thất bại");
        }

        Users usersLogin = management.checkLoginReturnUser(email, password, arrUsers) ;
        if (usersLogin != null) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Thất bại");
        }
    }
}
