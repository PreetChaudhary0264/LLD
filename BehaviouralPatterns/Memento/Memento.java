package BehaviouralPatterns.Memento;

public class Memento {
    private final String state;

    Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
