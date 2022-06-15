public class Main {
    public static void main(String[] args) {
        //Tạo 1 đối tượng mới
        Person hoa = new Person();
        hoa.name = "Hoa";
        hoa.age = 21;
        hoa.address = "Hà Nội";

        System.out.println(hoa.name + " - " + hoa.age + " - " + hoa.address);

        hoa.study();

        Person tuan = new Person();
        tuan.name = "Tuấn";
        tuan.age = 17;
        tuan.address = "Quảng Ninh";

        System.out.println(tuan.name + " - " + tuan.age + " - " + tuan.address);

//        Dog dog1 = new Dog();
//        dog1.breed = "Neapolitan Mastiff";
//        dog1.size = "Large";
//        dog1.age = 5;
//        dog1.color = "Black";
//        System.out.println(dog1.breed + " - " + dog1.size + " - " + dog1.age + " - " + dog1.color);
//
//        Dog dog2 = new Dog();
//        dog2.breed = "Maltese";
//        dog2.size = "Small";
//        dog2.age = 2;
//        dog2.color = "White";
//        System.out.println(dog2.breed + " - " + dog2.size + " - " + dog2.age + " - " + dog2.color);
//
//        Dog dog3 = new Dog();
//        dog3.breed = "Chow chow";
//        dog3.size = "Midium";
//        dog3.age = 3;
//        dog3.color = "Brown";
//        System.out.println(dog3.breed + " - " + dog3.size + " - " + dog3.age + " - " + dog3.color);

        Person quang = new Person("Quang", 21, "Hà Nội");
        System.out.println(quang.name + " - " + quang.address);

        Person[] arrPerson = new Person[4];
        arrPerson[0] = hoa;
        arrPerson[1] = tuan;
        arrPerson[2] = quang;
        arrPerson[3] = new Person("Hùng", 21, "Hà Nội");

        for(Person person : arrPerson) {
            System.out.println(person.name + " - " + person.age + " - " + person.address);
        }

        System.out.println("Danh sách những người có tuổi từ 18 trở lên:");
        //Cách 1:
        for (int i = 0; i < arrPerson.length; i++) {
            if(arrPerson[i].age >= 18) {
                System.out.println(arrPerson[i].name + " - " + arrPerson[i].age + " - " + arrPerson[i].address);
            }
        }

        //Cách 2:
        for (Person person : arrPerson) {
            if(person.age >= 18) {
                System.out.println(person.name + " - " + person.age + " - " + person.address);
            }
        }

        //Tìm người tên Hoa
        String fName = "Hoa";
        System.out.println("Danh sách những người tên Hoa:");
        for (Person person : arrPerson) {
            if(person.name.contains(fName)) {
                System.out.println(person.name + " - " + person.age + " - " + person.address);
            }
        }
    }
}
