package at.spengergasse.gui;
/**
 * 
 */




import at.spengergasse.model.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;


public class SimpleActionListenerFX implements EventHandler<ActionEvent> {
	
	// reference to panel
	final private Launcher launcher;
	// reference to the model
	private Player player;
	
	public SimpleActionListenerFX(Launcher launcher){
		this.launcher=launcher;
	
		player = new Player(false);
		
	}

	/* (non-Javadoc)
	 * @see javafx.event.EventHandler#handle(javafx.event.Event)
	 */
	@Override
	public void handle(ActionEvent arg0) {
		// get component which is source of the event
		Object source=arg0.getSource();
		//**********************************************************************
		if(source == launcher.getStartButton()){
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(source == launcher.getEndButton()){
			launcher.close();
		}
		}
	
		}
	}
