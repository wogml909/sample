module JavaFx_SwitchScene {
	requires javafx.controls;
	requires javafx.fxml; //fxml모듈추가
	
	opens application to javafx.graphics, javafx.fxml;
}
