package Commander;

public enum Commands {
    add ("add"), print ("print"), help ("help"), end ("end");

    private String command;

    Commands(String command) {
        this.command = command;
    }

    public String toString(){
        return command;
    }

}
