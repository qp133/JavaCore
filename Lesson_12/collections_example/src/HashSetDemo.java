import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //Không cho phép chứa phần tử trùng lặp

        //Sắp xếp phần tử theo kỹ thuật hasing
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(7);

        System.out.println(hashSet);

        //Ko áp dụng kỹ thuật hasing => Đảm bảo thứ tự khi thêm phần tử
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(0);
        linkedHashSet.add(9);
        System.out.println(linkedHashSet);;

        //Sắp xếp theo thứ tự tăng dần
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(15);
        treeSet.add(7);
        treeSet.add(85);
        treeSet.add(14);
        System.out.println(treeSet);

        //Sắp xếp theo thứ tự giảm dần
        System.out.println("Sắp xếp giảm dần: " + treeSet.descendingSet());
    }
}
