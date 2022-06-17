public class Student extends Person{
    private double theoreticalPoint;
    private double practicePoint;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double theoreticalPoint, double practicePoint) {
        super(id, name, age, address);
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public double getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(double theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public double getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(double practicePoint) {
        this.practicePoint = practicePoint;
    }
}
