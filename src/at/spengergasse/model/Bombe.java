package at.spengergasse.model;

import java.util.ArrayList;

public class Bombe {
	private int bombenCounter =0;
	private Fire bombFire;
	private ArrayList<Powerup> powerups;
	private Position pos;
	
	public Bombe() {
		// TODO Auto-generated constructor stub
		
		powerups = new ArrayList<Powerup>();
	}
	
	public void addPowerup(Powerup powerup) throws PowerUpException{
		if(powerup== null) throw new PowerUpException();
		powerups.add(powerup);
	}
	public void explosion(){
		
	}
	
	
	
	public ArrayList<Powerup> getPowerups() {
		return powerups;
	}
	
	public void setPowerups(ArrayList<Powerup> powerups) {
		this.powerups = powerups;
	}
		
	
}
