package com.squarestone.entities;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GMap {

    //Id from server session, not client
    private static final AtomicLong counter = new AtomicLong();
    private static final GotBeta gotBeta = new GotBeta(counter.incrementAndGet());


    public static String gMap() {
        return gotBeta.getKey();
    }

}