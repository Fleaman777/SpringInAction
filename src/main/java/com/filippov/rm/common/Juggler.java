package com.filippov.rm.common;

public class Juggler implements Perfomer {

    private int beanBags;

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler() {
    }

    @Override
    public void perform() {
        System.out.println("Throw up " + beanBags);
    }
}
