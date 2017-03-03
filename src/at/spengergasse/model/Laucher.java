package at.spengergasse.model;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Laucher extends Application implements EventHandler
{
    Button startButton;
    Button optionsButton;
    Button endButton;
    @Override
    public void start(Stage primaryStage) throws Exception{
 
	    primaryStage.setTitle("BombLaucher");
	    HBox center = new HBox();
	    startButton = new Button("Start");
	    startButton.setPrefSize(250,50);
	    center.getChildren().addAll(startButton);
	    
	    
	    HBox bottom = new HBox();
	    optionsButton = new Button("Options");
	    endButton = new Button("End Game");

	    bottom.getChildren().addAll(optionsButton,endButton);
	    endButton.setOnAction(actionEvent -> Platform.exit());
	   
	    
	    BorderPane borderPane = new BorderPane();
	    borderPane.setCenter(center);//center
	    borderPane.setBottom(bottom); //Bottom




	    Scene scene = new Scene(borderPane, 500,500);

	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

    	
    	

	public static void main(String[] args) {
	    launch(args);
	}




	@Override
	public void handle(Event event)
	{
	  if(event.getSource() == startButton)
	  {
	    
	  }
	}	
}
