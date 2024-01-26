package com.sanetro.app.carStatisticsGUI.controller;

import com.sanetro.app.carStatisticsGUI.template.AbstractHandleButtonBackAndChangeView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;

public class CarAddController extends AbstractHandleButtonBackAndChangeView {
    @FXML
    private TextField idField;
    @FXML
    private TextField brandField;
    @FXML
    private TextField modelField;
    @FXML
    private TextField yearField;
    @FXML
    private TextField colorField;
    @FXML
    private TextField engineSizeField;
    @FXML
    private TextField vinField;
    @FXML
    private Label confirmationLabel;

    @FXML
    private void addCar(ActionEvent event) {
        try {
            // Imitate adding car to db
            clearForm();
            showConfirmationMessage();
            clearForm();
        } catch (NumberFormatException e) {
            // an error
        }
    }

    private void showConfirmationMessage() {
        confirmationLabel.setVisible(true);
        confirmationLabel.setTextFill(Color.GREEN);
    }

    private void clearForm() {
        idField.clear();
        brandField.clear();
        modelField.clear();
        yearField.clear();
        colorField.clear();
        engineSizeField.clear();
        vinField.clear();
    }
}

