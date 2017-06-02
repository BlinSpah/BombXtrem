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
		grid = new GridPane();
		listener = new SimpleActionListenerFX(this, p);
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

				for (int i = 0; i < coll.length; i++) {
					Rectangle r = new Rectangle(5, 5, Color.RED);
					r.setTranslateX(coll[i][0] + p.getImageView().getTranslateX());
					r.setTranslateY(coll[i][1] + p.getImageView().getTranslateY());
					root.getChildren().add(r);
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
				
				
				if(p.dropBomb()==true){
				
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
