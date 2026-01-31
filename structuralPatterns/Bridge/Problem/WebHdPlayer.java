package structuralPatterns.Bridge.Problem;

public class WebHdPlayer implements PlayQuality{
    @Override
    public void play(String title) {
        System.out.println("Playing in web PLayer " + title + " in hd");
    }
}
