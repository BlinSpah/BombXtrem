package at.spengergasse.gui;

import java.util.List;

import javafx.application.Application;
import javafx.application.Application.Parameters;
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
	  
	    
		
		 // print commandline arguments to the terminal window
		 final Parameters params = getParameters();
	     final List<String> parameters = params.getRaw();
	     for (String s:parameters){
	    	 System.out.println(s);
	     }
	     // instanciate frame
		 new Map(parameters);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
