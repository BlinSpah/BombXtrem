package at.spengergasse.model;

public class Player {
	private boolean tot;
	private Bombe bomb;
	private int leben;
	private Position pos;
	
	public Player(boolean tot) {
		// TODO Auto-generated constructor stub
		setTot(tot);
	}

	public void dropBomb(){
		int bombenImSpiel = 0;
		if(bombenImSpiel < bomb.getBombenAnzahl()){
			
		}
	}
	
	public void playerTot(){
		if(pos){
			setTot(true);
		}
	}
	
	public boolean isTot() {
		return tot;
	}

	public void setTot(boolean tot) {
		this.tot = tot;
	}
	


}
