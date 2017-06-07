package at.spengergasse.gui;



import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Launcher extends Stage {

	final private Button startBTN;
	final private Button closeBTN;
	final private Button logFileBTN;
	final private SimpleActionListenerFX listener;	
	final private TextField player1;
	final private TextField player2;
	
	public Launcher(){	
		listener=new SimpleActionListenerFX(null,null, null, this);
		VBox vBox=new VBox();
		BorderPane borderPane=new BorderPane();
		GridPane gridPane=new GridPane();
		gridPane.setPadding(new Insets(10,10,10,10));
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		FlowPane fp = new FlowPane();
		Label l = new Label("VS");
		player1 = new TextField("Name eingeben");
		player2 = new TextField("Name eingeben");
		closeBTN=new Button("Close");
		closeBTN.addEventHandler(ActionEvent.ACTION, listener::handleAction);
		closeBTN.setPrefWidth(200);
		startBTN = new Button("Start");
		startBTN.addEventHandler(ActionEvent.ACTION, listener::handleAction);
		startBTN.setPrefWidth(200);
		logFileBTN= new Button("LogFile");
		logFileBTN.addEventHandler(ActionEvent.ACTION, listener::handleAction);
		logFileBTN.setPrefWidth(200);
		
		fp.getChildren().add(player1);
		fp.getChildren().add(l);
		fp.getChildren().add(player2);
		fp.setPadding(new Insets(5,5,5,50));
		
		gridPane.add(startBTN, 9, 1);
		gridPane.add(logFileBTN, 9, 2);
		gridPane.add(closeBTN, 9, 3);	
		borderPane.setTop(fp);
		borderPane.setCenter(gridPane);	
	
		setTitle("BombLauncher");
		setResizable(false);
		centerOnScreen();

        vBox.getChildren().add(borderPane);

		Scene scene=new Scene(vBox, 400, 150);
		setScene(scene);

		show();

	}

	public Button getStartBTN() {
		return startBTN;
	}

	public Button getCloseBTN() {
		return closeBTN;
	}

	public TextField getPlayer1() {
		return player1;
	}

	public TextField getPlayer2() {
		return player2;
	}

	public Button getLogFileBTN() {
		return logFileBTN;
	}



	
	
	
}
