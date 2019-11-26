package Person;

public class AdminPerson extends APerson {

    AdminPerson(String name, String id, String birthday) {
        admin = true;
        setName(name);
        setId(id);
        setBirthday(birthday);
    }

}
