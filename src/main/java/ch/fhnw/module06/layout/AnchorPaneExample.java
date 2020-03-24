package ch.fhnw.module06.layout;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

final class AnchorPaneExample extends AnchorPane {

	AnchorPaneExample(Stage stage) {
		stage.setTitle(this.getClass().getSimpleName());
		
		Region region = Area.createRegion("2ecc71");
		setTopAnchor(region, 20.0);
		setLeftAnchor(region, 60.0);
		setRightAnchor(region, 10.0);
		setBottomAnchor(region, 100.0);
		
		getChildren().add(region);
	}
}
