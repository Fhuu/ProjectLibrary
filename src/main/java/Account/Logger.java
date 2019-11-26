package Account;

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

    }

    public boolean isLoggedInStat() {
        return loggedInStat;
    }

    public void setLoggedInStat(boolean loggedInStat) {
        this.loggedInStat = loggedInStat;
    }



}
