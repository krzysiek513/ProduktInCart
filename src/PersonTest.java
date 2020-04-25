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

    public static void main(String[] args) {
        Person milosc = new Person("Agata", "Kawka", 88123043443l, new Date(1988,11,11));
        Person ktos = new Person("Agnieszka", "Bawka", 88123043453l, new Date(1988,11,11));
        Person cos = new Person("Beata", "Kowalski", 88163043443l, new Date(1988,11,11));
        Person jakos = new Person("Natalia", "Anuszewska", 88523043443l, new Date(1988,11,11));

        System.out.println(milosc);

        List<Person> anotherList = new ArrayList<Person>();
        anotherList.add(ktos);
        anotherList.add(cos);
        anotherList.add(jakos);
        anotherList.add(milosc);

        System.out.println("sortowanie po ilości produktów");
        System.out.println("---------------");
        anotherList.forEach(System.out::println);
        System.out.println("---------------");
        System.out.println("Natural ordering");
        System.out.println("---------------");
        Collections.sort(anotherList);
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
    }
}
