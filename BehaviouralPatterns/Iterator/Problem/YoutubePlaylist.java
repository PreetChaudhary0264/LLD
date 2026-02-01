package BehaviouralPatterns.Iterator.Problem;

import java.util.ArrayList;
import java.util.List;

public class YoutubePlaylist {
    List<Video> playlist = new ArrayList<>();

    public void addVideo(Video video){
        playlist.add(video);
    }
    public List<Video> getVideo(){
        return playlist;
    }
}
