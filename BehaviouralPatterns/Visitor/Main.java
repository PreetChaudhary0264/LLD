package BehaviouralPatterns.Visitor;

public class Main {
    public static void main(String[] args) {
        Document file1 = new TextFile();
        file1.accept(new Size());
        file1.accept(new Compress());
        file1.accept(new Virus());

        Document file2 = new ImageFile();
        file2.accept(new Size());
        file2.accept(new Compress());
        file2.accept(new Virus());
    }
}
