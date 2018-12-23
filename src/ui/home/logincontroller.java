package ui.login;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

import java.awt.*;

public class logincontroller {

    @FXML
    private JFXButton loginButton;

    @FXML
    private void initialize() {
        loginButton.setOnAction(e -> {
            System.out.println("Logging In!");
        });
    }

    @FXML
    private void printHello() {

    }
}
