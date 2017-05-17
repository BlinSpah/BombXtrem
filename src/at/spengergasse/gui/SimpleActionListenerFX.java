package at.spengergasse.gui;
/**
 * 
 */


import java.io.IOException;
import java.util.Locale;

import at.spengergasse.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;


public class SimpleActionListenerFX implements EventHandler<ActionEvent> {
	
	// reference to panel
	final private Launcher simpleFrame;
	private Map map;
	// reference to the model
	private Player player;

	public SimpleActionListenerFX(Launcher simpleFrame){
		this.simpleFrame=simpleFrame;
		player=new Player(false);
	
	}

	@Override
	public void handle(ActionEvent arg0) {
	
		Object source=arg0.getSource();
			if (source==simpleFrame.getStartBTN()){
				simpleFrame.close();
				map = new Map();
			}

		if (source==simpleFrame.getCloseBTN()){
			simpleFrame.close();
		}
	}

}
