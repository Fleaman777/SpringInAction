package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.magican.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("gagag")
public class Accordion implements Instrument {

    @Override
    public void play() {
        System.out.println("I'm a garmoshcka uu uu uuu uuu");
    }
}
