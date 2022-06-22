public class Main {
    public static void main(String[] args) {

        //Upcasting
        Person p = new Teacher();
        p.myMethod();

        //Downcasting
        Teacher t = (Teacher) p;
        t.subMethod();

//        Person person = new Person();     lỗi khi tạo đối tượng từ lớp abstract
    }
}
