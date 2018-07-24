import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class InicioSesion extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent layout = FXMLLoader.load(getClass().getResource("InicioSesion.fxml"));
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Genius Coder: Inicio de Sesion");
        primaryStage.show();


    }

    @FXML
    private JFXTextField usuario;

    @FXML
    private JFXPasswordField clave;

    @FXML
    void iniciaSesion(ActionEvent event){

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:basededatos1.db");

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); // set timeout to 30 sec.

            String correo = usuario.getText();
            String clv = clave.getText();

            String consulta = "SELECT * FROM usuarios" + "WHERE correo='"+correo+"' AND clave='"+clv+"'";

            ResultSet rs = statement.executeQuery(consulta);

            if (rs.next()) {
                System.out.println("Usuario vàlido");
                System.out.println(rs.getString("nombre"));
            }
            else {
                System.out.println("Usuario no vàlido");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("usuario:"+usuario.getText());
        System.out.println("clave:"+clave.getText());
}

}
