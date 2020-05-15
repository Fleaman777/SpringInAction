package com.filippov.rm.common.perfomers;

import com.filippov.rm.common.interfaces.Perfomer;
import com.filippov.rm.common.magican.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ComponentAnnotationPerformer implements Perfomer {

    @Autowired
    @Qualifier("gagag")
    private Instrument accordion;

    @Override
    public void perform() {

        System.out.println("just played on ");
        accordion.play();
    }
}
