package at.spengergasse.gui;


import java.util.List;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Launcher extends Stage {

	final private Button startBTN;
	final private Button optionsBTN;
	final private Button closeBTN;	
	final private SimpleActionListenerFX listener;	
	final private List<String> args;
	
	public Launcher(List<String> args){	

		this.args=args;
		listener=new SimpleActionListenerFX(this);
		
		
		VBox vBox=new VBox();
		BorderPane borderPane=new BorderPane();
		GridPane gridPane=new GridPane();
		gridPane.setPadding(new Insets(10,10,10,10));

		gridPane.setHgap(10);
		gridPane.setVgap(10);

		FlowPane buttonPane=new FlowPane();	
		closeBTN=new Button("Close");
		closeBTN.addEventHandler(ActionEvent.ACTION, listener);
		startBTN = new Button("Start");
		startBTN.addEventHandler(ActionEvent.ACTION, listener);
		optionsBTN = new Button("Options");
		optionsBTN.addEventHandler(ActionEvent.ACTION, listener);
		HBox hBox=new HBox();
		hBox.setPadding(new Insets(2, 2, 2, 2));

		buttonPane.getChildren().add(startBTN);
		buttonPane.getChildren().add(hBox);
		buttonPane.getChildren().add(closeBTN);
		
		borderPane.setBottom(buttonPane);
		borderPane.setCenter(gridPane);
		
	
		setTitle("BombLauncher");
		setResizable(false);
		centerOnScreen();

        vBox.getChildren().addAll(borderPane);

		Scene scene=new Scene(vBox, 460, 170);
		setScene(scene);

		show();

	}

	public Button getStartBTN() {
		return startBTN;
	}

	

	public Button getOptionsBTN() {
		return optionsBTN;
	}



	public Button getCloseBTN() {
		return closeBTN;
	}



	
	
	
}
