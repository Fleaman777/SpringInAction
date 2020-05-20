package com.filippov.rm.common.helpcomponents;


import com.filippov.rm.common.interfaces.Perfomer;
import org.springframework.stereotype.Component;


@Component()
public class Thinker {

    private String mean;

    public void thinkAbout(String mean, Perfomer perfomer) {
        System.out.println("I'm thinking about: " + mean);
        perfomer.perform();
        this.mean = mean;
    }

}
