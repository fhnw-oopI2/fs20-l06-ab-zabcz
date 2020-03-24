package ch.fhnw.module06.layout;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

final class TilePaneExample extends TilePane {

	
	TilePaneExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		List<String> colors = Arrays.asList("2ecc71", "3498db", "e74c3c", "bdc3c7", "9b59b6");
		
		setOrientation(Orientation.HORIZONTAL);
		
		setHgap(8);
		setVgap(8);
		setPadding(new Insets(0));
	    
	    Stream.generate(Math::random)
			.map(random -> (int)(random * colors.size()))
			.map(index -> Area.createRegion(colors.get(index)))
			.limit(30)
			.forEach(region -> getChildren().add(region));
	}
}
