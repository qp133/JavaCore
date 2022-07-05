import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();        //Sử dụng LinkedList như 1 List

        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("...: " + linkedList.get(1));

        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        linkedList.forEach(i-> System.out.println(i));

    }
}
