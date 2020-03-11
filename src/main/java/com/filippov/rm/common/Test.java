package com.filippov.rm.common;

public class Test {

    public Test() {
        count++;
    }

    private static int count = 0;

    public static Test getInstance() {
        return new Test();
    }

    public void printCount() {
        System.out.println(count);
    }
}
