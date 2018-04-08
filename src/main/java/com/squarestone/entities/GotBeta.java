package com.squarestone.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class GotBeta {


    private final long id; //not Long
    private String key;

    //private-public:
    GotBeta(long id) {
        this.id = id;
        this.key = "AIzaSyDFkGNUTGT2ZpmlB_yUnHFb9mWM-wxtCRQ";
    }

    public long getId() {
        return id;
    }

    //private-public:
    String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}