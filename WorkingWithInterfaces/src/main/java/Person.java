import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Mohamed", "Jami", 23));
        myFamily.add(new Person("Shima", "Jami", 21));
        myFamily.add(new Person("Sabrina", "Jami", 18));
        myFamily.add(new Person("Haider", "Jami", 15));
        myFamily.add(new Person("Ahmed", "Jami", 14));
        myFamily.add(new Person("Amani", "Jami", 9));

        System.out.println("Before Sorting: ");
        for (Person p : myFamily) {
            System.out.println(p);
        }

        Collections.sort(myFamily);

        System.out.println("After Sorting: ");
        for (Person p : myFamily) {
            System.out.println(p);
        }
    }

    @Override
    public int compareTo(Person other) {
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }

        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }

        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}