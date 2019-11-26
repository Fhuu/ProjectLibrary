import Account.AccountsController;
import Account.Logger;
import Command.CommandController;
import Library.BookShelfController;

import java.util.Scanner;

public class Main {

    private static BookShelfController bsc;
    private static CommandController cc;
    private static AccountsController ac;
    private static Logger logger;
    private static Scanner scanner;

    public static void main(String[] args) {

        init();

        while(true) {
            System.out.print("> ");
            String commandInput = scanner.nextLine();

            cc.validateCommand(commandInput);

            if(commandInput.toLowerCase().equals("end"))
                break;
        }
    }

    private static void init() {
        bsc = BookShelfController.getInstance();
        bsc.init();

        cc = CommandController.getInstance();

        scanner = new Scanner(System.in);

        ac = AccountsController.getInstance();
        ac.init();

        logger = Logger.getInstance();

        System.out.println(cc.help);
    }
}
