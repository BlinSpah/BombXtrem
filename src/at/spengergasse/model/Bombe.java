package at.spengergasse.model;

import java.util.ArrayList;

import at.spengergasse.gui.SimpleApplicationFX;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bombe {
	private int bombenCounter =0;
	private Fire bombFire;
	private Position pos;
	private ImageView bomb;
	
	public Bombe() {
		// TODO Auto-generated constructor stub
		bomb = new ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("Bombe.png")));
		
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
