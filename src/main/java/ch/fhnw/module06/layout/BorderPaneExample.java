package ch.fhnw.module06.layout;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

final class BorderPaneExample extends BorderPane {

	BorderPaneExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		setTop(Area.createRegion("2ecc71"));
		setLeft(Area.createRegion("3498db"));
		setRight(Area.createRegion("e74c3c"));
		setCenter(Area.createRegion("bdc3c7"));
		setBottom(Area.createRegion("9b59b6"));
	}
}
