package com.squarestone.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoogGeo {


    public GoogLocation location;
    public String accuracy;

}