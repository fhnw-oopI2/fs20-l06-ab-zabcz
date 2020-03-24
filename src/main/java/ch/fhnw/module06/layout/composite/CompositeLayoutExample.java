package ch.fhnw.module06.layout.composite;

import java.util.stream.Stream;

import ch.fhnw.module06.layout.Area;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

final class CompositeLayoutExample extends HBox {
	
	CompositeLayoutExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		getChildren().addAll(createVBox(), createVBox(), createVBox());
	}
	
	private VBox createVBox() {
		
		VBox box = new VBox();
		
		box.setSpacing(10);
		box.setPadding(new Insets(20));
		
		Stream.of("2ecc71", "3498db", "e74c3c", "bdc3c7", "9b59b6")
			.map(color -> Area.createRegion(color))
			.forEach(region -> box.getChildren().add(region));
		
		return box;
	}

}

