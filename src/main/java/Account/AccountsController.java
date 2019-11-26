package Account;

import Person.APerson;
import Person.APersonCreator;
import Person.NonAdminPersonCreator;

public class AccountsController {
    private static AccountsController bookShelfController = new AccountsController();
    private Accounts accounts;
    private APersonCreator personCreator;

    private AccountsController() {
        accounts = Accounts.getInstance();
    }

    public static AccountsController getInstance() {
        return bookShelfController;
    }

    public void init() {
        personCreator = new NonAdminPersonCreator();

        accounts.addPerson(personCreator.createPerson("Diro", "566367", "05/05/1997"));

        accounts.addPerson(personCreator.createPerson("Jacq", "123859", "26/09/1997"));

        accounts.addPerson(personCreator.createPerson("Viola", "574903", "29/09/1999"));
    }

    public void addBook(String name, String id, String birthday) {
        accounts.addPerson(personCreator.createPerson(name, id, birthday));
    }

    public void printBookShelf() {
        for(APerson account : accounts.getPersons()) {
            System.out.println("Name: " + account.getName() +
                    "    ID: " + account.getID() +
                    "    Birthday: " + account.getBirthday());
        }
    }


}
