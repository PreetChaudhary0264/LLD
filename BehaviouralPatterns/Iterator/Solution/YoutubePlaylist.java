package BehaviouralPatterns.Iterator.Solution;

import java.util.ArrayList;
import java.util.List;

//public class YoutubePlaylist {
//    List<Video> playlist = new ArrayList<>();
//
//    public void addVideo(Video video){
//        playlist.add(video);
//    }
//    public List<Video> getVideo(){
//        return playlist;
//    }
//}

public class YoutubePlaylist implements Playlist {
    List<Video> playlist = new ArrayList<>();

    public void addVideo(Video video){
        playlist.add(video);
    }

    @Override
    public PlaylistIterator createIterator() {
        return new YoutubePlaylistIterator(playlist);
    }
}