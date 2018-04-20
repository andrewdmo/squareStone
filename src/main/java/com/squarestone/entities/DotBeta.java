package com.squarestone.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class DotBeta {

    //make Atomic:
    private long id;

    private String first;

    private String middle;

    private String last;

    private String addy;

    public String getAddy() {
        return addy;
    }

    public void setAddy(String addy) {
        this.addy = addy;
    }
}