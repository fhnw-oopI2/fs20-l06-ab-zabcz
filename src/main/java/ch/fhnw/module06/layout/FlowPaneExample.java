package ch.fhnw.module06.layout;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javafx.geometry.Insets;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

final class FlowPaneExample extends FlowPane {
	
	FlowPaneExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		// Abstand zwischen den Elementen.
		setVgap(20);
		setHgap(60);
		
		// Inset ist die Margin der FlowPane zum Rand.
		setPadding(new Insets(10));
		
		List<String> colors = Arrays.asList("2ecc71", "3498db", "e74c3c", "bdc3c7", "9b59b6");
		
		Stream.generate(Math::random)
			.map(random -> (int)(random * colors.size()))
			.map(index -> Area.createRegion(colors.get(index)))
			.limit(30)
			.forEach(region -> getChildren().add(region));
	}

}
