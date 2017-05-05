package at.spengergasse.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainGame extends Application
{
	public void start(Stage primaryStage) throws Exception{
		 
	    primaryStage.setTitle("BombXtrem");
	  
	    
	    GridPane grid = new GridPane();
	    grid.setHgap(10);
	    grid.setVgap(10);
	    grid.setPadding(new Insets(10,10,10,10));
	    
	    Button startButton = new Button(" Start");
	    startButton.setPrefSize(90, 35);
	    Button optionsButton = new Button("options");
	    optionsButton.setPrefSize(90, 35);
	    Button endButton = new Button("End");
	    endButton.setPrefSize(90, 35);
	    
	    grid.add(startButton, 0, 0);
	    grid.add(optionsButton,0, 1);
	    grid.add(endButton, 0, 2);

	   
	    BorderPane borderPane = new BorderPane();
	    borderPane.setCenter(grid);//center
	  

	    //BorderPaneSize(600/600)
	    Scene scene = new Scene(borderPane , 600,600);

	    primaryStage.setScene(scene);
	    primaryStage.setResizable(false);
	    primaryStage.centerOnScreen();
	}
}
