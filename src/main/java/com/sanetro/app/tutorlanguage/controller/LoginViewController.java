package com.sanetro.app.tutorlanguage.controller;

import com.sanetro.app.tutorlanguage.db.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {
    private Users databaseUsers = new Users();
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (databaseUsers.authenticate(username, password)) {
            System.out.println("Log in successfully");
            MainPanelOpenerController.openMainPanel((Stage) usernameField.getScene().getWindow());
        } else {
            System.out.println("Authentication fail");
        }
    }
}
