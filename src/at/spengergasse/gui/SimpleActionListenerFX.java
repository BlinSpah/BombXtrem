package at.spengergasse.gui;
/**
 * 
 */


import at.spengergasse.model.Player;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class SimpleActionListenerFX implements EventHandler<KeyEvent> {
	
	// reference to panel
	final private Map map;
	private Player player;

	public SimpleActionListenerFX(Map map){
		this.map=map;
		player = new Player(false);
	}

	@Override
	public void handle(KeyEvent event) {
		// TODO Auto-generated method stub
		if(event.getCode()==KeyCode.LEFT){
			player.linksBewegen();
		}
		else if(event.getCode()== KeyCode.RIGHT){
			player.rechtsBewegen();
		}
		else if(event.getCode()== KeyCode.UP){
			player.obenBewegen();
		}
		else if(event.getCode()==KeyCode.DOWN){
			player.untenBewegen();
		}
	}

	

}
