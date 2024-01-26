package com.sanetro.app.carStatisticsGUI.controller;

import com.sanetro.app.carStatisticsGUI.template.AbstractHandleButtonBackAndChangeView;
import com.sanetro.app.carStatisticsGUI.db.Cars;
import com.sanetro.app.carStatisticsGUI.model.Car;
import com.sanetro.app.carStatisticsGUI.services.CarStatisticsService;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.util.List;
import java.util.Map;

public class CarChartController extends AbstractHandleButtonBackAndChangeView {
    @FXML
    private BarChart<Number, String> carChart;
    private final CarStatisticsService carStatisticsService = new CarStatisticsService();
    private final List<Car> carList = new Cars().getInstance().getCars();

    @FXML
    private void initialize() {
        NumberAxis xAxis = new NumberAxis();

        xAxis.setLabel("Count");

        XYChart.Series<Number, String> seriesByBrandName = new XYChart.Series<>();
        seriesByBrandName.setName("Brands");

        XYChart.Series<Number, String> seriesByColor = new XYChart.Series<>();
        seriesByColor.setName("Colors");

        XYChart.Series<Number, String> seriesByYear = new XYChart.Series<>();
        seriesByYear.setName("Years");

        XYChart.Series<Number, String> seriesByEngineSize = new XYChart.Series<>();
        seriesByEngineSize.setName("Engine Sizes");

        Map<String, Long> carCountByBrand = carStatisticsService.countCarsByBrand(carList);
        carCountByBrand.forEach((brand, count) -> seriesByBrandName.getData().add(new XYChart.Data<>(count, brand)));

        Map<String, Long> carCountByColor = carStatisticsService.countCarsByColor(carList);
        carCountByColor.forEach((color, count) -> seriesByColor.getData().add(new XYChart.Data<>(count, color)));

        Map<Integer, Long> carCountByYear = carStatisticsService.countCarsByYear(carList);
        carCountByYear.forEach((year, count) -> seriesByYear.getData().add(new XYChart.Data<>(count, String.valueOf(year))));

        Map<Double, Long> carCountByEngineSize = carStatisticsService.countCarsByEngineSize(carList);
        carCountByEngineSize.forEach((engineSize, count) -> seriesByEngineSize.getData().add(new XYChart.Data<>(count, String.format("%.1f L", engineSize))));

        carChart.getData().addAll(seriesByBrandName, seriesByColor, seriesByYear, seriesByEngineSize);
    }
}

