package hackstreet.levelbuilder.controller.manager;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;

import javax.swing.JFileChooser;

public class AssignLevelController implements ActionListener{
	


	LevelBuilderApplication application;
	
	public AssignLevelController(LevelBuilderApplication app)
	{
		application = app;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (application.getSelectedLevel() == null)
		{
			System.err.println("No Selected Level");
			return;
		}
		

		//Load a file, let the user choose
		JFileChooser jfc = new JFileChooser()	;
		jfc.showOpenDialog(null);
		String filebuffer = "";
		
		//Attempt to load a file, this will throw an exception if anything goes wrong.
		try (InputStream in = Files.newInputStream(jfc.getSelectedFile().toPath());
			    BufferedReader reader =
			      new BufferedReader(new InputStreamReader(in))) {
			    String line = null;
			    while ((line = reader.readLine()) != null) {
			        filebuffer += line;
			    }
			} catch (IOException x) {
			    System.err.println(x);
			}
		
		
	}

}
