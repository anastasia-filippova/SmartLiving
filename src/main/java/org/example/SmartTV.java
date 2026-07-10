package org.example;

public class SmartTV extends SmartDevice implements Controllable {

    private int volumeValue;

    public SmartTV(RoomType room, String name) {
        super(room, name);
    }

    @Override
    public void increaseValue() {
        volumeValue++;
    }

    @Override
    public void decreaseValue() {
        volumeValue--;
    }
}
