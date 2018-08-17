package com.squarestone.services;

import com.google.gson.Gson;
import com.squarestone.entities.GoogGeo;
import com.squarestone.entities.GotBeta;
import com.squarestone.entities.Mapping;
import org.springframework.stereotype.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MapService implements Serializable {

//    private static Mapping mapping;

    //Id from server session, not client
    private static final AtomicLong counter = new AtomicLong();
    private static final GotBeta gotBeta = new GotBeta(counter.incrementAndGet());
    private static Mapping mapping = new Mapping();


    public static String gMap() {
        return gotBeta.getKey();
    }

//    public static String gEmbedReq() {
//        return gotBeta.getEmbedReq();
//    }

    public static Long gId() {
        return gotBeta.getId();
    }

    public static String gLibReq() {
        return gotBeta.getLibReq();
    }

    public static String gAutoReq() {
        return gotBeta.getAutoReq();
    }

    public static GoogGeo gGoogGeo() throws Exception {

        final Client client = ClientBuilder.newClient();

        Response googGeoResponse = client.target(gotBeta.getGoogGeo())
            .request(MediaType.APPLICATION_JSON_TYPE)
            .header("Accept", "application/json")
            .get();

        Gson gson = new Gson();
        return gson.fromJson(googGeoResponse.readEntity(String.class), GoogGeo.class);
    }


}