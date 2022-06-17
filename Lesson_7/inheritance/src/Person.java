import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate dob;
    private String address;

    public Person() {
    }

    public Person(int id, String name, LocalDate dob, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void myMethod() {
        System.out.println("Lớp cha");
    }
    //Nếu không muốn lớp con kế thừa phương thức, sử dụng từ khóa "final"

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
