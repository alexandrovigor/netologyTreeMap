import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Михаил", "Бестужев-Рюмин", 25));
        people.add(new Person("Сергей", "Муравьев-Апостол", 30));
        people.add(new Person("Павел", "Пестель", 33));
        people.add(new Person("Петр", "Каховский", 29));
        people.add(new Person("Кондратий", "Рылеев", 31));
        people.add(new Person("Николай", "Император Самодержец Всероссийский", 30));

        Predicate<Person> oldPerson = person -> person.getAge() < 30;
        people.removeIf(oldPerson);

        Collections.sort(people, new StatusComporator());
        int i;
        for (i = 0; i < people.size(); i++) {
            System.out.println((i + 1) + "." + people.get(i));
        }
    }
}