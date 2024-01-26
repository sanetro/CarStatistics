package com.sanetro.app.carStatisticsGUI.controller;

import com.sanetro.app.carStatisticsGUI.template.AbstractHandleButtonBackAndChangeView;
import com.sanetro.app.carStatisticsGUI.db.Cars;
import com.sanetro.app.carStatisticsGUI.model.Car;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainPanelOpenerController extends AbstractHandleButtonBackAndChangeView {
    @FXML
    private TableColumn<Car, Void> deleteColumn = new TableColumn<Car, Void>();
    private Cars cars = new Cars();
    @FXML
    private TableView<Car> carTableView = new TableView<Car>();
    @FXML
    private TableColumn<Car, Integer> idColumn = new TableColumn<Car, Integer>();
    @FXML
    private TableColumn<Car, String> brandColumn = new TableColumn<Car, String>();
    @FXML
    private TableColumn<Car, String> modelColumn = new TableColumn<Car, String>();
    @FXML
    private TableColumn<Car, Integer> yearColumn = new TableColumn<Car, Integer>();
    @FXML
    private TableColumn<Car, String> colorColumn = new TableColumn<Car, String>();
    @FXML
    private TableColumn<Car, Double> engineSizeColumn = new TableColumn<Car, Double>();
    @FXML
    private TableColumn<Car, String> vinColumn = new TableColumn<Car, String>();

    @FXML
    public void initialize() {
        carTableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        ObservableList<Car> carItems = FXCollections.observableArrayList(cars.getCars());
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<>("brand"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
        colorColumn.setCellValueFactory(new PropertyValueFactory<>("color"));
        engineSizeColumn.setCellValueFactory(new PropertyValueFactory<>("engineSize"));
        vinColumn.setCellValueFactory(new PropertyValueFactory<>("vin"));
        carTableView.setItems(carItems);

        deleteColumn.setCellFactory(param -> new TableCell<Car, Void>() {
            private final Button deleteButton = new Button("X");
            {
                int value = 30;
                deleteButton.setStyle("-fx-background-radius: 0;" +
                        " -fx-min-width: " + value + "px;" +
                        " -fx-min-height: " + value + "px;" +
                        " -fx-max-width: " + value + "px;" +
                        " -fx-max-height: " + value + "px;");
                deleteButton.setOnAction(event -> {
                    Car car = getTableView().getItems().get(getIndex());
                    cars.deleteCar(car);
                    getTableView().getItems().remove(car);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                    setAlignment(Pos.CENTER);
                }
            }
        });
    }

    public static void openMainPanel(Stage currentStage) {
        try {
            FXMLLoader loader = new FXMLLoader(MainPanelOpenerController.class.getResource("/com/sanetro/app/carStatisticsGUI/views/MainPanelView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Main Panel");
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            stage.setScene(new Scene(root, 1200, 900));
            stage.setX((screenBounds.getWidth() - 1200) / 2);
            stage.setY((screenBounds.getHeight() - 900) / 2);
            stage.setResizable(false);
            stage.show();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleHomeButtonAction(ActionEvent event) {
        changeView(event, "/com/sanetro/app/carStatisticsGUI/views/CarListView.fxml");
    }

    @FXML
    private void handleCarStatisticsButtonAction(ActionEvent event) {
        changeView(event, "/com/sanetro/app/carStatisticsGUI/views/CarStatisticsView.fxml");
    }

    @FXML
    private void handleCarAddButtonAction(ActionEvent event) {
        changeView(event, "/com/sanetro/app/carStatisticsGUI/views/CarAddView.fxml");
    }

    @FXML
    private void handleLogoutButtonAction(ActionEvent event) {
        changeView(event, "/com/sanetro/app/carStatisticsGUI/views/LoginView.fxml");
    }

    @Override
    protected void handleReturnBackButtonAction(ActionEvent event) {
        changeView(event, "/com/sanetro/app/carStatisticsGUI/views/MainPanelView.fxml");
    }
}

