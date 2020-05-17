package com.filippov.rm;

import com.filippov.rm.common.helpcomponents.Thinker;
import com.filippov.rm.common.interfaces.AdditionalAction;
import com.filippov.rm.common.perfomers.Juggler;
import com.filippov.rm.common.interfaces.Perfomer;
import com.filippov.rm.common.Test;
import com.filippov.rm.common.dynamicchanges.StandUpComic;
import com.filippov.rm.common.world.Cities;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
//        Juggler juggler = (Juggler) applicationContext.getBean("duke");
        Perfomer duke2 = (Perfomer) applicationContext.getBean("duke2");
//        Perfomer kenny = (Perfomer) applicationContext.getBean("kenny");
//        Perfomer kenny2 = (Perfomer) applicationContext.getBean("kenny2");
        Perfomer henry = (Perfomer) applicationContext.getBean("Henry");
//        Perfomer copySong = (Perfomer) applicationContext.getBean("copySong");
//        juggler.perform();
//        duke2.perform();
        Cities cities = (Cities) applicationContext.getBean("cities");
        Perfomer saxophonist1 = (Perfomer) applicationContext.getBean("saxophonist1");
        Perfomer saxophonist2 = (Perfomer) applicationContext.getBean("saxophonist2");
        Perfomer harry = (Perfomer) applicationContext.getBean("Harry");
        Perfomer lookUpBoy = (Perfomer) applicationContext.getBean("LookUpBoy");
        StandUpComic standuper = (StandUpComic) applicationContext.getBean("standuper");
        Perfomer autowiredPerfomer = (Perfomer) applicationContext.getBean("autowiredPerfomer");
        Perfomer componentAnnPerformer = (Perfomer) applicationContext.getBean("componentAnnotationPerformer");
        Perfomer poeticJuggler2 = (Perfomer) applicationContext.getBean("jugglerPoetic2");
        Thinker thinker = (Thinker) applicationContext.getBean("thinker2");

        Test test1 = (Test) applicationContext.getBean("test");
//        Test test4 = (Test) applicationContext.getBean("test2");

//        test1.printCount();
//        test4.printCount();
//        kenny.perform();
//        kenny2.perform();
//        henry.perform();
//        copySong.perform();

//        System.out.println(cities.getCitiesList());
//        cities.getBigCities();
//        cities.getSpecialCity();
//        saxophonist1.perform();
//        saxophonist2.perform();

//        harry.perform();
        lookUpBoy.perform();
        if (lookUpBoy instanceof AdditionalAction) {
            AdditionalAction additionalAction = (AdditionalAction) lookUpBoy;
            additionalAction.performAdditionalAction();
        }
//        standuper.talkStrory();
//        autowiredPerfomer.perform();
//        componentAnnPerformer.perform();
//        poeticJuggler2.perform();
//
//        thinker.thinkAbout("animals");
    }
}
