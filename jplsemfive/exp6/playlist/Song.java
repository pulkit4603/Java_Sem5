package jplsemfive.exp6.playlist;
class Song {
    private String title;
    private String genre;
    private double playTime;

    public Song(String title, String genre, double playTime) {
        this.title = title;
        this.genre = genre;
        this.playTime = playTime;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPlayTime() {
        return playTime;
    }
}

