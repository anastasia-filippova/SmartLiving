package org.example;

public class SmartLight extends SmartDevice implements Controllable {

    private int lightValue;

    public SmartLight(RoomType room, String name) {
        super(room, name);
    }

    @Override
    public void increaseValue() {
        lightValue++;
    }

    @Override
    public void decreaseValue() {
        lightValue--;
    }

}
