package estudosJavafx.src.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {

    @FXML
    private Button BotaoDeAcao;

    @FXML
    private Label label;

    @FXML
	void BotaoDeAcao(ActionEvent event) {
    	System.out.println("You clicked me!");
    	label.setText("Lanchonete do Gordão");

	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		//TODO
	}
	
}
