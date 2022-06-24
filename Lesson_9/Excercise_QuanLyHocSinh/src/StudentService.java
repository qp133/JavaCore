import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentService implements IStudentService{
    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Hoa", 16,"HN",8.5, "10"));
        list.add(new Student(2, "Quang", 17,"HN",9, "11"));
        list.add(new Student(3, "Huy", 18,"HN",7, "12"));
        list.add(new Student(4, "Tuấn", 16,"HN",8, "10"));
        list.add(new Student(5, "Hòa", 20,"HN",6, "ĐH"));
        list.add(new Student(6, "Chi", 15,"HN",10, "9"));

        return list;
    }

    @Override
    public void addNewStudent(ArrayList<Student> list, Student student) {
        list.add(student);
    }

    @Override
    public void updateStudentPoint(Student student, double newPoint) {
        student.setPoint(newPoint);
    }

    @Override
    public void deleteStudent(ArrayList<Student> list, Student student) {
        list.remove(student);
    }

    @Override
    public void findStudentByClassroom(ArrayList<Student> list, Student student) {
        student.getClassroom();
    }

    @Override
    public void sortStudentByName(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void sortStudentByAge(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    @Override
    public void sortStudentByPoint(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getPoint() - o2.getPoint() < 0) {
                    return -1;
                }
                else if (o1.getPoint() == o2.getPoint()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        
    }


}
