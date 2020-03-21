package com.filippov.rm.common;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class OneManBand implements Perfomer {

    private Set<Instrument> instruments;


    @Override
    public void perform() {

        for (Instrument instr : instruments) {
            instr.play();
        }

    }

    public void setInstruments(Set<Instrument> instruments) {
        this.instruments = instruments;
    }
}
