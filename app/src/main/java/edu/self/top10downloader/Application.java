package edu.self.top10downloader;

/**
 * Created by mlinaberry on 1/11/16.
 */
public class Application {
    private String name;
    private String artist;
    private String releaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Artist: " + artist + "\n" +
                "Release Date: " + releaseDate + "\n";
    }
}
