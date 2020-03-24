package ch.fhnw.module06.layout;

import javafx.geometry.Insets;
import javafx.scene.layout.Region;

/**
 * Diese Klasse erzeugt eine Fläche in Form einer Region für 
 * alle Beispiel Layouts.
 */
public final class Area {

	public static Region createRegion(String color) {
		final Region region = new Region();
		region.setPadding(new Insets(30));
		region.setStyle("-fx-background-color: #" +color + ";");
		return region;
	}
}
