package ui.Controllers;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.util.Random;

public class dashboard {



    Random random = new Random();

    private long lastTimerCall;

    @FXML
    private LineChart<String, Number> admissionChart;


    @FXML
    public void initialize() {
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


