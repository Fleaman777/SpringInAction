package com.filippov.rm.common.helpcomponents;

import com.filippov.rm.common.interfaces.Perfomer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TechnicalPersonal {

    @Pointcut(value = "execution(* com.filippov.rm.common.interfaces.Perfomer.perform())")
    public void perform(){}

    @Pointcut(value = "execution(* com.filippov.rm.common.helpcomponents.Thinker.thinkAbout(String, com.filippov.rm.common.interfaces.Perfomer)) && args(mean, perfomer)")
    public void yourIdea(String mean, Perfomer perfomer){}

    @Before("perform()")
    public void enabledLight(){
        System.out.println("Light is switched on");
    }

    @After("perform()")
    public void disabledLight(){
        System.out.println("The light is off");
    }


    @Around("perform()")
    public String switchedAudio(ProceedingJoinPoint joinPoint){
        System.out.println("The audio is on");

        try {
            joinPoint.proceed();
            System.out.println("The audio is off");
        } catch (Throwable throwable) {

        }
        return "favorite song";
    }

    @Before("yourIdea(mean, perfomer)")
    public void thinkAbout(String mean, Perfomer perfomer) {
        System.out.println("Is it your idea: " + mean);
        System.out.println("And performer: ");
        perfomer.perform();
    }


}
