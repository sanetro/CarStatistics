package com.sanetro.app.tutorlanguage.core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public abstract  class AbstractHandleButtonBackAndChangeView {

    @FXML
    protected abstract void handleReturnBackButtonAction(ActionEvent event);

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
