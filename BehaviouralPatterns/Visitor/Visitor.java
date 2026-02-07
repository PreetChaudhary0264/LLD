package BehaviouralPatterns.Visitor;

public interface Visitor {
    void visit(TextFile t);
    void visit(ImageFile img);
    void visit(VideoFile vid);
}
