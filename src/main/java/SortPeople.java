import java.util.Arrays;
import java.util.Collections;

public class SortPeople {


    public static void main(String[] args) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Sixten", "Ottesen", 15, 1.90),
                new Person("Jeppe", "Jensen", 42, 2.80),
                new Person("Jesper", "Poulsen", 30, 1.88),
                new Person("Janne", "Suzuki", 28, 1.95)
        };


        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\nSortering pba. " +ANSI_RED+"alder:"+ANSI_RESET);
        Arrays.sort(people);
        for(Person person : people) {
            System.out.println("Fornavn: " + person.getFirstName() + ", Efternavn: " + person.getLastName() + ", "+
                    ANSI_RED+"Alder: "+ANSI_RESET + person.getAge() + ", Højde: " + person.getHeight());
        }



        Arrays.sort(people,new LastNameComparator());

        // skriv kode herunder COMPARABLE
        System.out.println("\nSortering pba. "+ANSI_RED+"efternavn:"+ANSI_RESET);
        for (Person person : people) {
            System.out.println("Fornavn: " + person.getFirstName() + ", "+ANSI_RED+"Efternavn: "+
                    ANSI_RESET + person.getLastName() + ", "+"Alder: " +
                    person.getAge() +", Højde: " + person.getHeight());
        }


    }


}
