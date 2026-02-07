package BehaviouralPatterns.Visitor;

public class Virus implements Visitor{
    public void visit(TextFile t) {
        System.out.println("Scanning text file for viruses");
    }

    @Override
    public void visit(ImageFile img) {
        System.out.println("Scanning image file for viruses");
    }

    @Override
    public void visit(VideoFile vid) {
        System.out.println("Scanning video file for viruses");
    }
}
