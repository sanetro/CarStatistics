package com.sanetro.app.tutorlanguage.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPanelOpener {

    public static void openMainPanel(Stage currentStage) {
        try {
            FXMLLoader loader = new FXMLLoader(MainPanelOpener.class.getResource("/com/sanetro/app/tutorlanguage/MainPanel.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Główny Panel");
            stage.show();

            // Opcjonalnie: zamknij obecne okno logowania
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
            // Obsługa błędów
        }
    }
}

