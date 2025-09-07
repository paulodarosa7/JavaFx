package application;



import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExStackPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			StackPane stack = new StackPane();
						
			Image img = new Image(ExStackPane.class.getResource("backgruoud.jpg").toExternalForm());
      //Configurações de plano de fundo a partir da imagem chamada. img
			BackgroundImage bgImg = new BackgroundImage(
			        img,
			        BackgroundRepeat.NO_REPEAT, 
			        BackgroundRepeat.NO_REPEAT, 
			        BackgroundPosition.CENTER,
			        new BackgroundSize(
			            100, 100,   
			            true, true,
			            false, true 
			        ));
			
			Label titulo = new Label("Vai Corinthians");
			titulo.setTextFill(Color.WHITE);
			
			Rectangle retangulo = new Rectangle();
			retangulo.setFill(Color.color(0, 0, 0, 0.50)); //determina a opacidade 
			retangulo.widthProperty().bind(stack.widthProperty()); //determina o tamanho do retangulo, no caso terá o mesmo tamanho que o StackPane
			retangulo.heightProperty().bind(stack.heightProperty());

			stack.getChildren().addAll(retangulo, titulo);	
			stack.setBackground(new Background(bgImg));			
			
			
			Scene scene = new Scene(stack,600,600);
			
			//criar stage
			primaryStage.setScene(scene);
			primaryStage.setTitle("Exercicio 9");
			primaryStage.show();



		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
