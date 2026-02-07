package BehaviouralPatterns.Visitor;

public class Size implements Visitor{
    @Override
    public void visit(TextFile t) {
        System.out.println("Size of text file is being calculated");
    }

    @Override
    public void visit(ImageFile img) {
        System.out.println("Size of image file is being calculated");
    }

    @Override
    public void visit(VideoFile vid) {
        System.out.println("Size of video file is being calculated");
    }
}
