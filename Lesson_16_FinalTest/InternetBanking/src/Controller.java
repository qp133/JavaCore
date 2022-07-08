import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    ArrayList<User> listUser;
    UserService service;

    public Controller() {
        sc = new Scanner(System.in);
        service = new UserService();
        listUser = service.getAllUser();
    }

    public void main() {
        User userLogin = login();
        while (true) {
            System.out.println("Bạn có thể thực hiện các công việc:");
            Util.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //Truy vấn số dư
                    System.out.println("Số dư tài khoản hiện tại: " + userLogin.getAccountBalance() + " VND");
                    break;
                case 2:
                    //Chuyển tiền
                    transferMoney(userLogin);
                    break;
                case 3:
                    //Xem lịch sử giao dịch
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
            System.out.println("Nhập số điện thoại:");
            int phoneNumber = Integer.parseInt(sc.nextLine());
            for (User u : listUser) {
                if (u.getPhoneNumber() == phoneNumber) {
                    System.out.println("Nhập mật khẩu:");
                    String password = sc.nextLine();
                    if (u.getPassword().equals(password)) {
                        loginUser = u;
                        System.out.println("Đăng nhập thành công");
                        flag = false;
                    } else {
                        //Sai mật khẩu
                        flag = true;
                        System.out.println("Sai mật khẩu, vui lòng đăng nhập lại");
                    }
                }
            }
        }
        return loginUser;
    }

    public void transferMoney(User user) {
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập số tài khoản nhận tiền:");
            int receiveAccountNumber = Integer.parseInt(sc.nextLine());
            for (User u : listUser) {
                if (u.getAccountNumber() == receiveAccountNumber) {
                    System.out.println("Nhập số tiền cần chuyển:");
                    int money = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập mô tả:");
                    String info = sc.nextLine();
                    int transferAccountBalance = user.getAccountBalance();
                    int receiveAccountBalance = u.getAccountBalance();
                    if (money > 50000 && money < transferAccountBalance) {
                        transferAccountBalance = transferAccountBalance - money;
                        receiveAccountBalance = receiveAccountBalance + money;
                        System.out.println("Tài khoản số " + user.getAccountNumber() + " vừa chuyển " + money + " VND");
                        System.out.println("Tài khoản số " + receiveAccountNumber + " vừa nhận " + money + " VND");
                    }
                    flag = false;
                }
            }
        }
    }


}
