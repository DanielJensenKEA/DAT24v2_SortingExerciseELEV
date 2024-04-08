import java.util.Comparator;

public class LastNameComparator implements Comparator<Person> {

    public static Comparator<Person> LAST_NAME_COMPARATOR = Comparator.comparing(Person::getLastName).thenComparing(Person::getLastName);
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
