package at.spengergasse.gui;

import javafx.application.Application;
import javafx.stage.Stage;



public class SimpleApplicationFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {	
	
		new Map();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}