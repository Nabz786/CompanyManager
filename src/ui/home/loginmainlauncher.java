package ui.home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * This class houses the main launcher for the UI, starting with the login page.
 * @author Nabeel V
 * @version 0.1 SEPT 2018
 */
public class loginmainlauncher extends Application {

    /** Current Active Stage **/
    private Stage currentStage;

    /** Current Active Scene**/
    private Scene currentScene;

    /** Application window width**/
    private final int WINDOW_WIDTH = 1000;

    /** Application window height**/
    private final int WINDOW_HEIGHT = 600;

    /**
     * JavaFX version of Main, launches the program
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method initializes all necessary members for the app,
     * when launched user will start at the login screen.
     * @param primaryStage - the current stage
     * @throws IOException - If the FXML file to the login page is not found or unreadable
     */
    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        currentStage = primaryStage;
        currentStage.initStyle(StageStyle.UNDECORATED);
        currentScene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        currentStage.setScene(currentScene);
        currentStage.setResizable(false);
        currentStage.setTitle("Hospital Manager");
        currentStage.show();
    }
}
