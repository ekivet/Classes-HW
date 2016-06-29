import java.util.HashMap;
import java.util.Set;

/**
 * Created by erickivet on 6/28/16.
 */
public class User {
    private String mName;
    private HashMap<String,Playlist> mPlaylists;

    public User(String userName){
        mName = userName;
        mPlaylists = new HashMap <String, Playlist>();
    }

    public void addPlaylist(Playlist playlist){
        mPlaylists.put(playlist.getName(), playlist);
    }

    public Set<String> getAllPlaylistNames(){
        return mPlaylists.keySet()
    }

    public Playlist getPlaylistByName (String name){
        return mPlaylists.get(name);
    }
}


