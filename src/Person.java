import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + surname + " " + "( " + age + " )";
    }

    public static int surnameSize(String getSurname) {
        Set<String> words;
        String s1 = getSurname.replace("-", " ");
        words = new HashSet<>(List.of(s1.split("\\P{IsAlphabetic}+")));
        return words.size();
    }


}


