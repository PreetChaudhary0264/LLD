package structuralPatterns.Bridge.Problem;

public class SmartTVUltraHrPlayer implements PlayQuality{
    @Override
    public void play(String title) {
        System.out.println("Playing in SmartTV PLayer " + title + " in Ultra HD");
    }
}
