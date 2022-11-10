import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Михаил", "Бестужев-Рюмин", 25));
        people.add(new Person("Сергей", "Муравьев-Апостол", 30));
        people.add(new Person("Павел", "Пестель", 33));
        people.add(new Person("Петр", "Каховский", 29));
        people.add(new Person("Кондратий", "Рылеев", 31));
        people.add(new Person("Николай", "Император Самодержец Всероссийский", 30));


        Comparator<Person> comparator= ( o1,  o2)-> {
                if (Integer.compare(Person.surnameSize(o1.getSurname()), Person.surnameSize(o2.getSurname())) != 0) {
                    return Integer.compare(Person.surnameSize(o1.getSurname()), Person.surnameSize(o2.getSurname()));
                }
                return Integer.compare(o1.getAge(), o2.getAge());

        };
         Collections.sort(people, comparator);
        int i;
        for (i = 0; i < people.size(); i++) {
            System.out.println((i + 1) + "." + people.get(i));
        }
    }
}