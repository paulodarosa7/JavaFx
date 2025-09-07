package application;



import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExAnchorPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			TextArea area = new TextArea();
			AnchorPane anchor = new AnchorPane();
			
			AnchorPane.setBottomAnchor(area, 10.0);
			AnchorPane.setTopAnchor(area, 10.0);
			AnchorPane.setRightAnchor(area, 10.0);
			AnchorPane.setLeftAnchor(area, 10.0);

			anchor.getChildren().add(area);

			
			Scene scene = new Scene(anchor,400,400 );
			//criar stage
			primaryStage.setScene(scene);
			primaryStage.setTitle("Anchorpane");
			primaryStage.show();



		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
