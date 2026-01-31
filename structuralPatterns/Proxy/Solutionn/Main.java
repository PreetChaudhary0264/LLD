package structuralPatterns.Proxy.Solutionn;

public class Main {
    public static void main(String[] args) {
        VideoDownloader video1 = new CacheVideoDownloader();
        video1.downloadVideo("proxy-pattern");

        VideoDownloader video2 = new CacheVideoDownloader();
        video2.downloadVideo("proxy-pattern");
    }
}
