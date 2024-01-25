package com.sanetro.app.tutorlanguage.controller;

import com.sanetro.app.tutorlanguage.db.Cars;
import com.sanetro.app.tutorlanguage.model.Car;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarChartController {

    @FXML
    //private BarChart<String, Number> carChart = new BarChart<String, Number>();

    private List<Car> carList = new Cars().getCars();

    @FXML
    private void initialize() {

        Map<String, Long> carCountByMake = carList.stream().collect(Collectors.groupingBy(Car::getMake, Collectors.counting()));

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Car Make Count");

        carCountByMake.forEach((make, count) -> {
            series.getData().add(new XYChart.Data<>(make, count));
        });

        //carChart.getData().add(series);

        // TODO Still in progress
    }

    private void showCarChart(Map<String, Long> carCountByMake) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Numbers of car Marks");
        xAxis.setLabel("Mark");
        yAxis.setLabel("No.");

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("2024");

        carCountByMake.forEach((make, count) -> {
            series.getData().add(new XYChart.Data<>(make, count));
        });

        barChart.getData().add(series);

        Stage stage = new Stage();
        stage.setScene(new Scene(barChart, 800, 600));
        stage.show();
    }

}

