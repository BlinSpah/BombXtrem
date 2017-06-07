package at.spengergasse.model;

import javafx.scene.image.ImageView;

public class Fire {
	private Position pos;
	private boolean explosion;
	private ImageView image;

	public Fire(Position pos, ImageView image) {
		// TODO Auto-generated constructor stub
		setPos(pos);
	
		setImage(image);
		image.setTranslateX((pos.getX()/50)*50);
		image.setTranslateY((pos.getY()/50)*50);
	}
	
	public ImageView getImage() {
		return image;
	}

	public void setImage(ImageView image) {
		this.image = image;
	}

	public boolean isExplosion() {
		return explosion;
	}

	public void setExplosion(boolean explosion) {
		this.explosion = explosion;
	}

	public Position getPos() {
		return pos;
	}
	
	public void setPos(Position pos) {
		this.pos = pos;
	}
}