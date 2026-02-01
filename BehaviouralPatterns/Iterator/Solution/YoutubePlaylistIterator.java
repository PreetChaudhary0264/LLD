package BehaviouralPatterns.Iterator.Solution;

import java.util.List;

public class YoutubePlaylistIterator implements PlaylistIterator {
    private List<Video> playlist;
    private int idx;

    public YoutubePlaylistIterator(List<Video> playlist){
        this.playlist = playlist;
        this.idx = 0;
    }

    public boolean hasNext(){
        return idx < playlist.size();
    }

    public Video next(){
        return hasNext() ? playlist.get(idx++) : null;
    }
}
