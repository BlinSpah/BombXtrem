package at.spengergasse.gui;

import at.spengergasse.model.Player;
import at.spengergasse.model.Position;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Map extends Stage {

	final private ImageView[] uzb;
	final private SimpleActionListenerFX listener;
	final private GridPane grid;

	public Map() {

		Group root = new Group();
		Player p = new Player(false, new Position(50, 50), new ImageView("/at/spengergasse/gui/Player1.png"));
		Player p2 = new Player(false, new Position(550,550), new ImageView("/at/spengergasse/gui/Player2.png"));
		grid = new GridPane();
		listener = new SimpleActionListenerFX(this, p,p2, null);
		grid.setStyle("-fx-background-color: #202020;");
		this.uzb = new ImageView[81];
		for (int i = 0; i < uzb.length; i++) {
			uzb[i] = new ImageView(
					new Image(SimpleApplicationFX.class.getResourceAsStream("UnzerstoerbarerBlock.png")));
		}
		int[][] coll = p.getCollision();
		// add den Rand

		AnimationTimer gl = new AnimationTimer() {

			@Override
			public void handle(long now) {
				update();
				render();
			}

			private void render() {
				root.getChildren().clear();
				grid.getChildren().clear();
				for (int i = 0; i <= 12; i++)
					grid.add(uzb[i], 0, i);

				for (int i = 0; i <= 12; i++)
					grid.add(uzb[13 + i], 12, i);

				for (int i = 1; i <= 11; i++)
					grid.add(uzb[25 + i], i, 12);

				for (int i = 1; i <= 11; i++)
					grid.add(uzb[38 + i], i, 0);

				// inneren uzbs
				for (int i = 1; i <= 5; i++)
					grid.add(uzb[51 + i], i + i, 2);

				for (int i = 1; i <= 5; i++)
					grid.add(uzb[57 + i], i + i, 4);

				for (int i = 1; i <= 5; i++)
					grid.add(uzb[63 + i], i + i, 6);

				for (int i = 1; i <= 5; i++)
					grid.add(uzb[69 + i], i + i, 8);

				for (int i = 1; i <= 5; i++)
					grid.add(uzb[75 + i], i + i, 10);

				root.getChildren().add(grid);
				root.getChildren().add(p.getImageView());
				root.getChildren().add(p2.getImageView());
				
				if(p.isSetBomb()){
					p.dropBomb(new ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("Bombe.png"))));
					root.getChildren().add(p.getBomb().getBomb());
//					if(p.getBomb().isExplodiert()){
//						p.getBomb().explosion(new ImageView(new Image(SimpleApplicationFX.class.getResourceAsStream("Fire.png"))));
//						root.getChildren().add(p.getBomb().getBombFire().getImage());						
//					}
				}
				
			}
			private void update() {
				for (int i = 0; i < coll.length; i++) {
					for (int j = 0; j < grid.getChildren().size(); j++) {
						if(p.getImageView().getTranslateY() + coll[i][1] >= grid.getChildren().get(j).getLayoutY()
						   && p.getImageView().getTranslateY() + coll[i][1] <= grid.getChildren().get(j).getLayoutY() + 45) {
							if(p.getImageView().getTranslateX() + coll[i][0] == grid.getChildren().get(j).getLayoutX() 
									&& p.isRight()) {
								p.setRight(false);
								break;
							}						
							if(p.getImageView().getTranslateX() + coll[i][0] == grid.getChildren().get(j).getLayoutX() + 50 
									&& p.isLeft()) {
								p.setLeft(false);
								break;
							}
							
						}
						if(p2.getImageView().getTranslateY() + coll[i][1] >= grid.getChildren().get(j).getLayoutY()
							&& p2.getImageView().getTranslateY() + coll[i][1] <= grid.getChildren().get(j).getLayoutY() + 45) {
								if(p2.getImageView().getTranslateX() + coll[i][0] == grid.getChildren().get(j).getLayoutX() 
									&& p2.isRight()) {
										p2.setRight(false);
										break;
									}
								if(p2.getImageView().getTranslateX() + coll[i][0] == grid.getChildren().get(j).getLayoutX() + 50 
										&& p2.isLeft()) {
											p2.setLeft(false);
											break;
									}
							}	
									
						if(p.getImageView().getTranslateX() + coll[i][0] >= grid.getChildren().get(j).getLayoutX()
								&& p.getImageView().getTranslateX() + coll[i][0] <= grid.getChildren().get(j).getLayoutX() + 50) {
							if(p.getImageView().getTranslateY() + coll[0][0] == grid.getChildren().get(j).getLayoutY() + 50
									&& p.isUp()) {
								p.setUp(false);
								break;
							}
							if(p.getImageView().getTranslateY() + 46 == grid.getChildren().get(j).getLayoutY()
									&& p.isDown()){
								p.setDown(false);
								break;
							}
						}
						if(p2.getImageView().getTranslateX() + coll[i][0] >= grid.getChildren().get(j).getLayoutX()
								&& p2.getImageView().getTranslateX() + coll[i][0] <= grid.getChildren().get(j).getLayoutX() + 50) {
							if(p2.getImageView().getTranslateY() + coll[0][0] == grid.getChildren().get(j).getLayoutY() + 50
									&& p2.isUp()) {
								p2.setUp(false);
								break;
							}
							if(p2.getImageView().getTranslateY() + 46 == grid.getChildren().get(j).getLayoutY()
									&& p2.isDown()){
								p2.setDown(false);
								break;
							}
						}
					}
				}
				if (p.isLeft() && !p.isRight()) {
					p.linksBewegen();
				} else if (p.isRight() && !p.isLeft()) {
					p.rechtsBewegen();
				}
				if (p.isUp() && !p.isDown()) {
					p.obenBewegen();
				} else if (p.isDown() && !p.isUp()) {
					p.untenBewegen();
				}
				
				if (p2.isLeft() && !p2.isRight()) {
					p2.linksBewegen();
				} else if (p2.isRight() && !p2.isLeft()) {
					p2.rechtsBewegen();
				}
				if (p2.isUp() && !p2.isDown()) {
					p2.obenBewegen();
				} else if (p2.isDown() && !p2.isUp()) {
					p2.untenBewegen();
				}
				
				
			}
			
		};
		gl.start();

		setTitle("BombXtrem");
		setResizable(false);
		Scene scene = new Scene(root, 640, 640);
		scene.addEventHandler(KeyEvent.KEY_PRESSED, listener);
		scene.addEventHandler(KeyEvent.KEY_RELEASED, listener);
		setScene(scene);
		show();
	}

	public GridPane getGrid() {
		return grid;
	}

}
