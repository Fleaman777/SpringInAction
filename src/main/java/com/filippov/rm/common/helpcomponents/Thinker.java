package com.filippov.rm.common.helpcomponents;


import org.springframework.stereotype.Component;


@Component("thinker2")
public class Thinker {

    private String mean;

    public void thinkAbout(String mean) {
        System.out.println("I'm thinking about: " + mean);
        this.mean = mean;
    }

}
