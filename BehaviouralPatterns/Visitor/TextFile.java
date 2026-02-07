package BehaviouralPatterns.Visitor;

public class TextFile implements Document{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
