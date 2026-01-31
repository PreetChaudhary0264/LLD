package structuralPatterns.Proxy.Solutionn;

public class ActualVideoDownloader implements VideoDownloader{
    @Override
    public String downloadVideo(String url) {
        System.out.println("Logic performed for downloading video");

        return "This is the content of video";
    }
}
