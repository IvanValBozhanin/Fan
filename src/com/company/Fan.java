package com.company;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean switchedOn = false;
    private double radius = 5.0;
    private String color = "blue";


    public Fan() {
    }

    @Override
    public String toString() {
        String ret;
        if(isSwitchedOn()){
            ret = speed + " " + color + " " + radius;
        } else {
            ret = color + " " + radius + " the fan is off.";
        }
        return ret;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
