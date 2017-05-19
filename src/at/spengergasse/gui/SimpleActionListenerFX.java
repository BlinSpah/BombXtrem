package at.spengergasse.gui;
/**
 * 
 */

import at.spengergasse.model.*;
import javafx.event.EventHandler;
import javafx.scene.effect.DisplacementMapBuilder;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class SimpleActionListenerFX implements EventHandler<KeyEvent> {
	
	// reference to panel
	final private Map map;
	private Player player;

	public SimpleActionListenerFX(Map map){
		this.map=map;
		player = new Player(false,new Position(1,1));

	}

	@Override
	public void handle(KeyEvent event) {
		// TODO Auto-generated method stub
	
		if(event.getCode()==KeyCode.ENTER){	
			map.getGrid().add(player.getPlayer1(), player.getPos().getX(), player.getPos().getY());				
		}
		//Bombe legen
		if(event.getCode()==KeyCode.SPACE){
			map.getGrid().add(player.getBomb().getBomb(), player.getPos().getX(), player.getPos().getY());
		}
		//Bewegungen
		if(event.getCode()==KeyCode.LEFT){
			map.getGrid().add(player.getPlayer1(),player.linksBewegen(), player.getPos().getY());
		}
		else if(event.getCode()== KeyCode.RIGHT){
			map.getGrid().add(player.getPlayer1(),player.rechtsBewegen(), player.getPos().getY());;
		}
		else if(event.getCode()== KeyCode.UP){
			map.getGrid().add(player.getPlayer1(), player.getPos().getX(), player.obenBewegen());;
		}
		else if(event.getCode()==KeyCode.DOWN){
			map.getGrid().add(player.getPlayer1(), player.getPos().getX(), player.untenBewegen());;
		}
	}

	

}
