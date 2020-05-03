package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.magican.Instrument;

public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("Brink Brink Brink");
    }
}
