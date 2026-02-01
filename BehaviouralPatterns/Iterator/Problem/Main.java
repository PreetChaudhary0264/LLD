package BehaviouralPatterns.Iterator.Problem;

public class Main {
    public static void main(String[] args) {
        YoutubePlaylist playlist = new YoutubePlaylist();
        playlist.addVideo(new Video("my first video"));
        playlist.addVideo(new Video("my second video"));

        //the traversal logic is exposed to client
        //they shouldn't be knowing what traversal logic is being used
        //they shouldn't be knowing what data structures we are using
        for(Video video : playlist.getVideo()){
            System.out.println(video.getTitle());
        }
    }
}
