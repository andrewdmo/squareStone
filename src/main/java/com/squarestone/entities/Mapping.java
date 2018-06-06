package com.squarestone.entities;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "session")
public class Mapping extends SimpleModule {

    private String gaddy = "";

    private String defaultGaddy = "3917+university+drive+durham+nc";

    private String Coord;

    private double CoordX;

    private double CoordY;

    private String defaultCoord = "35.9657642,-78.9567109";

    private double defaultCoordX = 35.9657642;

    private double defaultCoordY = -78.9567109;

    public String getGaddy() {
        return gaddy;
    }

//    public String getGaddy() {
//        if (gaddy != null) {
//            return gaddy;
//        } else {
//            return defaultGaddy;
//        }
//    }

//    do same for Coords...

    public void setGaddy(String gaddy) {
        this.gaddy = gaddy;
    }

    public String getDefaultGaddy() {
        return defaultGaddy;
    }

    public void setDefaultGaddy(String defaultGaddy) {
        this.defaultGaddy = defaultGaddy;
    }

    public String getCoord() {
        return Coord;
    }

    public void setCoord(String coord) {
        Coord = coord;
    }

    public double getCoordX() {
        return CoordX;
    }

    public void setCoordX(double coordX) {
        CoordX = coordX;
    }

    public double getCoordY() {
        return CoordY;
    }

    public void setCoordY(double coordY) {
        CoordY = coordY;
    }

    public String getDefaultCoord() {
        return defaultCoord;
    }

    public void setDefaultCoord(String defaultCoord) {
        this.defaultCoord = defaultCoord;
    }

    public double getDefaultCoordX() {
        return defaultCoordX;
    }

    public void setDefaultCoordX(double defaultCoordX) {
        this.defaultCoordX = defaultCoordX;
    }

    public double getDefaultCoordY() {
        return defaultCoordY;
    }

    public void setDefaultCoordY(double defaultCoordY) {
        this.defaultCoordY = defaultCoordY;
    }
}