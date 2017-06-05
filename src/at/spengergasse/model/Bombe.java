package at.spengergasse.model;


import javafx.scene.image.ImageView;

public class Bombe {

	private Fire bombFire;
	private Position pos;
	private ImageView bomb;
	private boolean explodiert;
	
	public Bombe(Position pos, ImageView image){
		setPos(pos);
		setBomb(image);
		image.setTranslateX(pos.getX());
		image.setTranslateY(pos.getY());
	}
	
	public void explosion(ImageView image){
		if(bombFire == null){
		bombFire = new Fire(pos,image,1,1,1,1);
		}
		
	}
	
	public boolean isExplodiert() {
		return explodiert;
	}
	public void setExplodiert(boolean explodiert) {
		this.explodiert = explodiert;
	}
	public Fire getBombFire() {
		return bombFire;
	}

	public void setBombFire(Fire bombFire) {
		this.bombFire = bombFire;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
		
	}

	public ImageView getBomb() {
		return bomb;
	}

	public void setBomb(ImageView bomb) {
		this.bomb = bomb;
	}
		
	
}
