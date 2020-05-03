package com.filippov.rm.common.perfomers;

import com.filippov.rm.common.interfaces.Perfomer;

public class CopySong implements Perfomer {
    private String song;

    @Override
    public void perform() {
        System.out.println("Copy song: " + song);
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
