package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExGridPane extends Application {

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
            GridPane gridPane = new GridPane();
			
			gridPane.add(btn1, 2,3);
			gridPane.add(btn2,0,0);
			gridPane.add(btn3,1,1);
			gridPane.add(btn4,2,1);
			gridPane.add(btn5,2,2);
			gridPane.add(btn6,2,2);



			// criar scene
			Scene scene = new Scene(gridPane,400,400 );
			
			// criar espaçamento entre linhas e colunas
			gridPane.setHgap(10);
			gridPane.setVgap(10);
			
			//criar stage
			primaryStage.setScene(scene);
			primaryStage.setTitle("Exemplo GridPane");
			primaryStage.show();



		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
