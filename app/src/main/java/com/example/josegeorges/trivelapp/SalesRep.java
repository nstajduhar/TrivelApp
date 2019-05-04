package com.example.josegeorges.trivelapp;

/**
 * Created by josegeorges on 2017-12-20.
 *
 * this class holds the properties for each sales rep.
 */
public class SalesRep {

    //properties
    private String name;
    private String email;
    private String phone;
    private String social;
    private int imageID;

    //constructor
    public SalesRep(String name, String email, String phone, String social, int imageID){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.social = social;
        this.imageID = imageID;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSocial() {
        return phone;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
