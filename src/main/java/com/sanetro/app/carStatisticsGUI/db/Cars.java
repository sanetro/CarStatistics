package com.sanetro.app.carStatisticsGUI.db;

import com.sanetro.app.carStatisticsGUI.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static Cars instance;
    private List<Car> carList = new ArrayList<>();

    public Cars() {
        carList.add(new Car(1, "Toyota", "Corolla", 2020, "Red", 1.8, "VIN123456789"));
        carList.add(new Car(2, "Honda", "Civic", 2019, "Blue", 2.0, "VIN987654321"));
        carList.add(new Car(3, "Tesla", "Model 3", 2021, "Black", 0.0, "VIN123987456"));
        carList.add(new Car(4, "Ford", "Mustang", 2018, "White", 5.0, "VIN112233445"));
        carList.add(new Car(5, "Audi", "A4", 2022, "Gray", 2.0, "VIN998877665"));
        carList.add(new Car(6, "BMW", "3 Series", 2020, "Black", 2.0, "VIN223344556"));
        carList.add(new Car(7, "Mercedes", "C Class", 2021, "Silver", 2.1, "VIN556677889"));
        carList.add(new Car(8, "Volkswagen", "Golf", 2019, "Blue", 1.6, "VIN334455667"));
        carList.add(new Car(9, "Hyundai", "Elantra", 2018, "Red", 1.6, "VIN445566778"));
        carList.add(new Car(10, "Tesla", "Camaro", 2022, "Yellow", 3.0, "VIN556677889"));
        carList.add(new Car(11, "McLaren", "Altima", 2020, "White", 2.5, "VIN667788990"));
        carList.add(new Car(12, "Kia", "Optima", 2021, "Black", 2.0, "VIN778899001"));
        carList.add(new Car(13, "Subaru", "Impreza", 2019, "Gray", 2.0, "VIN889900112"));
        carList.add(new Car(14, "McLaren", "3", 2018, "Red", 2.0, "VIN990011223"));
        carList.add(new Car(15, "McLaren", "IS", 2022, "Blue", 2.5, "VIN001122334"));
        carList.add(new Car(16, "Tesla", "S60", 2020, "White", 2.0, "VIN112233445"));
        carList.add(new Car(17, "Infiniti", "Q50", 2021, "Black", 3.0, "VIN223344556"));
        carList.add(new Car(18, "Acura", "TLX", 2019, "Silver", 2.4, "VIN334455667"));
        carList.add(new Car(19, "Jaguar", "XE", 2018, "Blue", 2.0, "VIN445566778"));
        carList.add(new Car(20, "Land Rover", "Discovery", 2022, "Green", 3.0, "VIN556677889"));
        carList.add(new Car(21, "Porsche", "Cayman", 2020, "Red", 2.0, "VIN667788990"));
        carList.add(new Car(22, "Tesla", "Portofino", 2021, "Yellow", 3.9, "VIN778899001"));
        carList.add(new Car(23, "Lamborghini", "Huracan", 2019, "Orange", 5.2, "VIN889900112"));
        carList.add(new Car(24, "Bentley", "Continental", 2018, "Black", 6.0, "VIN990011223"));
        carList.add(new Car(25, "Maserati", "Ghibli", 2022, "Blue", 3.0, "VIN001122334"));
        carList.add(new Car(26, "Alfa Romeo", "Giulia", 2020, "Red", 2.9, "VIN112233445"));
        carList.add(new Car(27, "Jaguar", "F-Type", 2021, "White", 3.0, "VIN223344556"));
        carList.add(new Car(28, "Tesla", "Vantage", 2019, "Green", 4.0, "VIN334455667"));
        carList.add(new Car(29, "Rolls-Royce", "Ghost", 2018, "Silver", 6.6, "VIN445566778"));
        carList.add(new Car(30, "McLaren", "570S", 2022, "Orange", 3.8, "VIN556677889"));
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

    public static Cars getInstance() {
        if (instance == null) {
            instance = new Cars();
        }
        return instance;
    }

}
