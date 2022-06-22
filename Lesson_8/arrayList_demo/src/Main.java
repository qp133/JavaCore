import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(5);
        listInteger.add(2);
        listInteger.add(9);
        listInteger.add(7);

        System.out.println(listInteger);        //không sử dụng vòng lặp for để duyệt đối tượng
        for (Integer i : listInteger) {         //sử dụng vòng lặp for
            System.out.print(i + "\t");
        }
        System.out.println();

        listInteger.add(2,6);       //chèn vào vị trí số 2 phần tử 6
        System.out.println("Danh sách sau khi chèn:");
        System.out.println(listInteger);

        listInteger.set(0,8);       //cập nhật phần tử ở vị trí 0 với giá trị mới là 8
        System.out.println("Danh sách sau khi cập nhật:");
        System.out.println(listInteger);

        listInteger.remove(0);      //xóa phần tử tại vị trí 0
        System.out.println("Danh sách sau khi xóa phần tử:");
        System.out.println(listInteger);

        System.out.println(listInteger.indexOf(9));     //tìm vị trí của giá trị 9 trong mảng

        System.out.println("Kích thước của mảng: " + listInteger.size());   //lấy kích thước mảng

        //Lấy ra phần tử cuối cùng
        System.out.println("Phần tử ở vị trí cuối cùng: " + listInteger.get(listInteger.size()-1));

        Collections.sort(listInteger);      //sắp xếp các phần tử với Collections, mặc định là sxep tăng dần
        System.out.println(listInteger);

        Collections.reverse(listInteger);   //sắp xếp giảm dần với reverse
        System.out.println(listInteger);

        Collections.shuffle(listInteger);   //đảo ngẫu nhiên các phần tử trong mảng
        System.out.println(listInteger);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(4);
        list2.addAll(listInteger);      //thêm tất cả các phần tử của listInteger vào list2
        list2.addAll(1,listInteger);    //thêm phần tử như trên nhưng bắt đầu từ vị trí số 1
        System.out.println(list2);
    }
}
