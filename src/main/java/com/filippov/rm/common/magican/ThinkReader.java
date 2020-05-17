package com.filippov.rm.common.magican;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;


@Component("thinkReader")
public class ThinkReader {

    private String idea;

    public void yourIdea(String mean){
        System.out.println("Your idea is " + mean);
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void yourIdeaTwo(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println(
                "start interception"
        );

        Object[] args = joinPoint.getArgs();
        String mean = "";
        if (args.length != 0) {
            mean = (String) args[0];
        }
        System.out.println("Your 2 idea is " + mean);

        joinPoint.proceed();
    }
}
