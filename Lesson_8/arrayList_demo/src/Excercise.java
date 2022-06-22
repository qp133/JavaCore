import java.util.ArrayList;

public class Excercise {
    public static void main(String[] args) {
        //Tạo ArrayList để chứa các phần tử kiểu String
        //Thêm các phần tử vào ArrayList
        //Lấy ra só lượng phần tử
        //Đếm các phần tử Java trong ArrayList

        ArrayList<String> listString = new ArrayList<>();
        listString.add("Java");
        listString.add("HTML");
        listString.add("Python");
        listString.add("Java");
        listString.add("Flutter");
        listString.add("Java");

        System.out.println("Số lượng phần tử: " + listString.size());

        String str = "Java";
        int count = 0;
        for (String s : listString) {
            if(s.contains(str)) {
                count++;
            }
        }
        System.out.println("Số lượng phần tử Java trong mảng: " + count);
    }
}
