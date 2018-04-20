package com.squarestone.services;

import com.squarestone.entities.GotBeta;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class MapService {

    //Id from server session, not client
    private static final AtomicLong counter = new AtomicLong();
    private static final GotBeta gotBeta = new GotBeta(counter.incrementAndGet());


    public static String gMap() {
        return gotBeta.getKey();
    }

    public static String gLibReq() {
        return gotBeta.getLibReq();
    }

    public static String gAutoReq() {
        return gotBeta.getAutoReq();
    }


}