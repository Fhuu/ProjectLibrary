package Person;

public class NonAdminPerson extends APerson {

    NonAdminPerson(String name, String id, String birthday) {
        admin = false;
        setName(name);
        setId(id);
        setBirthday(birthday);
    }
}
