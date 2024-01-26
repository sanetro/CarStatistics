package com.sanetro.app.carStatisticsGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/sanetro/app/carStatisticsGUI/views/LoginView.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setResizable(false);
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((screenBounds.getWidth() - 1200) / 2);
        primaryStage.setY((screenBounds.getHeight() - 900) / 2);
        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

