package com.filippov.rm;

import com.filippov.rm.common.Juggler;
import com.filippov.rm.common.Perfomer;
import com.filippov.rm.common.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
        Juggler juggler = (Juggler) applicationContext.getBean("duke");
        Perfomer duke2 = (Perfomer) applicationContext.getBean("duke2");
//        Perfomer kenny = (Perfomer) applicationContext.getBean("kenny");
//        Perfomer kenny2 = (Perfomer) applicationContext.getBean("kenny2");
        Perfomer henry = (Perfomer) applicationContext.getBean("Henry");
//        juggler.perform();
//        duke2.perform();

        Test test1 = (Test) applicationContext.getBean("test");
//        Test test4 = (Test) applicationContext.getBean("test2");

//        test1.printCount();
//        test4.printCount();
//        kenny.perform();
//        kenny2.perform();
        henry.perform();
    }
}
