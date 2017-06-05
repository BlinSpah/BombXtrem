package at.spengergasse.model;

import javafx.scene.image.ImageView;

public class Fire {
	private Position pos;
	private int rangeLinks, rangeRechts, rangeOben, rangeUnten;
	private boolean hitLinks, hitRechts, hitOben, hitUnten;
	private boolean explosion;
	private ImageView image;

	public Fire(Position pos, ImageView image, int rangeLinks, int rangeRechts, int rangeOben, int rangeUnten) {
		// TODO Auto-generated constructor stub
		setPos(pos);
		setRangeLinks(rangeLinks);
		setRangeOben(rangeOben);
		setRangeRechts(rangeRechts);
		setRangeUnten(rangeUnten);
		setImage(image);
		image.setTranslateX(pos.getX());
		image.setTranslateY(pos.getY());
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
	
	public int getRangeLinks() {
		return rangeLinks;
	}
	
	public void setRangeLinks(int rangeLinks) {
		this.rangeLinks = rangeLinks;
	}
	
	public int getRangeRechts() {
		return rangeRechts;
	}
	
	public void setRangeRechts(int rangeRechts) {
		this.rangeRechts = rangeRechts;
	}
	
	public int getRangeOben() {
		return rangeOben;
	}
	
	public void setRangeOben(int rangeOben) {
		this.rangeOben = rangeOben;
	}
	
	public int getRangeUnten() {
		return rangeUnten;
	}
	
	public void setRangeUnten(int rangeUnten) {
		this.rangeUnten = rangeUnten;
	}
	
	public boolean isHitLinks() {
		return hitLinks;
	}
	
	public void setHitLinks(boolean hitLinks) {
		this.hitLinks = hitLinks;
	}
	
	public boolean isHitRechts() {
		return hitRechts;
	}
	
	public void setHitRechts(boolean hitRechts) {
		this.hitRechts = hitRechts;
	}
	
	public boolean isHitOben() {
		return hitOben;
	}
	
	public void setHitOben(boolean hitOben) {
		this.hitOben = hitOben;
	}
	
	public boolean isHitUnten() {
		return hitUnten;
	}
	
	public void setHitUnten(boolean hitUnten) {
		this.hitUnten = hitUnten;
	}
	
}
