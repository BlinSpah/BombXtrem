package at.spengergasse.model;

public class Collision {
	private boolean hit;
	
	private int[][] collision = new int[][] {
		{8,0},
		{8,45},
		{40,0},
		{40,45}
	};
	
	public Collision() {
		// TODO Auto-generated constructor stub
	}
	public boolean isCollision() {
		return hit;
	}
	public void setCollision(boolean collision) {
		this.hit = collision;
	}
	
	public int[][] getCollision() {
		return collision;
	}
	public void setCollision(int[][] collision) {
		this.collision = collision;
	}
	
	
}
