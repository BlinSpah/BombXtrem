package at.spengergasse.model;


import javafx.scene.image.ImageView;

public class Player {

	private boolean tot;
	private Bombe bomb;
	private Fire bombFire;
	private Position pos;
	private Position bombPos;
	private Collision collision;
	private ImageView player;
	
	private boolean setBomb;
	private boolean explodiert;
	
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	public Player(boolean tot,Position pos,ImageView image) {
		// TODO Auto-generated constructor stub
		setTot(tot);
		setPos(pos);
		setPlayer(image);
		image.setTranslateX(pos.getX());
		image.setTranslateY(pos.getY());
		collision = new Collision();
		
	}
	public void linksBewegen(){
		pos.setX(pos.getX()-2);
		player.setTranslateX(pos.getX());
	}
	
	public void rechtsBewegen(){
		pos.setX(pos.getX()+2);
		player.setTranslateX(pos.getX());
	}
	
	public void obenBewegen(){
		pos.setY(pos.getY()-2);
		player.setTranslateY(pos.getY());
	}
	
	public void untenBewegen(){
		pos.setY(pos.getY()+2);
		player.setTranslateY(pos.getY());
	}
	
	public void dropBomb(ImageView image){
		if(bomb == null){
			bomb = new Bombe(new Position(pos.getX(), pos.getY()), image);
			bombPos = bomb.getPos();
		}
	}
	
	public void explosion(ImageView image){
		if(bombFire == null){
		bombFire = new Fire(bombPos,image);
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
	public Position getBombPos() {
		return bombPos;
	}
	public void setBombPos(Position bombPos) {
		this.bombPos = bombPos;
	}
	public boolean isSetBomb() {
		return setBomb;
	}
	public void setSetBomb(boolean setBomb) {
		this.setBomb = setBomb;
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
	public ImageView getPlayer() {
		return player;
	}
	public void setPlayer(ImageView player) {
		this.player = player;
	}
	public Bombe getBomb() {
		return bomb;
	}
	public void setBomb(Bombe bomb) {
		this.bomb = bomb;
	}
	
	public ImageView getImageView() {
		return this.player;
	}
	public boolean isLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	public boolean isRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}
	public boolean isUp() {
		return up;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
	public boolean isDown() {
		return down;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
	public int[][] getCollision() {
		return collision.getCollision();
	}
	public void setCollision(Collision collision) {
		this.collision = collision;
	}
	
	
}
