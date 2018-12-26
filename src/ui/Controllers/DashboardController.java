package ui.Controllers;

import Services.DashboardCountService;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

public class DashboardController {



    Random random = new Random();

    private long lastTimerCall;

    @FXML
    private Label patientCountLbl, nurseCountLbl, docCountLbl;

    @FXML
    private LineChart<String, Number> admissionChart;

    private DashboardCountService dbCS;


    @FXML
    public void initialize() throws Exception{
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data<String, Number>("Mon",12));
        series.getData().add(new XYChart.Data<String, Number>("Tue",29));
        series.getData().add(new XYChart.Data<String, Number>("Wed",37));
        series.getData().add(new XYChart.Data<String, Number>("Thur",56));
        series.getData().add(new XYChart.Data<String, Number>("Fri",14));
        series.getData().add(new XYChart.Data<String, Number>("Sat",26));
        series.getData().add(new XYChart.Data<String, Number>("Sun",8));
        admissionChart.setLegendVisible(false);
        admissionChart.setVerticalGridLinesVisible(false);
        admissionChart.setStyle("-fx-font-weight:Bold;");
        admissionChart.getData().add(series);
        updateCounts();
    }

    private void updateCounts() throws Exception{
        dbCS = new DashboardCountService();
        patientCountLbl.setText(Integer.toString(dbCS.getPersonCounts()));
        nurseCountLbl.setText(Integer.toString(dbCS.getNurseCounts()));
        docCountLbl.setText(Integer.toString(dbCS.getDoctorCounts()));

        Timeline countUpdater = new Timeline(new KeyFrame(Duration.seconds(15), e-> {
                try {
                    patientCountLbl.setText(Integer.toString(dbCS.getPersonCounts()));
                    nurseCountLbl.setText(Integer.toString(dbCS.getNurseCounts()));
                    docCountLbl.setText(Integer.toString(dbCS.getDoctorCounts()));
                    System.out.println("Update");
                } catch (Exception E) {
                    System.out.println(E);
                }
        }));
        countUpdater.setCycleCount(Timeline.INDEFINITE);
        countUpdater.play();
    }

    private void update() {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(now > lastTimerCall + 2_000_000_000) {
//                    testTile.setValue(random.nextDouble() * 120);
                    lastTimerCall = now;
                }

            }
        };
        timer.start();
    }
}


