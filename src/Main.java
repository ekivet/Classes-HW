public class Main {

    public static void main(String[] args) {
	    User user = new User("Eric");

        Song song1 = new Song("song 1", "artist 1", "album 1");
        Song song2 = new Song("song 2", "artist 1", "album 1");
        Song song3 = new Song("song 3", "artist 2", "album 2");
        Song song4 = new Song("song 4", "artist 3", "album 3");
        Song song5 = new Song("song 5", "artist 3", "album 4");

        Playlist playlist1 = new Playlist("playlist 1");
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song4);
        user.addPlaylist(playlist1);

        Playlist playlist2 = new Playlist("playlist 2");
        playlist2.addSong(song5);
        playlist2.addSong(song1);
        playlist2.addSong(song3);
        user.addPlaylist(playlist2);

        System.out.println("playlists: " + user.getAllPlaylistNames());

        for (String playlistName : user.getAllPlaylistNames()) {
            System.out.println("playing: " + playlistName);

            user.getPlaylistByName(playlistName).playAll();
        }
    }
}
