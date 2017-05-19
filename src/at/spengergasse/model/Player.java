package at.spengergasse.model;

public class Player {

	private boolean tot;
	private Bombe bomb;
	private Position pos;
	private Collision collision;
	public Player(boolean tot) {
		// TODO Auto-generated constructor stub
		setTot(tot);
		pos = new Position(1, 1);
	}
	public void linksBewegen(){
		
			pos.setX(pos.getX()-1);
		
	}
	
	public void rechtsBewegen(){
		pos.setX(pos.getX()+1);
	}
	
	public void obenBewegen(){
		pos.setY(pos.getY()+1);
	}
	
	public void untenBewegen(){
		pos.setY(pos.getY()+1);
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
	
	public Position getPos() {
		return pos;
	}
	
	public void setPos(Position pos) {
		this.pos = pos;
	}
	


}
