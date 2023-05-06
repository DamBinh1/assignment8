package assignment.bt8;

public class Main3 {
    public static void main(String[] args) {
        // Tạo ra một đối tượng Person
        Person person1 = new Person("Nam", 19, "8657354", "Ha Noi");
        Person person2 = new Person("Duy", 19, "8574645", "Hue");
        Person person3 = new Person("Van", 19, "6532454", "Da Nang");
        Person person4 = new Person("Bac", 19, "8763533", "Hai Phong");



        // Tạo ra một đối tượng Room
        Room room = new Room("Room T2210A", "1st floor");

        // Thêm person vào danh sách
        room.addPerson(person1);
        room.addPerson(person2);
        room.addPerson(person3);
        room.addPerson(person4);
        // Xóa person khỏi danh sách
        room.removePerson(person4);
        // In ra thông tin của room
        room.printInfo();


    }
}
