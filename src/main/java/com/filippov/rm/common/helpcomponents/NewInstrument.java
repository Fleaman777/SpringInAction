package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.magican.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("newInstrument")
public class NewInstrument implements Instrument {
    @Override
    public void play() {
        System.out.println("wow wow wow wow");
    }
}
