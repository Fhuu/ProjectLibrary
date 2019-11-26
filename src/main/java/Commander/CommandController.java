package Commander;

import Library.BookShelfController;

import java.util.Scanner;

public class CommandController {

    private static CommandController cc = new CommandController();
    Commands command;

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
                System.out.println("Available commands:" +
                        "\n- add  -> to add book into bookshelf" +
                        "\n- print -> to see books inside bookshelf" +
                        "\n- help -> to see all available commands");
                break;
            case end:
                System.out.println("Thank you for using our service.\n-DB");
                break;
        }
    }

}
