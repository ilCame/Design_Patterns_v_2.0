package bridge.resources.impl;

import bridge.resources.IResource;

import java.util.BitSet;

public class ArtistResource implements IResource {
    private final Artist artist;
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return artist.getBio();
    }

    @Override
    public String title() {
        StringBuilder title = new StringBuilder();

        title.append(artist.getName()).append(" ").append(artist.getSurname());

        return title.toString();
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public BitSet image() {
        return artist.getPhoto();
    }
}
