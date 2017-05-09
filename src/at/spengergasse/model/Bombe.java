package at.spengergasse.model;

import java.util.ArrayList;

public class Bombe {
	private int bombenAnzahl;
	private Fire bombFire;
	private ArrayList<Powerup> powerups;
	private Position pos;
	
	public Bombe() {
		// TODO Auto-generated constructor stub
		bombenAnzahl = 1; 
		powerups = new ArrayList<Powerup>();
	}
	
	public void addPowerup(Powerup powerup) throws PowerUpException{
		if(powerup== null) throw new PowerUpException();
		powerups.add(powerup);
	}
	
	public int getBombenAnzahl() {
		return bombenAnzahl;
	}

	public void setBombenAnzahl(int bombenAnzahl) {
		this.bombenAnzahl = bombenAnzahl;
	}
	
	
	public ArrayList<Powerup> getPowerups() {
		return powerups;
	}
	
	public void setPowerups(ArrayList<Powerup> powerups) {
		this.powerups = powerups;
	}
		
	
}
