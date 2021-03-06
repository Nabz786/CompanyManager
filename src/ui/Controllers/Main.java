package ui.Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import javafx.scene.control.TableView;

import java.io.IOException;

/**
 * This class houses the main launcher for the UI, starting with the login page.
 * @author Nabeel V
 * @version 0.1 SEPT 2018
 */
public class loginmainlauncher extends Application {

    /** Current Active Stage **/
    private static Stage currentStage;

    /** Current Active Scene**/
    private static Scene currentScene;

    /** Application window width**/
    private final int WINDOW_WIDTH = 1000;

    /** Application window height**/
    private final int WINDOW_HEIGHT = 600;

    private TableView table = new TableView();

    /**
     * JavaFX version of Main, launches the program
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static void switchScene(final String nextScene) throws IOException, InterruptedException {
        Parent nextView = FXMLLoader.load(logincontroller.class.getResource("../Views/UInav.fxml"));
        loginmainlauncher.currentScene = new Scene(nextView);
        currentStage.setScene(currentScene);
    }

    /**
     * This method initializes all necessary members for the app,
     * when launched user will start at the login screen.
     * @param primaryStage - the current stage
     * @throws IOException - If the FXML file to the login page is not found or unreadable
     */
    @Override
    public void start(Stage primaryStage) throws IOException {

        currentStage = primaryStage;

//        final ObservableList<Patient> data =  FXCollections.observableArrayList();
//
//        Scene scene = new Scene(new Group(), 925, WINDOW_HEIGHT);
//
//        final Button btn = new Button("Update");
//
//        table.setEditable(true);
//
//        TableColumn pIdCol = new TableColumn("PatientID");
//        pIdCol.setMinWidth(100);
//        pIdCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("patientId"));
//
//        TableColumn fNameCol = new TableColumn("First Name");
//        fNameCol.setMinWidth(100);
//        fNameCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("fName"));
//
//        TableColumn lNameCol = new TableColumn("Last Name");
//        lNameCol.setMinWidth(100);
//        lNameCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("lName"));
//
//        TableColumn addressCol = new TableColumn("Address");
//        addressCol.setMinWidth(100);
//        addressCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("pAddress"));
//
//        TableColumn sympCol = new TableColumn("Symptoms");
//        sympCol.setMinWidth(100);
//        sympCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("pSymptoms"));
//
//        TableColumn dobCol = new TableColumn("Date of Birth");
//        dobCol.setMinWidth(100);
//        dobCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("dateOfBirth"));
//
//        TableColumn currLocCol = new TableColumn("Current Location");
//        currLocCol.setMinWidth(100);
//        currLocCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("hospitalDep"));
//
//        TableColumn nIdCol = new TableColumn("Nurse_ID");
//        nIdCol.setMinWidth(100);
//        nIdCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("nurseId"));
//
//        TableColumn dIdCol = new TableColumn("Doctor_ID");
//        dIdCol.setMinWidth(100);
//        dIdCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("doctorId"));
//
//
//        table.getColumns().addAll(pIdCol, fNameCol, lNameCol, addressCol,
//                sympCol, dobCol, currLocCol, nIdCol, dIdCol);
//
//        final VBox vbox = new VBox();
//        vbox.setSpacing(5);
//        vbox.setPadding(new Insets(10, 0, 0, 10));
//        vbox.getChildren().addAll(table, btn);
//
//
//        ((Group) scene.getRoot()).getChildren().addAll(vbox);
//
//        btn.setOnAction(event ->{
//            try{
//                data.removeAll();
//                table.getItems().clear();
//                String sqlStatement = "SELECT * FROM Patient";
//                Connection con = getConnection();
//                ResultSet ste = con.createStatement().executeQuery(sqlStatement);
//                while(ste.next()) {
//                    data.add(new Patient(ste.getInt(1),
//                            ste.getString(2),
//                            ste.getString(3),
//                            ste.getString(4),
//                            ste.getString(5),
//                            ste.getString(6),
//                            ste.getString(7),
//                            ste.getInt(8),
//                            ste.getInt(9)
//                    ));
//                    table.setItems(data);
//               //     table.refresh();
//                }
//                ste.close();
//            } catch (Exception e) {
//                System.err.println(e);
//            }
//        });
//
//
//
//
//        currentStage.setScene(scene);
//        currentStage.show();

        Parent root = FXMLLoader.load(getClass().getResource("../Views/Login.fxml"));
        currentStage = primaryStage;
        currentStage.initStyle(StageStyle.UNDECORATED);
        currentScene = new Scene(root);
        currentStage.setScene(currentScene);
        currentStage.setResizable(false);
        currentStage.setTitle("Hospital Manager");
        currentStage.show();
    }
}
