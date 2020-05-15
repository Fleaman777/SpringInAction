package com.filippov.rm.common.perfomers;

import com.filippov.rm.common.helpcomponents.Sonnet29;
import com.filippov.rm.common.interfaces.Perfomer;
import com.filippov.rm.common.interfaces.Poem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PerfomerConfig {

    @Bean
    public Perfomer jugglerPoetic2(){
        return new PoeticJuggler(2, poemForJuggler());
    }

    @Bean
    public Poem poemForJuggler(){
        return new Sonnet29();
    }

}
