package structuralPatterns.Bridge.Solution;

public class Main {
    public static void main(String[] args) {
        VideoPlayer video = new MobilePlayer(new HdQuality());
        video.play();
    }
}
