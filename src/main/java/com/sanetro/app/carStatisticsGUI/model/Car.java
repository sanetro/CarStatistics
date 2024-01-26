package com.sanetro.app.carStatisticsGUI.model;

public class Car {
    private Integer id;
    private String brand;
    private String model;
    private Integer year;
    private String color;
    private Double engineSize;
    private String vin;

    public Car() {
    }

    public Car(Integer id, String brand, String model, Integer year, String color, Double engineSize, String vin) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.vin = vin;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Double getEngineSize() {
        return engineSize;
    }

    public String getVin() {
        return vin;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(Double engineSize) {
        this.engineSize = engineSize;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}

