package ch.fhnw.module06.layout;

import java.util.stream.Stream;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

final class HBoxExample extends HBox {

	HBoxExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		setSpacing(35);
		setPadding(new Insets(20));
		
		Stream.of("2ecc71", "3498db", "e74c3c", "bdc3c7", "9b59b6")
			.map(color -> Area.createRegion(color))
			.forEach(region -> getChildren().add(region));
	}
}
