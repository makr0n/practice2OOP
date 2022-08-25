import java.util.ArrayList;

public class Person {
    private String fullName;
//    private String relation;
    private ArrayList<Person> family = new ArrayList<>();

    public Person(String fullName) {
        this.fullName = fullName;
    }

//    public spouse()

    public void appendToFamily(Person person) {
        if (person != null && person != this) {
            family.add(person);
        }

    }

    public ArrayList<Person> getFamily() {
        return family;
    }

    public String getFullName() {
        return fullName;
    }

}
