import java.util.ArrayList;

public interface IStudentService {
    public void addNewStudent(ArrayList<Student> list, Student student);

    public void updateStudentPoint(Student student, double newPoint);

    public void deleteStudent(ArrayList<Student> list, Student student);

    public void findStudentByClassroom(ArrayList<Student> list, Student student);

    public void sortStudentByName(ArrayList<Student> list);

    public void sortStudentByAge(ArrayList<Student> list);

    public void sortStudentByPoint(ArrayList<Student> list);
}
