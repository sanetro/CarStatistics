package com.sanetro.app.tutorlanguage.db;

import com.sanetro.app.tutorlanguage.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList = new ArrayList<>();

    public Cars() {
        carList.add(new Car("Toyota", "Corolla", 2020, "Red", 1.8, "VIN123456789"));
        carList.add(new Car("Honda", "Civic", 2019, "Blue", 2.0, "VIN987654321"));
        carList.add(new Car("Tesla", "Model 3", 2021, "Black", 0.0, "VIN123987456"));
        carList.add(new Car("Ford", "Mustang", 2018, "White", 2.3, "VIN112233445"));
        carList.add(new Car("Audi", "A4", 2022, "Gray", 2.0, "VIN998877665"));
    }

    public List<Car> getCars() {
        return carList;
    }
}
