import java.util.List;
import java.util.ArrayList;

/**
 * Created by erickivet on 6/28/16.
 */
public class Playlist {
    private String mName;
    private ArrayList<Song> mSongs;

    public Playlist(String playList) {
        mName = playList;
        mSongs = new ArrayList<Song>();
    }

    public String getName(){
        return mName;
    }

    public void addSong(Song song){
        mSongs.add(song);
    }

    public void playAll(){
        for (Song song : mSongs){
            song.musicPlayer();
        }
    }
}
