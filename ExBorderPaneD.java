package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.control.ProgressBar;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExBorderPaneD extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			// toolbar topo 
			ToolBar tb = new ToolBar(new Text("TOPO TELA"));
			
			// menu
			VBox menu = new VBox(15);
			menu.getChildren().addAll();
	        Button btn1 = new Button("Botão 1");
	        Button btn2 = new Button("Botão 2");
	        Button btn3 = new Button("Botão 3");
	        Button btn4 = new Button("Botão 4");
	        menu.getChildren().addAll(btn1, btn2, btn3, btn4);
	        
			
			// criar border pane e adicionar botoes - esquerda 
			BorderPane borderpane = new BorderPane();
			borderpane.setLeft(menu);
						
			// criardesktop
			Text dsk = new Text("Área de Trabalho");	
			
			btn1.setOnAction(e -> borderpane.setCenter(new Text("conteudo botao 1")));
			btn2.setOnAction(e -> borderpane.setCenter(new Text("conteudo botao 2")));
			btn3.setOnAction(e -> borderpane.setCenter(new Text("conteudo botao 3")));
			btn4.setOnAction(e -> borderpane.setCenter(new Text("conteudo botao 4")));
			
			
			borderpane.setTop(tb);
			borderpane.setCenter(dsk);
			

			


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
