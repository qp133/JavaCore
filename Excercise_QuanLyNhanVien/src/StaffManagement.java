import java.time.LocalDate;

public class StaffManagement {
    public Staff[] getAllStaff() {
        Staff[] arrStaff = new Staff[5];
        arrStaff[0] = new Staff("NV01", "Quang", LocalDate.of(2001,3,13),
                Gender.MALE, 123456789, "quangphung133@gmail.com", "Hà Nội");
        arrStaff[1] = new Staff("NV02", "Ngoc", LocalDate.of(1996,10,18),
                Gender.FEMALE, 234567890, "ngoc@gmail.com", "Hà Giang");
        arrStaff[2] = new Staff("NV03", "Tung", LocalDate.of(2000,11,11),
                Gender.MALE, 345678901, "tung@gmail.com", "Hà Nội");
        arrStaff[3] = new Staff("NV04", "Huy", LocalDate.of(2001,5,13),
                Gender.MALE, 456789012, "huy@gmail.com", "Đà Nẵng");
        arrStaff[4] = new Staff("NV05", "Mai", LocalDate.of(1999,10,8),
                Gender.FEMALE, 567890123, "mai@gmail.com", "Quảng Ninh");
        return arrStaff;
    }

    public void show(Staff[] arr) {
        for (Staff s : arr) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getDob() + " - " + s.getGender() +
                    " - " + s.getPhoneNumber() + " - " + s.getEmail() + " - " + s.getAddress());
        }
    }

    public void findStaffById(Staff[] arr, String id) {
        int count = 0;
        for(Staff s : arr) {
            if (s.getId().contains(id)) {
                count++;
                System.out.println(s.getId() + " - " + s.getName() + " - " + s.getDob() + " - " + s.getGender() +
                        " - " + s.getPhoneNumber() + " - " + s.getEmail() + " - " + s.getAddress());
            }
        }
        if(count == 0) {
            System.out.println("Không tìm thấy nhân viên này.");
        }
    }

    public void findStaffByName(Staff[] arr, String fName) {
        int count = 0;
        for (Staff s : arr) {
            if (s.getName().contains(fName)) {
                count++;
                System.out.println(s.getId() + " - " + s.getName() + " - " + s.getDob() + " - " + s.getGender() +
                        " - " + s.getPhoneNumber() + " - " + s.getEmail() + " - " + s.getAddress());
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy nhân viên này.");
        }
    }

    public void listStaffByMALEGender(Staff[] arr) {
        for (Staff s : arr) {
            if (s.getGender() == Gender.MALE ){
                System.out.println(s.getId() + " - " + s.getName() + " - " + s.getDob() + " - " + s.getGender() +
                        " - " + s.getPhoneNumber() + " - " + s.getEmail() + " - " + s.getAddress());
            }
        }
    }

    public void listStaffByFEMALEGender(Staff[] arr) {
        for (Staff s : arr) {
            if (s.getGender() == Gender.FEMALE ){
                System.out.println(s.getId() + " - " + s.getName() + " - " + s.getDob() + " - " + s.getGender() +
                        " - " + s.getPhoneNumber() + " - " + s.getEmail() + " - " + s.getAddress());
            }
        }
    }

    public void findStaffByAddress(Staff[] arr) {
        for (Staff s : arr) {
            if (s.getAddress().contains("Hà Nội")) {
                System.out.println(s.getId() + " - " + s.getName() + " - " + s.getDob() + " - " + s.getGender()
                + " - " + s.getPhoneNumber() + " - " + s.getEmail() + " - " + s.getAddress());
            }
        }
    }
}
