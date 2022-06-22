import java.time.LocalDate;

public class Staff {
    private String id;
    private String name;
    private LocalDate dob;
    private Enum Gender;
    private int phoneNumber;
    private String email;
    private String address;

    public Staff() {
    }

    public Staff(String id, String name, LocalDate dob, Enum gender, int phoneNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        Gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Enum getGender() {
        return Gender;
    }

    public void setGender(Enum gender) {
        Gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
