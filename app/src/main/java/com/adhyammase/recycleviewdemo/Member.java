package com.adhyammase.recycleviewdemo;

public class Member {

    String name;
    String email;
    int photoID;

    Member(String name, String email, int photoID) {
        this.name = name;
        this.email = email;
        this.photoID = photoID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
