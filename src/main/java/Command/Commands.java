package Command;

public enum Commands {
    add ("add"), print ("print"), help ("help"), login("login"), check_profile("check-profile"), end ("end");

    private String command;

    Commands(String command) {
        this.command = command;
    }

    public String toString(){
        return command;
    }

}
