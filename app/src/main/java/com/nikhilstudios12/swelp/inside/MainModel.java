package com.nikhilstudios12.swelp.inside;

public class MainModel {
    Integer founders;
    String foundersName;

    public MainModel(Integer founders,String foundersName){
        this.founders = founders;
        this.foundersName = foundersName;
    }

    public Integer getFounders() {
        return founders;
    }

    public String getFoundersName() {
        return foundersName;
    }
}