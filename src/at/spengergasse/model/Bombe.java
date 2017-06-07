package at.spengergasse.model;


import javafx.scene.image.ImageView;

public class Bombe {

	
	private Position pos;
	private ImageView bomb;
	
	public Bombe(Position pos, ImageView image){
		setPos(pos);
		setBomb(image);
		image.setTranslateX((pos.getX()/50)*50);
		image.setTranslateY((pos.getY()/50)*50);
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
