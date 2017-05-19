package at.spengergasse.gui;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Map extends Stage{
	
	final private ImageView[] uzb;
	final private SimpleActionListenerFX listener;
	final private GridPane grid;
    
	public Map(){			
		listener = new SimpleActionListenerFX(this);
		grid = new GridPane();
		grid.setStyle("-fx-background-color: #202020;");
		this.uzb = new ImageView[81];
		for(int i = 0 ; i<uzb.length;i++){
			uzb[i]= new ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("UnzerstoerbarerBlock.png")));
		}
		//add den Rand	
		for(int i = 0 ;i<=12;i++)
		grid.add(uzb[i], 0, i);
	
		for(int i = 0 ;i<=12;i++)
			grid.add(uzb[13+i], 12 , i);
		
		for(int i = 1 ;i<=11;i++)
			grid.add(uzb[25+i], i , 12);
	
		for(int i = 1 ;i<=11;i++)
			grid.add(uzb[38+i], i , 0);
		
		//inneren uzbs
		for(int i = 1 ;i<=5;i++)
			grid.add(uzb[51+i], i+i , 2);
		
		for(int i = 1 ;i<=5;i++)
			grid.add(uzb[57+i], i+i , 4);
		
		for(int i = 1 ;i<=5;i++)
			grid.add(uzb[63+i], i+i , 6);
		
		for(int i = 1 ;i<=5;i++)
			grid.add(uzb[69+i], i+i , 8);
		
		for(int i = 1 ;i<=5;i++)
			grid.add(uzb[75+i], i+i , 10);
	
		setTitle("BombXtrem");
		setResizable(false);
		Scene scene = new Scene(grid , 640,640);
		scene.addEventHandler(KeyEvent.KEY_PRESSED,listener);
	    setScene(scene);
	    show();			    
	}

	public GridPane getGrid() {
		return grid;
	}
	

}
