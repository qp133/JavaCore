import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Lambda chỉ áp dụng với interface 1 phương thức (functinal)
        //Nếu interface có từ 2 phương thức trở lên -> Không áp dụng được

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(5);
        list.add(4);

        //Lambda & Method Reference
//        //Cách thông thường
//        for (Integer i : list) {
//            System.out.print(i + "\t");
//        }
//
//        System.out.println();
//
//        //Lambda
//        list.forEach(n -> System.out.print(n + "\t"));
//
//        System.out.println();
//
//        //Cách thông thường khi sắp xếp
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        list.forEach(n -> System.out.print(n + "\t"));
//
//        System.out.println();
//
//        //Lambda
//        list.sort((o1,o2) -> o1 - o2);
//        list.forEach(n -> System.out.print(n + "\t"));
//        list.forEach(System.out::print);    //Method reference
//
//        //Sử dụng lớp vô danh (Cách thông thường)
//        IAddNumber addNumber = new IAddNumber() {
//            @Override
//            public int addTwoNumber(int a, int b, int c) {
//                return a + b + c;
//            }
//
////            @Override
////            public void method() {
////
////            }
//        };
//        System.out.println(addNumber.addTwoNumber(4,5, 6));
//
//        //Sử dụng Lambda
//        IAddNumber addNumber1 = (a,b,c) -> {return a + b + c;};
//        System.out.println(addNumber1.addTwoNumber(10,20, 30));
//
//        IPrint print = () -> {
//            System.out.println("Xin chào");
//            System.out.println("Tôi tên là Quang");
//        };
//
//        print.method();
//
//        Collections.sort(list, Integer::compareTo);
//        System.out.println(list);
//
//        ArrayList<Person> arrayList = new ArrayList<>();
//        Collections.sort(arrayList, (p1,p2) -> Person.compareByAge(p1,p2));
//
//        Collections.sort(arrayList, Person::compareByAge);

        //Stream API
        //Lọc ra các phần tử là số chẵn -> In ra màn hình
        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        //Sắp xếp: Chỉ sắp xếp tăng dần
        list.stream().sorted().forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        //Sắp xếp giảm dần -> dùng Comparator
        list.stream().sorted((i1,i2) -> i2 - i1).forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        //Map dùng để ánh xạ: Nhân các phần tử với 10
        list.stream().map(i -> i*10).forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        //Lọc trùng lặp. Sắp xếp giảm dần. In thông tin
        list.stream().distinct().sorted((i1,i2) -> i2 - i1).forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        //Đếm số chẵn
        //Count trả về số kiểu long -> tạo 1 biến kiểu long để hứng kết quả
        long count = list.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);

        System.out.println();

        //Tìm min,max
        //Get trả về kiểu T, tạo 1 biến
        Integer max = list.stream().max(Integer::compare).get();
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println(max + " - " + min);

        System.out.println();

        //Lấy ra 4 phần tử đầu tiên
        list.stream().limit(4).forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        //skip để bỏ qua 2 phần tử đầu tiên
        list.stream().skip(2).limit(4).forEach(i -> System.out.print(i + "\t"));
    }
}
