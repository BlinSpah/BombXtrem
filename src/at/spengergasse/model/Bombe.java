package at.spengergasse.model;

import java.util.ArrayList;

public class Bombe {
	private int bombenAnzahl;
	private int range;
	private ArrayList<Powerup> powerups;
	
	public Bombe() {
		// TODO Auto-generated constructor stub
		bombenAnzahl = 1; 
		range = 1;
		powerups = new ArrayList<Powerup>();
	}
		
}
