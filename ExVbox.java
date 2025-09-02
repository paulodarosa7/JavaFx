package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExVbox extends Application {
	public void start(Stage primaryStage) throws Exception {
		try {
			Label loginUser = new Label("username");
			TextField textoUser = new TextField();
			
			Label loginPasswd = new Label("password");
			PasswordField textoPasswd = new PasswordField();
			
			Button login = new Button("Logar");
			
			VBox vbox = new VBox();
			vbox.setAlignment(Pos.CENTER);
			vbox.getChildren().addAll(loginUser, textoUser, loginPasswd, textoPasswd, login);
			
            Scene scene = new Scene(vbox, 400, 400);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Login com Vbox");
			primaryStage.show();

		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
