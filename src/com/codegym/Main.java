package com.codegym;

public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        System.out.println(fan1.toString());


        Fan fan2 = new Fan(true);
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println(fan2.toString());
    }
}
