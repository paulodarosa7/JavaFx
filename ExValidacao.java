package application;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExValidacao extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
            GridPane gridPane = new GridPane();
            gridPane.setHgap(10);
            gridPane.setVgap(10);

            Label obs = new Label("Digite números: ");
            TextField campo = new TextField();
            campo.setPromptText("Entre no sistema digitando APENAS números");
            Label texto = new Label();

            campo.textProperty().addListener((observable, oldValue, newValue) -> {
                if (!newValue.matches("\\d*")) {
                    campo.setText(newValue.replaceAll("[^\\d]", ""));
                    texto.setText("Apenas números!");
                } else {
                    texto.setText("");
                }
            });

            gridPane.add(obs, 0, 0);
            gridPane.add(campo, 1, 0);
            gridPane.add(texto, 1, 1);

            Scene scene = new Scene(gridPane, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Validador");
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
