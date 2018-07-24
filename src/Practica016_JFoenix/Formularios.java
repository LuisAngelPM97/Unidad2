package Practica016_JFoenix;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;


public class Formularios extends Application {

    @FXML
    private AnchorPane paneUsuario;

    @FXML
    private AnchorPane paneUbicacion;

    @FXML
    private AnchorPane paneEscuela;

    @FXML
    private AnchorPane paneSalir;

    @FXML
    void mostrarEscuela(MouseEvent event) {
        mostrarPane("Escuela");
    }

    @FXML
    void mostrarUbicacion(MouseEvent event) {
        mostrarPane("Ubicacion");
    }

    @FXML
    void mostrarUsuario(MouseEvent event) {
        mostrarPane("Usuario");

    }

    @FXML
    void salir(MouseEvent event){
        Platform.exit();
    }

    private void mostrarPane(String op) {

        switch (pane){
            case "Usuario":
                if (paneUsuario.isVisible()){
                    paneUsuario.setVisible(false);
                    upUsuario.setVisible(false);
                    return;
                }
                break;
            case "Escuela":
                if (paneEscuela.isVisible()) {
                    paneEscuela.setVisible(false);
                    upEscuela.setVisible(false);
                    return;
                }
                break;
            case "Ubicacion":
                if (paneUbicacion.isVisible()) {
                    paneUbicacion.setVisible(false);
                    upUbicacion.setVisible(false);
                    return;
                }
        }

        paneUsuario.setVisible(false);
        paneUbicacion.setVisible(false);
        paneEscuela.setVisible(false);
        paneSalir.setVisible(false);
        switch (op){
            case "Usuario":
            paneUsuario.setVisible(true);
            break;
            case "Mapa":
            paneUbicacion.setVisible(true);
            break;
            case "Escuela":
            paneEscuela.setVisible(true);
            break;
        }
    }




    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent layout = FXMLLoader.load(getClass().getResource("Formulario.fxml"));
        layout.setOnMousePressed(event -> {
            posX = primaryStage.getX() -event.getX();
            posY = primaryStage.getY() -event.getY();
            //System.out.printnl("0: "+posX+", "+posY);
            //System.out.primtnl("1: "+primaryStage.getX()+", "+primaryStage.getY());
        });

        Scene escena = new Scene(layout);
        primaryStage.setScene(escena);
        primaryStage.show();
    }
}

