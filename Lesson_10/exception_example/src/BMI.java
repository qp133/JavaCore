import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Nhập chiều cao: ");
        double height = input();

        System.out.println("Nhập cân nặng:");
        double weight = input();

        double bmi = bmiCalculator(weight,height);
        System.out.println(bmi);
    }

    public static double bmiCalculator(double weight, double height) {
        return weight/(height*height);
    }

    public static double input() {
        //xảy ra trường hợp sai dữ liệu
        //dữ liệu nhập vào nhỏ hơn hoặc bằng 0

        Scanner sc = new Scanner(System.in);
        double num = 0;

        boolean flag = true;
        while (flag) {
            try {
                num = Double.parseDouble(sc.nextLine());
                if (num <= 0) throw new CustomException("Dữ liệu cần phải là số dương");

                flag = false;
                return num;
            } catch (CustomException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu, vui lòng nhập lại");
            }
        }

        return 0;
    }

}
