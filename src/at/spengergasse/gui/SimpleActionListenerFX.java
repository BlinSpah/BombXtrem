package at.spengergasse.gui;
/**
 * 
 */

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import at.spengergasse.model.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class SimpleActionListenerFX implements EventHandler<KeyEvent> {
	
	// reference to panel
	final private Launcher launcher;
	final private Map map;
	private Player player1;
	private Player player2;

	public SimpleActionListenerFX(Map map, Player player,Player p2, Launcher launcher){
		this.launcher=launcher;
		this.map=map;
		player1 = player;
		player2 = p2;

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
		if(source==launcher.getLogFileBTN()){
			try {
				player1.readAndPrintLog();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void handle(KeyEvent event){
		if(event.getEventType() == KeyEvent.KEY_PRESSED) {
			if(event.getCode()==KeyCode.ENTER){	
		
			}
			
			//Player 
			//Bombe legen
			if(event.getCode()==KeyCode.E){			
				player1.setSetBomb(true);
				Timer t = new Timer();
				//Wie lange die Bombe auf dem Feld bleibt bis sie explodiert
				t.schedule(new TimerTask() {
					@Override
					public void run() {
						player1.setExplodiert(true);		
					    player1.setSetBomb(false);
					    player1.setBomb(null);
					    //Wie lange die Flammen auf dem Feld bleiben
					    t.schedule(new TimerTask(){
					    	@Override
					    	public void run(){
					    		player1.setExplodiert(false);
					    		player1.setBombFire(null);
					    	}
					    }, 1000l);
					  }
					}, 2000l);
				
			}
			//Bewegungen
			if(event.getCode()==KeyCode.A){
				player1.setLeft(true);
			}
			else if(event.getCode()== KeyCode.D){
				player1.setRight(true);
			}
			else if(event.getCode()== KeyCode.W){
				player1.setUp(true);
			}
			else if(event.getCode()==KeyCode.S){
				player1.setDown(true);
			}
			
			//Bombe legen
			if(event.getCode()==KeyCode.SPACE){
				player2.setSetBomb(true);
				Timer t = new Timer();
				t.schedule(new TimerTask() {
					@Override
					public void run() {
						player2.setExplodiert(true);		
					    player2.setSetBomb(false);
					    player2.setBomb(null);
					    
					    t.schedule(new TimerTask(){
					    	@Override
					    	public void run(){
					    		player2.setExplodiert(false);
					    		player2.setBombFire(null);
					    	}
					    }, 1000l);
					  }
					}, 2000l);
			}
			//Bewegungen
			if(event.getCode()==KeyCode.LEFT){
				player2.setLeft(true);
			}
			else if(event.getCode()== KeyCode.RIGHT){
				player2.setRight(true);
			}
			else if(event.getCode()== KeyCode.UP){
				player2.setUp(true);
			}
			else if(event.getCode()==KeyCode.DOWN){
				player2.setDown(true);
			}
		} 
		if(event.getEventType() == KeyEvent.KEY_RELEASED) {
			if(event.getCode()==KeyCode.A){
				player1.setLeft(false);
			}
			if(event.getCode()== KeyCode.D){
				player1.setRight(false);
			}
			if(event.getCode()== KeyCode.W){
				player1.setUp(false);
			}
			if(event.getCode()==KeyCode.S){
				player1.setDown(false);
			}
			if(event.getCode()==KeyCode.LEFT){
				player2.setLeft(false);
			}
			if(event.getCode()== KeyCode.RIGHT){
				player2.setRight(false);
			}
			if(event.getCode()== KeyCode.UP){
				player2.setUp(false);
			}
			if(event.getCode()==KeyCode.DOWN){
				player2.setDown(false);
			}
			
		}
	}
}
