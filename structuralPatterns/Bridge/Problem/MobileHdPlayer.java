package structuralPatterns.Bridge.Problem;

public class MobileHdPlayer implements PlayQuality{
    @Override
    public void play(String title) {
        System.out.println("Playing in Mobile PLayer " + title + " in hd");
    }
}
