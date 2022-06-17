public class Teacher extends Person{
    private int salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address, int salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
