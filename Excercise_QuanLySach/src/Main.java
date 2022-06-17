import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        Book[] arrBook = service.getAllBook();

        service.show(arrBook);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên quyển sách cần tìm: ");
        String fName = sc.nextLine();

        service.findBookByName(arrBook, fName);

        System.out.println("Nhập tên thể loại sách cần tìm: ");
        String fCategory = sc.nextLine();
        service.findBookByCategory(arrBook, fCategory);

        System.out.println("Danh sách sách xuất bản trong năm nay: ");
        int year = LocalDate.now().getYear();
        service.findBookByYear(arrBook, year);
    }
}
