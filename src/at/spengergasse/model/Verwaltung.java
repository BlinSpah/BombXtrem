package at.spengergasse.model;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Verwaltung {
	
	
	File file;
	
	public Verwaltung(){
		String userHomeFolder = System.getProperty("user.home");
		file = new File(userHomeFolder,"logfile.txt");
	}
	
	public  void openFile() throws IOException {
        //text file, should be opening in default text editor;
        
        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
    }
	
		
	public void save(String name, String name2) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(name+" vs "+name2+"\n");
		bw.close();
	}


	public void readAndPrintLog() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(file));
		System.out.print("Letztes Match gespielt\n");
		String logString=br.readLine();
		while(logString!=null){
			System.out.println(logString);
			logString=br.readLine();
		}
		br.close();
	}

}

