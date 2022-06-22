import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("John", 30, "Mỹ"));
        list.add(new Person("Chris", 25, "Mỹ"));
        list.add(new Person("Anna", 20, "Mỹ"));
        list.add(new Person("Joe", 35, "Mỹ"));
        list.add(new Person("Medison", 19, "Mỹ"));

        System.out.println("Danh sách ban đầu:");
        for (Person p : list) {
            System.out.println(p);
        }

        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp theo tên từ A->Z:");
        for (Person p : list) {
            System.out.println(p);
        }

        System.out.println("---------------");
        //Sử dụng Comparator
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp tăng dần tuổi:");
        for (Person p : list) {
            System.out.println(p);
        }

        System.out.println("---------------");

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo tên từ A->Z:");
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
