import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person2 = new Person();
        person2.setName("Mukhammed");
        person2.setId(1);
        person2.setAge(23);
        person2.setGroup("Java evening");

        Person person3 = new Person();
        person3.setName("Rahim");
        person3.setId(2);
        person3.setAge(22);
        person3.setGroup("Java morning");

        Person person4 = new Person();
        person4.setName("Maksat");
        person4.setId(3);
        person4.setAge(31);
        person4.setGroup("Java online");

        Person[] teacher = {person2,person3,person4};
        findById(teacher);
    }
    public static void findById(Person[] teachers){
        for (Person person1:teachers) {
            System.out.println(person1.getId());
            System.out.println(person1.getName());
            System.out.println(person1.getAge());
            System.out.println(person1.getGroup());

        }
    }

}
