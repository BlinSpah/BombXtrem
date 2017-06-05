package at.spengergasse.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player {

	private boolean tot;
	private Bombe bomb;
	private Position pos;
	private Collision collision;
	private ImageView player;
	
	private boolean setBomb;
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
		
	public static BufferedWriter bw;
	public final String filename;
	
	public Player(boolean tot,Position pos,ImageView imageView) {
		// TODO Auto-generated constructor stub
		setTot(tot);
		setPos(pos);
		setPlayer(imageView);
		imageView.setTranslateX(pos.getX());
		imageView.setTranslateY(pos.getY());
		collision = new Collision();
		filename = "logfile.txt";
		try {
			bw = new BufferedWriter(new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public boolean dropBomb(ImageView image){
		if(bomb == null){
			bomb = new Bombe(new Position(pos.getX(),pos.getY()), image);
		}
		return true;
	}
	
	
	public void save(String name, String name2) throws IOException{			
		bw.write(name+";"+name2+"\n");
		bw.close();
	}


	public void readAndPrintLog() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(filename));
		System.out.print("Matches gespielt\n");
		String logString=br.readLine();
		while(logString!=null){
			System.out.println(logString);
			logString=br.readLine();
		}
		br.close();
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
