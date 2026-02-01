package BehaviouralPatterns.Iterator.Solution;

public class Main {
    public static void main(String[] args) {
        YoutubePlaylist playlist = new YoutubePlaylist();
        playlist.addVideo(new Video("first-video"));
        playlist.addVideo(new Video("second-video"));


        //still client is creating object and knowing which parameters are passed and also which iterator is being used

//        PlaylistIterator playlistIterator = new YoutubePlaylistIterator(playlist.getVideo());
//        while(playlistIterator.hasNext()){
//            System.out.println(playlistIterator.next().getTitle());
//        }

        PlaylistIterator iterator = playlist.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }
}
