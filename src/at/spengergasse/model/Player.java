package at.spengergasse.model;

public class Player {

	private boolean tot;
	private Bombe bomb;
	private int leben;
	private Position pos;
	private Collision collision;
	public Player(boolean tot) {
		// TODO Auto-generated constructor stub
		setTot(tot);
	}
	public void linksBewegen(){
		if(collision.isCollision() == false){
			
		}
	}
	public void rechtsBewegen(){
		
	}
	public void obenBewegen(){
		
	}
	public void untenBewegen(){
		
	}
	public void dropBomb(){
		int bombenImSpiel = 0;
		
			
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
	


}
