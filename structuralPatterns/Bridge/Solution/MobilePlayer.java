package structuralPatterns.Bridge.Solution;

public class MobilePlayer extends VideoPlayer{

    public MobilePlayer(VideoQuality quality) {
        super(quality);
    }

    @Override
    public void play() {
        System.out.println("Mobile player is being used for streaming");
        quality.load();
    }
}
