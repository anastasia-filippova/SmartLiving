package org.example;

public class SmartThermostat extends SmartDevice implements Controllable{

    private int tempValue;

    public SmartThermostat(RoomType room, String name) {
        super(room, name);
    }

    @Override
    public void increaseValue() {
        tempValue++;
    }

    @Override
    public void decreaseValue() {
        tempValue--;
    }
}
