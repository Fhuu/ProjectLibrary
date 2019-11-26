package Account;

import Person.APerson;

import java.util.Scanner;

public class Logger {
    private static Logger logger = new Logger();
    private boolean loggedInStat;


    Logger() {
        loggedInStat = false;
    }

    public static Logger getInstance() {
        return logger;
    }

    public void login() {
        String[] data = collectData();
        if(checkUserAccount(data[0], data[1], data[2])) {
            System.out.println("Welcome " + data[0].toUpperCase());
            loggedInStat = true;
        }
        else {
            System.out.println("No matching profile identified");
        }
    }

    private String[] collectData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("ID: ");
        String id = scanner.next();
        System.out.print("Birthdate(dd/mm/yyyy): ");
        String date = scanner.next();
        return new String[] {name, id, date};
    }

    private boolean checkUserAccount(String name, String id, String birthday) {
        for (APerson person : Accounts.getInstance().getPersons()) {
            if (person.getName().equals(name)
                    && person.getID().equals(id)
                    && person.getBirthday().equals(birthday))
                return true;
        }
        return false;
    }

    public boolean isLoggedInStat() {
        return loggedInStat;
    }

    public void setLoggedInStat(boolean loggedInStat) {
        this.loggedInStat = loggedInStat;
    }



}
