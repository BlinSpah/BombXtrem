package at.spengergasse.gui;


import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Launcher extends Stage{
    Button startButton;
    Button optionsButton;
    Button endButton;
    final private List<String> args;
  
    public Launcher(List<String> args) throws Exception{
    	this.args=args; 
    	
	   setTitle("BombLauncher");
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

	    
	    endButton.setGraphic(new ImageView(new Image(MainGame.class.getResourceAsStream("UnzerstoerbarerBlock.png"))));
	    
	    BorderPane borderPane = new BorderPane();
	    borderPane.setCenter(grid);//center
	    Scene scene = new Scene(borderPane , 110,150);

	    setScene(scene);
	    show();	       	    
	   
	}


	public Button getStartButton() {
		return startButton;
	}

	public void setStartButton(Button startButton) {
		this.startButton = startButton;
	}

	public Button getOptionsButton() {
		return optionsButton;
	}

	public void setOptionsButton(Button optionsButton) {
		this.optionsButton = optionsButton;
	}

	public Button getEndButton() {
		return endButton;
	}

	public void setEndButton(Button endButton) {
		this.endButton = endButton;
	}

	
	
	
}
