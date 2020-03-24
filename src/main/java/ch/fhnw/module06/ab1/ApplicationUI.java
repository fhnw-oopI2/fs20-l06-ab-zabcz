package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


// set basic layout to stackpane
public class ApplicationUI extends StackPane {
    private Button button;
    private Stage stage;

    // bring in stage
    public ApplicationUI(Stage stage) {
        this.stage = stage;
        initializeControls();
        layoutControls();
    }

    /*
    * init all control elements
    * */
    private void initializeControls() {
        button = new Button("Hello World");
    }

    /*
     * layouting of controls
     * */
    private void layoutControls() {

    }

}
