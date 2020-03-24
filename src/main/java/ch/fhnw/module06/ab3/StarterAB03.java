package ch.fhnw.module06.ab3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StarterAB03 extends Application {

    public static final double width = 400;
    public static final double height = 300;


    @Override public void init() {}


    @Override public void start(Stage primaryStage) {
        Parent rootPanel = new ApplicationUI(primaryStage);

        Scene scene = new Scene(rootPanel);
        primaryStage.setScene(scene);
        primaryStage.setTitle("OOP2: AB 02");
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    @Override public void stop() {}

    public static void main(String[] args) {
        Application.launch(args);
    }

}
