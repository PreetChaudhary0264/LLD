package structuralPatterns.Bridge.Solution;

public class HdQuality implements VideoQuality{
    @Override
    public void load() {
        System.out.println("Streamin in Hd Quality");
    }
}
