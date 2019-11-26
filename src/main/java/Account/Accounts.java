package Account;

import Person.APerson;

import java.util.ArrayList;

public class Accounts {
    private static Accounts acc = new Accounts();
    private ArrayList<APerson> persons = new ArrayList<>();

    public static Accounts getInstance() {
        return acc;
    }

    public void addPerson(APerson person) {
        this.persons.add(person);
    }

    public ArrayList<APerson> getPersons() {
        return persons;
    }

}
