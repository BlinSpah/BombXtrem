package at.spengergasse.model;

import at.spengergasse.gui.SimpleApplicationFX;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bombe {
	private int bombenCounter=0;
	private Fire bombFire;
	private Position pos;
	private ImageView bomb;
	
	public Bombe(Position pos, ImageView image){
		setPos(pos);
		setBomb(image);
		image.setTranslateX(pos.getX());
		image.setTranslateY(pos.getY());
	}
		
	public int getBombenCounter() {
		return bombenCounter;
	}

	public void setBombenCounter(int bombenCounter) {
		this.bombenCounter = bombenCounter;
	}

	public Fire getBombFire() {
		return bombFire;
	}

	public void setBombFire(Fire bombFire) {
		this.bombFire = bombFire;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
		
	}

	public ImageView getBomb() {
		return bomb;
	}

	public void setBomb(ImageView bomb) {
		this.bomb = bomb;
	}
		
	
}
