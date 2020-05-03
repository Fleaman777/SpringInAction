package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.magican.Instrument;

public class Saxophone implements Instrument {

    private static int saxophoneNumber;

    public Saxophone() {
        saxophoneNumber++;
    }

    @Override
    public void play() {
        System.out.println("Saxophone tu tu tu");
        System.out.println("Saxophone # " + saxophoneNumber);
    }
}
