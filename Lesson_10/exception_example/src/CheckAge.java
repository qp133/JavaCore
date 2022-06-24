import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

        int age = getAge();
        System.out.println(age);

    }

    public static int getAge(){
        Scanner sc = new Scanner(System.in);

        int age = 0;

        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập tuổi của bạn");
                age = Integer.parseInt(sc.nextLine());

                if (age < 0) throw new CustomException("Tuổi phải là số dương");

                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu, vui lòng nhập lại");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Tuổi của bạn là: " + age);
        }
        return age;
    }

}
