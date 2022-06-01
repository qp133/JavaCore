import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
//        System.out.println("Tên tôi là: " + name);

        System.out.println("Nhập tuổi của bạn: ");
        //int age = sc.nextInt();
        //sc.nextLine();                  //Xử lý trôi lệnh
        int age = Integer.parseInt(sc.nextLine());      //ép kiểu cho việc nhập tuổi để không bị trôi lệnh

        System.out.println("Địa chỉ của tôi ở: ");
        String address = sc.nextLine();

        System.out.println("Tên tôi là: " + name + ". Năm nay tôi " + age + " tuổi."
        + ", tôi đến từ " + address);

        System.out.printf("Tên tôi là %s, năm nay tôi %d tuổi, tôi đến từ %s\n", name, age, address);

        System.out.println("Nhập chiều cao: ");
//        double height = Double.parseDouble(sc.nextLine());
        float height = sc.nextFloat();
        System.out.println("Nhập cân nặng: ");
        float weight = sc.nextFloat();

        System.out.println("Chỉ số BMI là: " + weight/(height*height));
        System.out.printf("Chỉ số BMI là: %.2f", weight/(height*height));
    }
}
