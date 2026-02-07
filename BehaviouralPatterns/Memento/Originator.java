package BehaviouralPatterns.Memento;

//Text editor
public class Originator {
    String text = "";

    void write(String s){
        text += s;
    }

    public Memento save(){
        return new Memento(text);
    }

    void restore(Memento state){
        this.text = state.getState();
    }
    public String getText(){
        return text;
    }
}
