public class Person {
    private String name;
    private String surname;

    public String toString() {
        return name + surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson1(Person person1) {
        person1.setName("Ilya ");
        person1.setSurname("Lagutenko");
    }
}

