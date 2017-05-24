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
		if(this.x + x > 100 && this.x + x < 1100) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(this.y + y < 1100 && this.y + y > 100) {
			this.y = y;
		} else {
			if(this.y < 55) {
				this.y = 50;
			}
		}
		
	}

}
