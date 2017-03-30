package at.spengergasse.model;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Laucher extends Application 
{
    Button startButton;
    Button optionsButton;
    Button endButton;
    @Override
    public void start(Stage primaryStage) throws Exception{
 
	    primaryStage.setTitle("BombLaucher");
	  
	    
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

	    endButton.setOnAction(actionEvent -> Platform.exit());
	   
	    BorderPane borderPane = new BorderPane();
	    borderPane.setCenter(grid);//center
	  




	    Scene scene = new Scene(borderPane , 110,150);

	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

    	
    	

	public static void main(String[] args) {
	    launch(args);
	}




	public void handle(Event event)
	{
	  if(event.getSource() == startButton)
	  {
	    
	  }
	}	
}
