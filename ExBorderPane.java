package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ExBorderPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			// criar botoes
			Button btn1 = new Button("Botão 1");
			Button btn2 = new Button("Botão 2"); // button
			Button btn3 = new Button("Botão 3"); // left
			Button btn4 = new Button("Botão 4"); //right
			Button btn5 = new Button("Botão 5"); //center
			Button btn6 = new Button("Botão 6");
			
			// criar border pane e adicionar botoes
			BorderPane borderpane = new BorderPane();
			
			borderpane.setTop(btn1);
			borderpane.setBottom(btn2);
			borderpane.setLeft(btn3);
			borderpane.setRight(btn4);
			borderpane.setCenter(btn5);



			// criar scene
			Scene scene = new Scene(borderpane,400,400 );
			
			//criar stage
			primaryStage.setScene(scene);
			primaryStage.show();



		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
