package com.sanetro.app.tutorlanguage.db;

import com.sanetro.app.tutorlanguage.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList = new ArrayList<>();

    public Cars() {
        carList.add(new Car(1, "Toyota", "Corolla", 2020, "Red", 1.8, "VIN123456789"));
        carList.add(new Car(2, "Honda", "Civic", 2019, "Blue", 2.0, "VIN987654321"));
        carList.add(new Car(3, "Tesla", "Model 3", 2021, "Black", 0.0, "VIN123987456"));
        carList.add(new Car(4, "Ford", "Mustang", 2018, "White", 2.3, "VIN112233445"));
        carList.add(new Car(5, "Audi", "A4", 2022, "Gray", 2.0, "VIN998877665"));
    }

    public List<Car> getCars() {
        return carList;
    }

    public boolean isCar(Car givenCar) {
        return carList.stream()
                .anyMatch(car -> car.getId().equals(givenCar.getId()));
    }
    public boolean deleteCar(Car givenCar) {
        return carList.removeIf(car -> car.getId().equals(givenCar.getId()));
    }
}
