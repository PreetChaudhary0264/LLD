package BehaviouralPatterns.Visitor;

public class Compress implements Visitor{
    @Override
    public void visit(TextFile t) {
        System.out.println("Text file is being compressed");
    }

    @Override
    public void visit(ImageFile img) {
        System.out.println("image file is being compressed");
    }

    @Override
    public void visit(VideoFile vid) {
        System.out.println("video file is being compressed");
    }
}
