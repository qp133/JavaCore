import java.util.Scanner;

public class TBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm môn Toán: ");
        float diemToan = sc.nextFloat();

        System.out.println("Nhập điểm môn Văn: ");
        float diemVan = sc.nextFloat();

        System.out.println("Nhập điểm môn Hóa: ");
        float diemHoa = sc.nextFloat();

        System.out.println("Nhập điểm môn Lý: ");
        float diemLy = sc.nextFloat();

        float TBC = (diemLy + diemToan + diemHoa + diemVan)/4;
        System.out.println("Điểm trung bình các môn học là: " + TBC);
        System.out.println("Điểm trung bình " + (TBC>5 ? "Đạt" : "Không Đạt"));
    }
}
