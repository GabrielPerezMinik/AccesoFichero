package dataAcces.accesofichero.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class AccesoFicheroController implements Initializable{
	
	SubCaryFirController ficheroControl=new SubCaryFirController();
	
	
	@FXML
    private SplitPane splitpaneMain;
	
	@FXML
    private Button crearButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private ListView<File> listadoIzquierdaFicheroListView;

    @FXML
    private Button moverButton;

    @FXML
    private TextField ubicacionFicheroText;

    @FXML
    private Button verFicheroCarpetasButton;
	
	public AccesoFicheroController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/AccesoFichero.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		splitpaneMain.getItems().add(ficheroControl.getView());
		
	}

	
	public SplitPane getView() {
		return splitpaneMain;
	}
	
}
