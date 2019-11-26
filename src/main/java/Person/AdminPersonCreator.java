package Person;

public class AdminPersonCreator extends APersonCreator {
    @Override
    public APerson createPerson(String name, String id, String birthday) {
        return new AdminPerson(name, id, birthday);
    }
}
