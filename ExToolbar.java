package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExToolbar extends Application {
	public void start(Stage primaryStage) throws Exception {
		try {
			
			Button btnHbox = new Button("Botão Hbox");
			HBox hbox = new HBox(20);
			hbox.setAlignment(Pos.CENTER);
			hbox.getChildren().addAll(btnHbox);

			Label texto = new Label("Texto com Label");
			
			VBox vbox = new VBox(20);
			vbox.setPadding(new Insets(10));
			vbox.getChildren().addAll(hbox, texto);
			
			
			
            Scene scene = new Scene(vbox, 300, 150);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Layouts");
			primaryStage.show();

		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
