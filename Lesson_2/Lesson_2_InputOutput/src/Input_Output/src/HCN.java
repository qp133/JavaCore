import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
        float cd = sc.nextFloat();

        System.out.println("Nhập vào chiều rộng của hình chữ nhật");
        float cr = sc.nextFloat();

        float chuVi = (cd + cr) *2 ;
        float dienTich = cd * cr;

        System.out.println("Chu vi HCN là: " + chuVi);
        System.out.println("Diện tích HCN là: " + dienTich);
    }
}
