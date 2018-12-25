package ui.home;

import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.TileBuilder;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class test extends Application {

    private Scene scene;

    Tile testTile;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        testTile = TileBuilder.create()
                .skinType(Tile.SkinType.HIGH_LOW)
                .prefSize(250,250)
                .title("Patients Since:")
                .unit("\u0025")
                .description("test")
                .text("tetet")
                .referenceValue(6.7)
                .value(8.2)
                .backgroundColor(Tile.DARK_BLUE)
                .descriptionColor(Tile.DARK_BLUE)
                .textSize(Tile.TextSize.BIGGER)
                .build();
        Group root = new Group();
        root.getChildren().add(testTile);
        scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
