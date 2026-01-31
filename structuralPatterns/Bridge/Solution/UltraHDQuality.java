package structuralPatterns.Bridge.Solution;

public class UltraHDQuality implements VideoQuality{
    @Override
    public void load() {
        System.out.println("Streaming in Ultra HD Quality");
    }
}
