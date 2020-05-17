package com.filippov.rm.common.helpcomponents;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void switchOffPhone(){
        System.out.println("Phone is disable");
    }

    public void applaus(){
        System.out.println("Hlop Hlop Hlop");
    }

    public void throwPomodoro(){
        System.out.println("Blump");
    }

    public void countActionsTime(ProceedingJoinPoint proceedingJoinPoint){

        long startTime = System.currentTimeMillis();

        System.out.println("from around: ");
        switchOffPhone();

        try {
            proceedingJoinPoint.proceed();
            Thread.sleep(0);
        } catch (Throwable throwable) {
            throwPomodoro();
        }

        System.out.println("from around: ");
        applaus();

        long finishTime = System.currentTimeMillis();

        System.out.println("Performance lasted " + (finishTime - startTime) + "millis");



    }

}
