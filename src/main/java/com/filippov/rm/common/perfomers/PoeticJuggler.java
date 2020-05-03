package com.filippov.rm.common.perfomers;

import com.filippov.rm.common.interfaces.Poem;
import com.filippov.rm.common.perfomers.Juggler;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        poem.recite();
    }
}
