package assignment.bt8;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private String position;
    private List<Person> people;

    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.people = new ArrayList<Person>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // thêm 1 person vào danh sách
    public void addPerson(Person person) {
        people.add(person);
    }

    // xóa 1 person khỏi danh sách
    public void removePerson(Person person) {
        people.remove(person);
    }

    // In thông tin phòng, danh sách các person
    public void printInfo() {
        System.out.println("Room name: " + name);
        System.out.println("Position: " + position);
        System.out.println("List of people:");

        for (Person person : people) {
            System.out.println("Name: "+person.getName() + " - " + "Age: "+person.getAge() + " - " + "Telephone: "+person.getTelephone() + " - " + "Address: "+person.getAddress());
        }
    }


}
