package at.spengergasse.gui;

import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;



public class SimpleApplicationFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {	
		
		 // print commandline arguments to the terminal window
		 final Parameters params = getParameters();
	     final List<String> parameters = params.getRaw();
	     for (String s:parameters){
	    	 System.out.println(s);
	     }
	     // instanciate frame
		 new Launcher(parameters);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}