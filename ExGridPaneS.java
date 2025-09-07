package application;



import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExGridPaneS extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Label obsL = new Label("Observações: ");
			TextArea obs = new TextArea();
			
			Button salvar = new Button("Salvar");
			
			// criar border pane e adicionar botoes
            GridPane gridPane = new GridPane();
			
            gridPane.add(obsL, 0, 0);
            gridPane.add(obs, 1, 0);
            gridPane.setColumnSpan(obs, 2);


            HBox hbox = new HBox(salvar);
            hbox.setAlignment(Pos.CENTER_RIGHT);
            
            gridPane.add(hbox, 2, 1);

			Scene scene = new Scene(gridPane,400,400 );
			
			// criar espaçamento entre linhas e colunas
			gridPane.setHgap(10);
			gridPane.setVgap(10);
			gridPane.setPadding(new Insets(10, 20, 10, 20)); 

			//criar stage
			primaryStage.setScene(scene);
			primaryStage.setTitle("GridPane Spam");
			primaryStage.show();



		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
