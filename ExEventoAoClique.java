package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExEventoAoClique extends Application {
	int count = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			
			Button botao = new Button("Clique aqui!");
			
			Label mostrador = new Label("Quantidade de cliques: " + count);
			
			botao.setOnAction(e -> {
						count++;
						mostrador.setText("Quantidade de cliques: " + count);
			});
			
			VBox vbox = new VBox(10);
            vbox.getChildren().addAll(botao, mostrador);
			
			Scene scene = new Scene(vbox, 400, 400 );
			//criar stage
			primaryStage.setScene(scene);
			primaryStage.setTitle("Contador");
			primaryStage.show();



		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
