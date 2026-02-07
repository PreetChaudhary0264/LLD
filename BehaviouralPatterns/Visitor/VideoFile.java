package BehaviouralPatterns.Visitor;

public class VideoFile implements Document{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
