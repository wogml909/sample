package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class bController {
	
	@FXML
	TextField tOutInput;
   
	//A로 이동하기
	public void toA(ActionEvent event) throws IOException {
		Main.setRoot("A");            //A로 이동
	}
	
	
	//전달받은 데이터 텍스트 필드 출력하기
	public void showData(String data) {
		tOutInput.setText(data);
	}
}



































