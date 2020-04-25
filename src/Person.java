import java.util.Date;

public final class Person implements Comparable<Person>{
    private String name;
    private String lastName;
    private long pesel;
    private Date dateOfBirth;

    public long getPesel() {
        return pesel;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Person(String name, String lastName, long pesel, Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Person person) {
        return pesel < person.getPesel() ? -1 :
                 pesel == person.getPesel() ? 0 : 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Pesel=" + pesel +
                ", dateOfBirth=" + dateOfBirth.getYear() +
                "." + dateOfBirth.getMonth() +
                "." + dateOfBirth.getDate() + '}';
    }
}
