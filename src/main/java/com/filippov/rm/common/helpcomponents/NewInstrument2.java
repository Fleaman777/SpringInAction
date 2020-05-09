package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.magican.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("newInstrument")
public class NewInstrument2 implements Instrument {
    @Override
    public void play() {
        System.out.println("new instrument 2 wowo wowo wowo");
    }
}
