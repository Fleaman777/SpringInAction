package com.filippov.rm.common;

import org.graalvm.compiler.core.common.Fields;
import org.springframework.context.ApplicationListener;

import java.lang.reflect.Field;

public class Instrumentalist implements Perfomer{

    private String song;
    private Instrument instrument;

    @Override
    public void perform() {
        System.out.println("Start play music");
        getInstrument().play();
        System.out.println(song + "Song");


        String s = new String("123");



    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
