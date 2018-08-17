package com.squarestone.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoogGeo {


    private GoogLocation location;
    private Long accuracy;

    public GoogLocation getLocation() {
        return location;
    }

    public void setLocation(GoogLocation location) {
        this.location = location;
    }

    public Long getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Long accuracy) {
        this.accuracy = accuracy;
    }
}