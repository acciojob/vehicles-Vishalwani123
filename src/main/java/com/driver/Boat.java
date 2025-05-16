package com.driver;

public class Boat implements WaterVehicle{

    private final String name;
    private final int capacity;

    public Boat() {
        this.name = "";
        this.capacity = 0;
    }


    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
