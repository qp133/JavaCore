import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
    StudentService service;
    ArrayList<Student> listStudent;

    Scanner sc;

    public Controller() {
        service = new StudentService();
        listStudent = service.getAllStudent();
        sc = new Scanner(System.in);
    }

    public void main() {
        while (true) {
            Util.menu();
            System.out.println("Lựa chọn của bạn là:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Xem Danh sách học sinh:");
                    show(listStudent);
                    break;
                case 2:
                    System.out.println("Thêm học sinh:");
                    Student newStudent = createNewStudent();
                    service.addNewStudent(listStudent, newStudent);
                    break;
                case 3:
                    System.out.println("Cập nhật lại điểm:");
                    updateStudentPoint();
                    break;
                case 4:
                    System.out.println("Xóa học sinh:");
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Danh sách học sinh theo lớp:");
                    findStudentByClassroom();
                    break;
                case 6:
                    System.out.println("Sắp xếp theo tên:");
                    sortStudentByName();
                    break;
                case 7:
                    System.out.println("Sắp xếp theo tuổi:");
                    sortStudentByAge();
                    break;
                case 8:
                    System.out.println("Sắp xếp theo điểm:");
                    sortStudentByPoint();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void show(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public Student createNewStudent() {
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();
        System.out.println("Nhập điểm: ");
        double point = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lớp:");
        String classroom = sc.nextLine();

        Student newStudent = new Student(id, name, age, address, point, classroom);

        return newStudent;
    }

    public Student findStudentById() {
        System.out.println("Nhập id học sinh:");
        int id = Integer.parseInt(sc.nextLine());
        for (Student s : listStudent) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;

    }

    public void updateStudentPoint() {
        Student fStudent = findStudentById();
        if (fStudent != null) {
            System.out.println(fStudent);
        } else {
            System.out.println("Không tìm thấy học sinh");
        }
        System.out.println("Nhập điểm mới:");
        double newPoint = Double.parseDouble(sc.nextLine());

        service.updateStudentPoint(fStudent, newPoint);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(fStudent);
    }

    public void deleteStudent() {
        Student fStudent = findStudentById();
        if (fStudent != null) {
            System.out.println(fStudent);
        } else {
            System.out.println("Không tìm thấy học sinh");
        }
        service.deleteStudent(listStudent, fStudent);
    }

    public void findStudentByClassroom() {
        System.out.println("Nhập lớp học:");
        String classroom = sc.nextLine();
        for (Student s : listStudent) {
            if (s.getClassroom().equals(classroom)) {
                System.out.println(s);
            }
        }
    }

    public void sortStudentByName() {
        service.sortStudentByName(listStudent);
        for (Student s : listStudent) {
            System.out.println(s);
        }
    }

    public void sortStudentByAge() {
        service.sortStudentByAge(listStudent);
        for (Student s : listStudent) {
            System.out.println(s);
        }
    }

    public void sortStudentByPoint() {
        service.sortStudentByPoint(listStudent);
        for (Student s : listStudent) {
            System.out.println(s);
        }
    }
}
