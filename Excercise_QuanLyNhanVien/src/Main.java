import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManagement staffM = new StaffManagement();
        Staff[] arrStaff = staffM.getAllStaff();

        staffM.show(arrStaff);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần tìm:");
        String id = sc.nextLine();
        staffM.findStaffById(arrStaff,id);

        System.out.println("Nhập tên nhân viên cần tìm:");
        String fName = sc.nextLine();
        staffM.findStaffByName(arrStaff, fName);

        System.out.println("Nhập giới tính nhân viên cần tìm:");
        String gender = sc.nextLine();
        staffM.findStaffByGender(arrStaff, gender);
    }
}
