package structuralPatterns.Proxy.Solutionn;

import java.util.HashMap;

//proxy layer
public class CacheVideoDownloader implements VideoDownloader{
    private static HashMap<String,String> cache = new HashMap<>();
    public static ActualVideoDownloader realDownloader = new ActualVideoDownloader();

//    static{
//        realDownloader = new ActualVideoDownloader();
//        cache = new HashMap<>();
//    }

//    public CacheVideoDownloader(){
//        this.cache = new HashMap<>();
//        this.realDownloader = new ActualVideoDownloader();
//    }

    @Override
    public String downloadVideo(String url) {
        if(cache.containsKey(url)){
            System.out.println("Returning from cache");
            return "This is the content of video";
        }
        String content = realDownloader.downloadVideo(url);
        System.out.println("Downloading video and returning");
        cache.put(url,"This is cached");
        return "This is the content of video";
    }
}
