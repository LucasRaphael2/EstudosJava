module a {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires java.desktop;
	
	opens estudosJavafx.src.application to javafx.graphics, javafx.fxml;
}
