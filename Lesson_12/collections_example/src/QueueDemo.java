import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        //Sắp xếp dựa theo mức độ ưu tiên
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        //Nếu thêm thành công => True
        //Nếu không thêm thành công => Ném ra 1 ngoại lệ
        priorityQueue.add(5);
        priorityQueue.add(7);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(4);

        System.out.println(priorityQueue);

        //Lấy ra phần tử đầu tiên sau đó xóa luôn phần tử đó
        //Nếu danh sách không có phần tử nào => Null
        System.out.println("Phần tử đầu tiên: " + priorityQueue.poll());

        //Giống poll nhưng nếu danh sách k có phần tử nào => Ngoại lệ
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);

        //Lấy ra phần tử đầu tiên nhưng không xóa
        //Nếu danh sách không có phần tử nào => Null
        System.out.println("Phần tử đầu tiên: " + priorityQueue.peek());

        //Nếu danh sách không có phần tử nào => Ném ra ngoại lệ
        System.out.println(priorityQueue.element());

        //Cũng có thể dùng offer để thêm phần tử
        //Nếu thêm thành công => True
        //Nếu không thêm thành công => False
        priorityQueue.offer(8);
        System.out.println(priorityQueue);


        //Sử dụng LinkedList như một Queue
        //Duy trì thứ tự chứ không dựa theo mức độ ưu tiên
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.offer(4);
        linkedList.add(12);
        linkedList.add(9);
        linkedList.add(3);
        System.out.println(linkedList);


        //Có thể thao tác ở cả đầu và cuối của danh sách
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(5);
        arrayDeque.add(3);
        arrayDeque.add(1);
        arrayDeque.add(9);
        System.out.println(arrayDeque);

        arrayDeque.addFirst(8);
        arrayDeque.addLast(7);
        System.out.println(arrayDeque);

        //Lấy ra phần tử đầu/cuối
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());

        //Xóa phần tử với remove cũng có xóa phần tử đầu/cuối
    }
}
