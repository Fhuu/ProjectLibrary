package Command;

import Account.Logger;
import Library.BookShelfController;

import java.util.Scanner;

public class CommandController {

    private static CommandController cc = new CommandController();
    Commands command;
    public final String help = "Available commands:" +
            "\n- add  -> to add book into bookshelf" +
            "\n- print -> to see books inside bookshelf" +
            "\n- login -> to log into a profile" +
            "\n- check-profile -> to check whether you are logged in" +
            "\n- help -> to see all available commands";

    private CommandController() {

    }

    public static CommandController getInstance() {
        return cc;
    }

    public void setCommand(Commands command) {
        this.command = command;
    }

    public Commands getCommand() {
        return command;
    }

    public void validateCommand(String commandInput) {
        for(Commands command : Commands.values()) {
            if (command.toString().equals(commandInput.toLowerCase())) {
                cc.processCommand(command);
            }
        }
    }

    public void processCommand(Commands command) {
        Scanner scanner = new Scanner(System.in);
        switch (command) {
            case add :
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();
                System.out.print("number of page: ");
                int pageNumber = scanner.nextInt();
                BookShelfController.getInstance().addBook(title, isbn, pageNumber);
                break;
            case print :
                BookShelfController.getInstance().printBookShelf();
                System.out.println("---------------------D-I-R-O-L-I-B-R-A-R-Y-------------------\n");
                break;
            case help:
                System.out.println(help);
                break;
            case login:
                Logger logger = Logger.getInstance();
                logger.login();
                break;
            case check_profile:
                System.out.println(Logger.getInstance().isLoggedInStat());
                break;
            case end:
                System.out.println("Thank you for using our service.\n-DB");
                break;
        }
    }

}
