package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExBorderPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			// toolbar topo 
			ToolBar tb = new ToolBar(new Text("TOPO TELA"));
			
			// menu
			VBox menu = new VBox(15);
			menu.getChildren().addAll(
			new Button("Botão 1"),
			new Button("Botão 2"),
			new Button("Botão 3"),
			new Button("Botão 4") 
            );
			
			// criar border pane e adicionar botoes - esquerda 
			BorderPane borderpane = new BorderPane();
			borderpane.setLeft(menu);
						
			// criardesktop
			Text dsk = new Text("Área de Trabalho");	
			
			//barra status
			ProgressBar barra = new ProgressBar(0.5); 
			
			borderpane.setTop(tb);
			borderpane.setCenter(dsk);
			borderpane.setBottom(barra);

			


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
