package at.spengergasse.gui;
/**
 * 
 */


import java.io.IOException;
import java.util.Locale;

import at.spengergasse.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/**
 * @author Leo Fanzott
 *
 */
public class SimpleActionListenerFX implements EventHandler<ActionEvent> {
	
	// reference to panel
	final private Launcher simpleFrame;
	// reference to the model
	private Player player;
	
	/**
	 * 
	 * @param simpleFrame
	 */
	public SimpleActionListenerFX(Launcher simpleFrame){
		this.simpleFrame=simpleFrame;
		player=new Player(false);
		// set values of the text fields
	
	}

	/* (non-Javadoc)
	 * @see javafx.event.EventHandler#handle(javafx.event.Event)
	 */
	@Override
	public void handle(ActionEvent arg0) {
		// get component which is source of the event
		Object source=arg0.getSource();
		//**********************************************************************
		// calculate button
		if (source==simpleFrame.getStartBTN()){
			
			}

		//**********************************************************************
		// close
		if (source==simpleFrame.getCloseBTN()){
			simpleFrame.close();
		}
	}

}
