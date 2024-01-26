package com.sanetro.app.carStatisticsGUI.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public abstract  class AbstractHandleButtonBackAndChangeView {
    @FXML
    protected void handleReturnBackButtonAction(ActionEvent event) {
        changeView(event, "/com/sanetro/app/carStatisticsGUI/views/MainPanelView.fxml");
    }

    @FXML
    protected void changeView(ActionEvent event, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent newView = loader.load();
            Scene scene = ((Node) event.getSource()).getScene();
            scene.setRoot(newView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
