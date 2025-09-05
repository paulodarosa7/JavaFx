package application;



import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExGridPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			TextField nome = new TextField();
			TextField tel = new TextField();
			TextField email = new TextField();
			TextField cdd = new TextField();
			
			Label nomeL = new Label("Nome:");
			Label telL = new Label("Telefone:");
			Label emailL = new Label("Email:");
			Label cddL = new Label("cidade:");


			
			// criar border pane e adicionar botoes
            GridPane gridPane = new GridPane();
			
            gridPane.add(nomeL, 0, 0);
            gridPane.add(nome, 1, 0);

            gridPane.add(emailL, 0, 1);
            gridPane.add(email, 1, 1);
            
            gridPane.add(telL, 0, 2);
            gridPane.add(tel, 1, 2);

            gridPane.add(cddL, 0, 3);
            gridPane.add(cdd, 1, 3);



			// criar scene
			Scene scene = new Scene(gridPane,400,400 );
			
			// criar espaçamento entre linhas e colunas
			gridPane.setHgap(10);
			gridPane.setVgap(10);
			gridPane.setPadding(new Insets(10, 20, 10, 20)); 

			//criar stage
			primaryStage.setScene(scene);
			primaryStage.setTitle("GridPane");
			primaryStage.show();



		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
