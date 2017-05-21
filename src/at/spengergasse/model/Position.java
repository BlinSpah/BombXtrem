package at.spengergasse.model;

public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		// TODO Auto-generated constructor stub
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x != 0 && x != 12 && y % 2 != 0 || x % 2 != 0 ){
			this.x = x;
		}
		
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
	
		if(y !=0 && y != 12 && x % 2 != 0 || y % 2 != 0){
			this.y = y;
		}
	}

}
