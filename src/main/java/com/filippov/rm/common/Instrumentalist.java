package com.filippov.rm.common;

public class Instrumentalist implements Perfomer {

    private String song;
    private Instrument instrument;

    @Override
    public void perform() {
        System.out.println("Start play music");
        instrument.play();
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
