package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExHbox extends Application {
	public void start(Stage primaryStage) throws Exception {
		try {
			
			Button btnNovo = new Button("Novo");
			Button btnAbrir = new Button("Abrir");
			Button btnSalvar = new Button("Salvar");

			HBox hbox = new HBox(20);
			hbox.setAlignment(Pos.CENTER);
			hbox.getChildren().addAll(btnNovo, btnAbrir, btnSalvar);
			
            Scene scene = new Scene(hbox, 300, 150);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Exercicio 3 - BTN");
			primaryStage.show();

		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
