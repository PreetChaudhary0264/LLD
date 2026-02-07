package BehaviouralPatterns.Visitor;

public class ImageFile implements Document{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
