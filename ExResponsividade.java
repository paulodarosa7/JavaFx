package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExResponsividade extends Application {

    @Override
    public void start(Stage primaryStage) {
    	
    	Label nome = new Label("Informe seu  nome");
    	TextField info = new TextField();
    	Button salvar = new Button("Salvar Nome");

        Pane root = new VBox(); 

        Scene scene = new Scene(root, 800, 400);

        scene.widthProperty().addListener((observable, oldValue, newValue) -> {
            root.getChildren().clear();
            if (newValue.doubleValue() < 600) {
                VBox vbox = new VBox(10, nome, info, salvar);
                root.getChildren().add(vbox);
            } else { //escuta hbox
                HBox hbox = new HBox(10, nome, info, salvar);
                root.getChildren().add(hbox);
            }
        });
        
        root.getChildren().add(new VBox(10, nome, info, salvar));


        primaryStage.setScene(scene);
        primaryStage.setTitle("Responsivo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
