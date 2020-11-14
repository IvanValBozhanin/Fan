package com.company;

public class Main {

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setColor("yellow");
        f1.setSpeed(f1.FAST);
        f1.setRadius(10.0);
        f1.setSwitchedOn(true);

        Fan f2 = new Fan();
        f2.setSpeed(f1.MEDIUM);
        f2.setColor("blue");
        f2.setRadius(5.0);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
