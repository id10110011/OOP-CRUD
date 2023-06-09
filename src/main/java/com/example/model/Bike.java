package com.example.model;

import com.example.annotation.FieldInformation;
import com.example.annotation.GetMethod;
import com.example.annotation.SetMethod;

import java.util.Objects;

public class Bike extends Transport {

    @FieldInformation(name = "Диаметр колес", type = "Double")
    private double wheelsDiameter;
    @FieldInformation(name = "Тип велосипеда", type = "BikeType")
    private BikeType bikeType;

    public Bike() {

    }

    public Bike(final TransportColor color, final int amountOfWheels, final int amountOfSeats, final String vin,
                final float wheelsDiameter, final BikeType bikeType) {

        super(color, amountOfWheels, amountOfSeats, vin);
        this.wheelsDiameter = wheelsDiameter;
        this.bikeType = bikeType;
    }

    @GetMethod(name = "Тип велосипеда", returnType = "BikeType")
    public BikeType getBikeType() {
        return bikeType;
    }

    @SetMethod(name = "Тип велосипеда", typeParameter = "BikeType")
    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    @GetMethod(name = "Диаметр колес", returnType = "Double")
    public double getWheelsDiameter() {
        return wheelsDiameter;
    }

    @SetMethod(name = "Диаметр колес", typeParameter = "Double")
    public void setWheelsDiameter(double wheelsDiameter) {
        this.wheelsDiameter = wheelsDiameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike bike)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(bike.getWheelsDiameter(), getWheelsDiameter()) == 0 && getBikeType() == bike.getBikeType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWheelsDiameter(), getBikeType());
    }
}
