package at.spengergasse.gui;
/**
 * 
 */

import javax.swing.text.html.ImageView;

import at.spengergasse.model.*;
import javafx.event.EventHandler;
import javafx.scene.effect.DisplacementMapBuilder;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class SimpleActionListenerFX implements EventHandler<KeyEvent> {
	
	// reference to panel
	final private Map map;
	private Player player1;
	private Player player2;

	public SimpleActionListenerFX(Map map){
		this.map=map;
		player1 = new Player(false,new Position(1,1),new javafx.scene.image.ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("player1.png"))));
		player2 = new Player(false,new Position(11,11),new javafx.scene.image.ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("player2.png"))));

	}

	@Override
	public void handle(KeyEvent event){
		// TODO Auto-generated method stub
	try
	{
		if(event.getCode()==KeyCode.ENTER){	
			map.getGrid().add(player1.getPlayer(), player1.getPos().getX(), player1.getPos().getY());				
		}
		//Bombe legen
		if(event.getCode()==KeyCode.SPACE){
			map.getGrid().add(player1.getBomb().getBomb(), player1.getPos().getX(), player1.getPos().getY());
		}
		//Bewegungen
		if(event.getCode()==KeyCode.LEFT){
			map.getGrid().add(player1.getPlayer(),player1.linksBewegen(), player1.getPos().getY());
		}
		else if(event.getCode()== KeyCode.RIGHT){
			map.getGrid().add(player1.getPlayer(),player1.rechtsBewegen(), player1.getPos().getY());;
		}
		else if(event.getCode()== KeyCode.UP){
			map.getGrid().add(player1.getPlayer(), player1.getPos().getX(), player1.obenBewegen());;
		}
		else if(event.getCode()==KeyCode.DOWN){
			map.getGrid().add(player1.getPlayer(), player1.getPos().getX(), player1.untenBewegen());;
		}
		
		if(event.getCode()==KeyCode.ENTER){	
			map.getGrid().add(player2.getPlayer(), player2.getPos().getX(), player2.getPos().getY());				
		}
		//Bombe legen
		if(event.getCode()==KeyCode.E){
			map.getGrid().add(player2.getBomb().getBomb(), player2.getPos().getX(), player2.getPos().getY());
		}
		//Bewegungen
		if(event.getCode()==KeyCode.A){
			map.getGrid().add(player2.getPlayer(),player2.linksBewegen(), player2.getPos().getY());
		}
		else if(event.getCode()== KeyCode.D){
			map.getGrid().add(player2.getPlayer(),player2.rechtsBewegen(), player2.getPos().getY());;
		}
		else if(event.getCode()== KeyCode.W){
			map.getGrid().add(player2.getPlayer(), player2.getPos().getX(), player2.obenBewegen());;
		}
		else if(event.getCode()==KeyCode.S){
			map.getGrid().add(player2.getPlayer(), player2.getPos().getX(), player2.untenBewegen());;
		}
		
	}
	catch(Exception e)
	{
		
	}
	}

	

}
