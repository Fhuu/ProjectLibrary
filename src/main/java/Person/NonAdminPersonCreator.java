package Person;

public class NonAdminPersonCreator extends APersonCreator{
    @Override
    public APerson createPerson(String name, String id, String birthday) {
        return new NonAdminPerson(name, id, birthday);
    }
}
