package com.filippov.rm.common.perfomers;

import com.filippov.rm.common.interfaces.Perfomer;
import com.filippov.rm.common.magican.Instrument;

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
