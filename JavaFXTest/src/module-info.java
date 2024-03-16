<<<<<<< HEAD
module JavaFX_Test {
	requires javafx.controls;
	requires javafx.fxml;			// 추가
	
	opens application to javafx.graphics, javafx.fxml;
=======
// module-info.java
module JavaFXTest {
	requires javafx.controls;
	requires javafx.fxml;			// 추가
	
	opens application to javafx.graphics, javafx.fxml;
>>>>>>> branch 'main' of https://github.com/wogml909/sample.git
}