package com.squarestone.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class GotBeta {

    private static Mapping mapping;

    private final long id; //not Long
    private String key = "AIzaSyAEgsGQb9pHiOX0p8-VpZj46VMwOxg0csU";
    //    private String embedReq = "https://google.com/maps/embed/v1/place?key" + key + "&amp;q=" + mapping.getDefaultGaddy();
    private String libReq;
    private String autoReq;


    //private-public:
    public GotBeta(long id) {
        this.id = id;
//        this.key = key;
//        this.embedReq = embedReq;
        this.libReq = "https://maps.googleapis.com/maps/api/js?key=" + key + "&amp;libraries=places";
        this.autoReq = "https://maps.googleapis.com/maps/api/js?key=" + key + "&amp;libraries=places&amp;callback=initAutocomplete async defer";
    }

    public long getId() {
        return id;
    }

    //private-public:
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLibReq() {
        return libReq;
    }

    public void setLibReq(String libReq) {
        this.libReq = libReq;
    }

    public String getAutoReq() {
        return autoReq;
    }

    public void setAutoReq(String autoReq) {
        this.autoReq = autoReq;
    }

//    public String getEmbedReq() {
//        return embedReq;
//    }
//
//    public void setEmbedReq(String embedReq) {
//        this.embedReq = embedReq;
//    }
}