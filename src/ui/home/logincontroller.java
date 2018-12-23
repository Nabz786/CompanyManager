package ui.home;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class logincontroller {

    @FXML
    private JFXButton loginButton;

    @FXML
    private void initialize() {
        loginButton.setOnAction(e -> {
            try {
                loginmainlauncher.switchScene("test.fxml");
                System.out.println("here");
            } catch (Exception exp) {
                System.out.println(exp);
            }
        });
    }
}
