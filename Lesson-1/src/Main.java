import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Xin chào");
//        System.out.println("Tôi tên là ...");
//        System.out.println(20+20);
//        System.out.println('a');
//
//        int age;        // khai báo biến
//        age = 21;
//
//        long salary = 15000000L;
//
//        System.out.println("Lương của tôi là: " + salary + "VND");
//
//        float height = 1.5f;
//        double weight = 40.5;
//
//        // Tính chỉ số bmi
//        double bmi = weight / (height*height);
//        System.out.println("Chỉ số BMI của tôi: " + bmi);
//
//        char ch = '6';
//        System.out.println(ch);
//
//        boolean flag = 5 > 6;
//        System.out.println(flag);
//
//        int a = 3;
//        int b = 4;
//        int c = 5;
//
//        System.out.println((a+b)>c ? "đúng" : "sai");
//
//        System.out.println(a%2==0 ? a + " là Số chẵn" : a + " là Số lẻ");

//      Cho 4 biến thuộc 4 môn học: Toán, Văn, Hóa, Lý. Thực hiện tính
//      trung bình cộng của 4 môn.
//      Từ kết quả đó xác định học sinh trượt/đạt (Điểm trung bình > 5)

        double diemToan = 5.5;
        double diemVan = 4.0;
        double diemLy = 3.25;
        double diemHoa = 6.0;
        double tbc = (diemToan + diemVan + diemLy + diemHoa)/4;
        System.out.println(tbc > 5 ? "Đạt" : "Trượt");

        System.out.println(Math.PI);

        System.out.println(Math.max(5,10));

        System.out.println(Math.min(5.5, 2.4));

        System.out.println(Math.sqrt(9));

        System.out.println(Math.pow(2,3));

        System.out.println(Math.random());

        //Tạo đối tượng
        // <Tên lớp> <Tên biến tham chiếu> = new <Tên class>();
        Random rd = new Random();

        int rdNumber = rd.nextInt(100);
        System.out.println("Số ngẫu nhiên: " + rdNumber);

        double rdDouble = rd.nextDouble();
        System.out.println("Số thực ngẫu nhiên: " + rdDouble);

        int randomNumber = rd.nextInt();
        System.out.println(randomNumber%2==0 ? randomNumber + " là số chẵn" : randomNumber + " là số lẻ");

        int age = 26;
        double d = age;
        System.out.println(d);

        double point = 8.5;
        int p = (int) point;
        System.out.println(p);

        int x = 10;
        int y = 3;
        System.out.println((double)x/y);
    }
}
