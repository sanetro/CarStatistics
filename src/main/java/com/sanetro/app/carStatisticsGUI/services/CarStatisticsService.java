package com.sanetro.app.carStatisticsGUI.services;

import com.sanetro.app.carStatisticsGUI.model.Car;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarStatisticsService {

    public Map<String, Long> countCarsByBrand(List<Car> carList) {
        return carList.stream()
                .collect(Collectors.groupingBy(Car::getBrand, Collectors.counting()));
    }

    public Map<Integer, Long> countCarsByYear(List<Car> carList) {
        return carList.stream()
                .collect(Collectors.groupingBy(Car::getYear, Collectors.counting()));
    }

    public Map<String, Long> countCarsByColor(List<Car> carList) {
        return carList.stream()
                .collect(Collectors.groupingBy(Car::getColor, Collectors.counting()));
    }

    public Map<Double, Long> countCarsByEngineSize(List<Car> carList) {
        return carList.stream()
                .collect(Collectors.groupingBy(Car::getEngineSize, Collectors.counting()));
    }
}
