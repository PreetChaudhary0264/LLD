package BehaviouralPatterns.Command;

public class Remote {
    Command command;

    void setCommand(Command c){
        this.command = c;
    }

    public void pressButton(){
        command.execute();
    }
}
