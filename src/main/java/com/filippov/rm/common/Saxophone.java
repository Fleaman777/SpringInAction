package com.filippov.rm.common;

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
