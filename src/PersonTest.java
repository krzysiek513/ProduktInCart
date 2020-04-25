import java.util.*;

public class PersonTest {

    static final Comparator<Person> IMIE_ROSNIE =
            new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return p1.getName().compareTo(p2.getName()); }
            };

    static final Comparator<Person> IMIE_MALEJE =
            new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return p2.getName().compareTo(p1.getName()); }
            };

    static final Comparator<Person> NAZWISKO_ROSNIE =
            new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return p1.getLastName().compareTo(p2.getLastName()); }
            };

    static final Comparator<Person> NAZWISKO_MALEJE =
            new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return p2.getLastName().compareTo(p1.getLastName()); }
            };

    static final Comparator<Person> PESEL_SORT =
            new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return (p2.getPesel() < p1.getPesel() ? -1 :
                            (p2.getPesel() == p1.getPesel() ? 0 : 1)); }
            };

    static final Comparator<Person> DATA_ROSNIE =
            new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return p1.getDateOfBirth().compareTo(p2.getDateOfBirth()); }
            };

    static final Comparator<Person> DATA_MALEJE =
            new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return p2.getDateOfBirth().compareTo(p1.getDateOfBirth()); }
            };

    public static void main(String[] args) {
        Person milosc = new Person("Agata", "Kawka", 88123043443l, new Date(1988,11,11));
        Person ktos = new Person("Agnieszka", "Bawka", 88123043453l, new Date(1988,11,5));
        Person cos = new Person("Beata", "Kowalski", 88163043443l, new Date(1988,11,22));
        Person jakos = new Person("Natalia", "Anuszewska", 88523043443l, new Date(1988,11,1));

        System.out.println(milosc);

        List<Person> anotherList = new ArrayList<Person>();
        anotherList.add(ktos);
        anotherList.add(cos);
        anotherList.add(jakos);
        anotherList.add(milosc);

        System.out.println("---------------");
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("Natural ordering");
        System.out.println("---------------");
        Collections.sort(anotherList);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie, PESEL_SORT");
        System.out.println("---------------");
        Collections.sort(anotherList, PESEL_SORT);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie, IMIE_ROSNIE");
        System.out.println("---------------");
        Collections.sort(anotherList, IMIE_ROSNIE);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie, IMIE_MALEJE");
        System.out.println("---------------");
        Collections.sort(anotherList, IMIE_MALEJE);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie, NAZWISKO_ROSNIE");
        System.out.println("---------------");
        Collections.sort(anotherList, NAZWISKO_ROSNIE);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie, NAZWISKO_MALEJE");
        System.out.println("---------------");
        Collections.sort(anotherList, NAZWISKO_MALEJE);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie, DATA_ROSNIE");
        System.out.println("---------------");
        Collections.sort(anotherList, DATA_ROSNIE);
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("sortowanie, DATA_MALEJE");
        System.out.println("---------------");
        Collections.sort(anotherList, NAZWISKO_MALEJE);
        anotherList.forEach(System.out::println);

    }
}
