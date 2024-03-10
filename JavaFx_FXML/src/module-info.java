module JavaFx_FXML {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;  //FXML 설정
	
	opens application to javafx.graphics, javafx.fxml;
}
