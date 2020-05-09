package com.filippov.rm.common.perfomers;

import com.filippov.rm.common.helpcomponents.QualifierAnnatation;
import com.filippov.rm.common.interfaces.Perfomer;
import com.filippov.rm.common.magican.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Qualifier("autowiredPerfomerElite")
public class AutoWiredPerfomance implements Perfomer {

    @Autowired
    @QualifierAnnatation
    private Instrument instrument;

    @Value("${from}")
    private String propertiesFrom;

    @Override
    public void perform() {
        System.out.println("I'm autowired bean and playing on " + propertiesFrom);
        instrument.play();
    }

    @Bean()
    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
