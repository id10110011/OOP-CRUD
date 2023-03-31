package com.example.factories;

import com.example.model.ElectricCar;
import com.example.model.Transport;

public class ElectricCarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new ElectricCar();
    }
}
