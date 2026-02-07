package BehaviouralPatterns.Memento;

import java.util.Stack;

public class Caretaker {
    Stack<Memento> stack = new Stack<>();

    public void save(Memento m){
        stack.push(m);
    }
    public Memento undo(){
        return stack.pop();
    }
}
