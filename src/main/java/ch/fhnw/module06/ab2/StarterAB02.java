package ch.fhnw.module06.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StarterAB02 extends Application {

    @Override public void init() {}


    @Override public void start(Stage primaryStage) {
        Parent rootPanel = new ApplicationUI(primaryStage);

        Scene scene = new Scene(rootPanel);
        primaryStage.setScene(scene);
        primaryStage.setTitle("OOP2: AB 02");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    @Override public void stop() {}

    public static void main(String[] args) {
        Application.launch(args);
    }

}
