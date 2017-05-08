package at.spengergasse.model;

public class Player {
	private boolean tot;
	private Bombe bomb;
	private int leben;
	
	public Player(boolean tot) {
		// TODO Auto-generated constructor stub
		setTot(tot);
	}
	public void bombSetzen(){
		
	}
	
	public boolean isTot() {
		return tot;
	}

	public void setTot(boolean tot) {
		this.tot = tot;
	}

	

}
