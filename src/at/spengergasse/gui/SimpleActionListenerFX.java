package at.spengergasse.gui;
/**
 * 
 */

import java.util.logging.Handler;

import at.spengergasse.model.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class SimpleActionListenerFX implements EventHandler<KeyEvent> {
	
	// reference to panel
	final private Launcher launcher;
	final private Map map;
	private Player player1;
	private Player player2;

	public SimpleActionListenerFX(Map map, Player player, Launcher launcher){
		this.launcher=launcher;
		this.map=map;
		player1 = player;
		player2 = new Player(false,new Position(11,11),new javafx.scene.image.ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("player2.png"))));

	}


	public void handleAction(ActionEvent arg0) {
		// get component which is source of the event
		Object source=arg0.getSource();
		//Starte Spiel und schließe Launcher
		if(source==launcher.getStartBTN()){
			new Map();
			launcher.close();
		}
		//Schließe Launcher
		if(source==launcher.getCloseBTN()){
			launcher.close();
		}
	}
	
	@Override
	public void handle(KeyEvent event){
		if(event.getEventType() == KeyEvent.KEY_PRESSED) {
			if(event.getCode()==KeyCode.ENTER){	
//				map.getGrid().add(player1.getPlayer(), player1.getPos().getX(), player1.getPos().getY());				
			}
			
			//Player 
			//Bombe legen
			if(event.getCode()==KeyCode.E){
				map.getGrid().add(player1.getBomb().getBomb(), player1.getPos().getX(), player1.getPos().getY());
			}
			//Bewegungen
			if(event.getCode()==KeyCode.A){
				player1.setLeft(true);
			}
			else if(event.getCode()== KeyCode.D){
//				map.getGrid().add(player1.getPlayer(),player1.rechtsBewegen(), player1.getPos().getY());;
				player1.setRight(true);
			}
			else if(event.getCode()== KeyCode.W){
				player1.setUp(true);
			}
			else if(event.getCode()==KeyCode.S){
				player1.setDown(true);
			}
			
			if(event.getCode()==KeyCode.ENTER){	
//				map.getGrid().add(player2.getPlayer(), player2.getPos().getX(), player2.getPos().getY());				
			}
			//Bombe legen
			if(event.getCode()==KeyCode.SPACE){
				map.getGrid().add(player2.getBomb().getBomb(), player2.getPos().getX(), player2.getPos().getY());
			}
			//Bewegungen
			if(event.getCode()==KeyCode.LEFT){
//				map.getGrid().add(player2.getPlayer(),player2.linksBewegen(), player2.getPos().getY());
			}
			else if(event.getCode()== KeyCode.RIGHT){
//				map.getGrid().add(player2.getPlayer(),player2.rechtsBewegen(), player2.getPos().getY());;
			}
			else if(event.getCode()== KeyCode.UP){
//				map.getGrid().add(player2.getPlayer(), player2.getPos().getX(), player2.obenBewegen());;
			}
			else if(event.getCode()==KeyCode.DOWN){
//				map.getGrid().add(player2.getPlayer(), player2.getPos().getX(), player2.untenBewegen());;
			}
		} 
		if(event.getEventType() == KeyEvent.KEY_RELEASED) {
			if(event.getCode()==KeyCode.A){
				player1.setLeft(false);
				player1.setRight(false);
			}
			if(event.getCode()== KeyCode.D){
//				map.getGrid().add(player1.getPlayer(),player1.rechtsBewegen(), player1.getPos().getY());;
				player1.setRight(false);
				player1.setLeft(false);
			}
			if(event.getCode()== KeyCode.W){
				player1.setUp(false);
			}
			else if(event.getCode()==KeyCode.S){
				player1.setDown(false);
			}
		}
	}
}
