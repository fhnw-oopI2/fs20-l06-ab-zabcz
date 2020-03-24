package ch.fhnw.module06.layout;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

final class GridPaneExample extends GridPane {
	
	GridPaneExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		List<String> colors = Arrays.asList("2ecc71", "3498db", "e74c3c", "bdc3c7", "9b59b6");
		
		this.setGridLinesVisible(true);
		
		final int numberOfItems = 6;
		
		Stream.iterate(0, n -> n + 1)
			.limit(numberOfItems)
			.forEach(n -> {
				add(Area.createRegion(colors.get(n % colors.size())), n, n);
				
				final double percent = 100.0 / numberOfItems;
				
				ColumnConstraints column = new ColumnConstraints();
			    column.setPercentWidth(percent);
			    getColumnConstraints().add(column);
			    
			    RowConstraints row = new RowConstraints();
			    row.setPercentHeight(percent);
			    getRowConstraints().add(row);
			});
		
		// Rowspan, Colspan.
		add(Area.createRegion(colors.get(4)), 4, 1, 2, 2);
	}
}
