package bridge.resources.impl;

import java.util.BitSet;

public class Artist {
    private String bio;
    private String name;
    private String surname;
    private BitSet photo;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BitSet getPhoto() {
        return photo;
    }

    public void setPhoto(BitSet photo) {
        this.photo = photo;
    }
}
