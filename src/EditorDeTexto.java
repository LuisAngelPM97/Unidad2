import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class EditorDeTexto extends Application {

    @FXML
    private TextArea TextArea;

    @FXML
    void MenuAbiri(ActionEvent event) {
        FileChooser fc = new FileChooser();
    }

    @FXML
    void MenuCerrar(ActionEvent event) {

    }

    @FXML
    void MenuGuardar(ActionEvent event) {

    }

    @FXML
    void MenuGuardarComo(ActionEvent event) {

    }

    @FXML
    void MenuNuevo(ActionEvent event) {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
