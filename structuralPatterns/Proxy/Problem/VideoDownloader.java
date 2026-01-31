package structuralPatterns.Proxy.Problem;

public class VideoDownloader {
    public String downloadVideo(String url){
        //caching
        System.out.println("Logic performed for downloading video");

        return "This is the content of video";
    }

    public static void main(String[] args) {
        VideoDownloader video = new VideoDownloader();
        video.downloadVideo("proxy-pattern");

        VideoDownloader video2 = new VideoDownloader();
        video2.downloadVideo("proxy-pattern");
    }
}
