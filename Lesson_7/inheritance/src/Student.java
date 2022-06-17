import java.time.LocalDate;

public class Student extends Person{
    private double point;

    public Student() {
    }

    public Student(int id, String name, LocalDate dob, String address, double point) {
        super(id, name, dob, address);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public void myMethod() {
        super.myMethod();
        System.out.println("Lớp con");
    }
}
