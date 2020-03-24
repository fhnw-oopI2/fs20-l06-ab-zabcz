package ch.fhnw.module06.ab3;

import ch.fhnw.module06.layout.Area;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.stream.Stream;

// set basic layout to stackpane
public class ApplicationUI extends BorderPane {
    private Button buttonTop;
    private Button buttonLeft;
    private Button buttonRight;
    private Button buttonBottom;
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

        // init all controls
        buttonTop = new Button("top");
        buttonLeft = new Button("left");
        buttonRight = new Button("right");
        buttonBottom = new Button("bottom");
        textArea = new TextArea();
        textArea.setText("text area");

        // init regions
        setTop(Area.createRegion("2B3743"));
        setLeft(Area.createRegion("446A7F"));
        setRight(Area.createRegion("6599BC"));
        setCenter(Area.createRegion("99C4DF"));
        setBottom(Area.createRegion("849BA0"));

    }

    /*
     * layouting of controls
     * */
    private void layoutControls() {

        // add controls to layout areas
        this.setTop(buttonTop);
        this.setRight(buttonRight);
        this.setLeft(buttonLeft);
        this.setBottom(buttonBottom);
        this.setCenter(textArea);

        // übersteurn des layouts durch controls
        Stream.of(buttonTop, buttonBottom)
                .forEach(button -> button.setMaxWidth(StarterAB03.width))
        ;

        // set margin
        Stream.of(buttonTop, buttonLeft, buttonRight, buttonBottom, textArea)
                .forEach(button -> setMargin(button, new Insets(5)))
        ;


    }

}
