package at.spengergasse.model;

import at.spengergasse.gui.SimpleApplicationFX;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player {

	private boolean tot;
	private Bombe bomb;
	private Position pos;
	private Collision collision;
	private ImageView player;
	
	public Player(boolean tot,Position pos,ImageView imageView) {
		// TODO Auto-generated constructor stub
		setTot(tot);
		setPos(pos);
<<<<<<< HEAD
		player1 = new ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("Player1.png")));
		
=======
		setPlayer(imageView);
		bomb = new Bombe();
>>>>>>> branch 'master' of https://github.com/BlinSpah/BombXtrem
	}
	public int linksBewegen(){
		pos.setX(pos.getX()-1);
		return pos.getX();
	}
	
	public int rechtsBewegen(){
		pos.setX(pos.getX()+1);
		return pos.getX();
		
	}
	
	public int obenBewegen(){
		
		
		if(pos.getY()==0) return pos.getY()+2;
		pos.setY(pos.getY()-1);
		System.out.println(pos.getY());
		return pos.getY();
	}
	
	public int untenBewegen(){
		
		if(pos.getY()==12) return pos.getY()-2;
		pos.setY(pos.getY()+1);
		System.out.println(pos.getY());
		return pos.getY();
	}
	
	
	public void dropBomb(){
		int bombenImSpiel = 0;
		bomb = new Bombe();
		}
	
	
	public void playerTot(){
		setTot(true);
	}
	
	public boolean isTot() {
		return tot;
	}

	public void setTot(boolean tot) {
		this.tot = tot;
	}
	
	public Position getPos() {
		return pos;
	}
	
	public void setPos(Position pos) {
		
		this.pos = pos;
	}
	public ImageView getPlayer() {
		return player;
	}
	public void setPlayer(ImageView player) {
		this.player = player;
	}
	public Bombe getBomb() {
		return bomb;
	}
	public void setBomb(Bombe bomb) {
		this.bomb = bomb;
	}
	


}
