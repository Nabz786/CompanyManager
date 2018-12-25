package ui.home;

import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.TileBuilder;
import eu.hansolo.tilesfx.colors.Medium;
import eu.hansolo.tilesfx.skins.BarChartItem;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.Random;

public class dashboard {




    private Tile testTile;

    @FXML
    private AnchorPane countPane;

    Random random = new Random();

    private long lastTimerCall;

    @FXML
    public void initialize() {
        Color color = new Color(0,0,0,0);
 //       Color color2 = new Color(0.615,0.713,1,1);
        Color color2 = new Color(0, 0.121, 0.121,1);

//        testTile = TileBuilder.create()
//                    .skinType(Tile.SkinType.CIRCULAR_PROGRESS)
//                    .prefSize(150,150)
//                    .title("Test")
//                    .text("Circ")
//                    .unit("\u0025")
//                    .animated(true)
//                    .barColor(Tile.RED)
//                    .backgroundColor(color)
//                    .foregroundBaseColor(color)
//                    .borderColor(color)
//                    .barBackgroundColor(Tile.DARK_BLUE)
//                    .build();
//            testTile.setValue(50);
       BarChartItem b1 = new BarChartItem("Gerrit", 47, Tile.BLUE);
       BarChartItem b2 = new BarChartItem("Sandra", 43, Tile.RED);
       BarChartItem b3 = new BarChartItem("Lilli", 12, Tile.GREEN);

        testTile = TileBuilder.create()
                .skinType(Tile.SkinType.BAR_CHART)
                .prefSize(210,250)

                .barChartItems(b1,b2,b3)
                .decimals(0)
                .backgroundColor(color2)
//                .foregroundBaseColor(color2)
//                .valueColor(color2)
                .textSize(Tile.TextSize.BIGGER)
                .build();

            countPane.getChildren().add(testTile);

            //update();
    }

    private void update() {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(now > lastTimerCall + 2_000_000_000) {
                    testTile.setValue(random.nextDouble() * 120);
                    lastTimerCall = now;
                }

            }
        };
        timer.start();
    }
}


