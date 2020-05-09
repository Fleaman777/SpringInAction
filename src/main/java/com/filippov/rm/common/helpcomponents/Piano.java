package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.magican.Instrument;

@QualifierAnnatation
public class Piano implements Instrument {

    @Override
    public void play() {
        System.out.println("PIam PIam PIam ");
    }
}
