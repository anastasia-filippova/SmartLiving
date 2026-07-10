package org.example;

public abstract class SmartDevice {
    protected  String name;
    protected  boolean isOn;
    protected RoomType room;

    public SmartDevice(RoomType room, String name) {
        this.room = room;
        this.name = name;
    }

    public final void turnOn() {
        isOn = true;
    }

    public final void turnOff() {
        isOn = false;
    }

}
