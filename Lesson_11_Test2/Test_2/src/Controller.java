import java.util.Scanner;

public class Controller {
    Scanner sc;

    public void main() {
        sc = new Scanner(System.in);
        while (true) {
            Util.menu();
            System.out.println("Lựa chọn của bạn là:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Đăng nhập");
                    usernameInput();

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
        sc = new Scanner(System.in);

        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            String usernamePattern = "\\w+";
            System.out.print("Nhập user name: ");
            String input = sc.next();
            flag = input.matches(usernamePattern);

            if (!flag) System.out.println("Kiểm tra lại username, vui lòng nhập lại");
        } while (!flag);

        System.out.println("Username hợp lệ");
        return null;
    }


}
