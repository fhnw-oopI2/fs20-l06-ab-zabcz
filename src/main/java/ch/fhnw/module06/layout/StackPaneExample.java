package ch.fhnw.module06.layout;

import java.util.stream.Stream;

import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

final class StackPaneExample extends StackPane {

	
	StackPaneExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		Stream.of("2ecc71", "3498db", "e74c3c", "ff1493", "bdc3c7", "9b59b6")
			.map(color -> Area.createRegion(color))
			.forEach(region -> {
				setMargin(region, new Insets(Math.random() * 100));
				getChildren().add(region);
			});
	}
}
