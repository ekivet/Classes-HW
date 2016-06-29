/**
 * Created by erickivet on 6/28/16.
 */
public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song(String songName, String artistName, String albumName){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void musicPlayer(){
        System.out.println("This track is " + mSongName + " by " + mArtistName + " from their album " + mAlbumName);
    }

    //getters and setters

    public String getSong(){
        return mSongName;
    }

    public void setSong(String songName){
        mSongName = songName
    }

    public String getArtist(){
        return mArtistName;
    }

    public void setArtist(String artistName){
        mArtistName = artistName
    }

    public String getAlbum(){
        return mAlbumName;
    }

    public void setAlbum(String albumName){
        mAlbumName = albumName
    }
}
