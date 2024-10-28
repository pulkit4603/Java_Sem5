public class Tester {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(1, new Song("Song 1", "Genre 1", 5.5));
        playlist.addSong(2, new Song("Song 2", "Genre 2", 3.2));
        playlist.addSong(3, new Song("Song 3", "Genre 3", 2.5));

        System.out.println("Before adding the next song:");
        playlist.printSongs();

        playlist.addNext(new Song("Song 4", "Genre 4", 4.9));

        System.out.println("After adding the next song:");
        playlist.printSongs();

        playlist.removeSong(2);

        System.out.println("After removal:");
        playlist.printSongs();
    }
}
