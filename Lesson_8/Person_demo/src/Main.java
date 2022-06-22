import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService();

        ArrayList<Person> list = service.getAllPeron();
        service.show(list);

        System.out.println("Danh sách những người trên 18 tuổi:");
        service.getPersonByAge(list);

        System.out.println("-------------");
        System.out.println("Sửa tuổi của Anna thành 27:");
        service.setPersonByAge(list);

        System.out.println("-------------");
        //Lấy ra những người có địa chỉ ở Mỹ
        System.out.println("Những người có địa chỉ ở Mỹ:");
        service.getPersonByAddress(list);

        System.out.println("-------------");
        //Cập nhật địa chỉ của người có tên là Chris thành "Nhật Bản"
        System.out.println("Cập nhật địa chỉ người tên là Chris:");
        service.setPersonByAddress(list);

    }
}
