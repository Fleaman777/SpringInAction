package com.filippov.rm.common.magican;

import com.filippov.rm.common.Perfomer;

public class Magician implements Perfomer {

    private MagicBox magicBox;
    private String magicWords;


    @Override
    public void perform() {
        System.out.println("Magic words: " + magicWords);
        System.out.println("Just a second please");
        System.out.println(magicBox.getContents());
    }


    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
