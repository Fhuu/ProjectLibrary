import Commander.CommandController;
import Library.BookShelfController;

import java.util.Scanner;

public class Main {

    private static BookShelfController bsc;
    private static CommandController cc;
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
        cc = CommandController.getInstance();
        scanner = new Scanner(System.in);
        bsc.init();
        System.out.println("Available commands:" +
                "\n- add  -> to add book into bookshelf" +
                "\n- print -> to see books inside bookshelf" +
                "\n- help -> to see all available commands" +
                "\nPlease input your command");
    }
}
