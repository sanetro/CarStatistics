package com.sanetro.app.tutorlanguage.model;

public class Car {
    private Integer id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double engineSize;
    private String vin;

    public Car() {
    }

    public Car(Integer id, String make, String model, int year, String color, double engineSize, String vin) {
        this.id = id;
        this.make = make;
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

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getVin() {
        return vin;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


}

