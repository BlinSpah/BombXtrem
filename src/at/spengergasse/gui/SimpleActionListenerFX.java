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
	final private MainGame maingame;
	// reference to the model
	private Player player;
	
	public SimpleActionListenerFX(Launcher launcher,MainGame maingame ){
		this.launcher=launcher;
		this.maingame=maingame;
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
				maingame.start(new Stage());
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
