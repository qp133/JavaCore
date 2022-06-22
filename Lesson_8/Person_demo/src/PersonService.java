import java.util.ArrayList;

public class PersonService {
    public ArrayList<Person> getAllPeron() {
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("John", 30, "Mỹ"));
        listPerson.add(new Person("Anna", 25, "Nga"));
        listPerson.add(new Person("Joe", 17, "Canada"));
        listPerson.add(new Person("Chris", 20, "Mỹ"));
        return listPerson;
    }

    public void show(ArrayList<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }

    public void getPersonByAge(ArrayList<Person> list) {
        for (Person p : list) {
            if(p.getAge() >= 18) {
                System.out.println(p);
            }
        }
    }

    public void setPersonByAge(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals("Anna")) {
                list.get(i).setAge(27);
            }
        }
        for (Person p : list) {
            System.out.println(p);
        }
    }

    public void getPersonByAddress(ArrayList<Person> list) {
        for (Person p : list) {
            if (p.getAddress().equals("Mỹ")) {
                System.out.println(p);
            }
        }
    }

    public void setPersonByAddress(ArrayList<Person> list) {
        for (Person p : list) {
            if(p.getName().equals("Chris")) {
                p.setAddress("Nhật Bản");
                System.out.println(p);
            }
        }
    }
}
