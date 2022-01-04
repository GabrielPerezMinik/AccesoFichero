package dataAcces.accesofichero.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.fxml.Initializable;

public class SubCaryFirController implements Initializable {
	
	
	@FXML
    private Button cancelarButton;

    @FXML
    private Button confirmarButton;

    @FXML
    private ListView<File> ficherosList;

    @FXML
    private TextField modificarText;

    @FXML
    private BorderPane modificarView;
    
    
    public SubCaryFirController() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/VistaSubCaryfir.fxml"));
		loader.setController(this);
		loader.load();
    	
    }

	public void initialize(URL location, ResourceBundle resources) {
		

		
	}

	public BorderPane getView() {
		return modificarView;
	}
	
}
