package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

// set basic layout to stackpane
public class ApplicationUI extends VBox {
    private Button button;
    private Label label;
    private TextField txtField;
    private TextArea textArea;
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
        label = new Label("ein Label");
        txtField = new TextField();
        txtField.setText("text field");
        textArea = new TextArea();
        textArea.setText("text area");
        button = new Button("ein Button");
    }

    /*
     * layouting of controls
     * */
    private void layoutControls() {

        // add controls to layout
        getChildren().add(label);
        getChildren().add(txtField);
        getChildren().add(textArea);
        getChildren().add(button);

        setPadding(new Insets(10,10,10,10));

    }

}
