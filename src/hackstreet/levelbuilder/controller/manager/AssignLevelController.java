package hackstreet.levelbuilder.controller.manager;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.config.SavedLevelData;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * @author Ben
 */
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
			    reader.close();
			} catch (IOException x) {
			    System.err.println(x);
			}
		Gson gson = new Gson();
		AbstractLevelConfig obj ;
//Insert
		JsonParser parser = new JsonParser();
		JsonObject attr = null;
		try
		{
		attr = parser.parse(filebuffer).getAsJsonObject();
		}
		catch (JsonSyntaxException e)
		{
			JOptionPane.showMessageDialog(null, "Your Level file is corrupted. Unable to add.", "Error", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		if (attr.get("Type") == null)
		{
			JOptionPane.showMessageDialog(null, "Your Level file is corrupted. Unable to add.", "Error", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
			
			
			String type = attr.get("Type").getAsString();

		System.out.println("Loading Config");

		if(type.equals("Elimination")){

			obj = gson.fromJson(filebuffer, EliminationLevelConfig.class);
		}
		else if(type.equals("Lightning")){
			obj =  gson.fromJson(filebuffer, LightningLevelConfig.class);
		}
		else if(type.equals("Puzzle")){
			obj = gson.fromJson(filebuffer, PuzzleLevelConfig.class);
		}
		else {
			obj = 	gson.fromJson(filebuffer, ReleaseLevelConfig.class);
		}	

//End
		if (application.getSelectedLevel() > application.levelData.size()-1 )
		{
			System.out.println(obj.getFile());
			application.levelData.add(new SavedLevelData(obj));
			application.levelButtons.get(application.getSelectedLevel()).setText( obj.getName() );
		}
		else
		{
			for (int i = application.levelData.size()-1; i < application.getSelectedLevel();i++)
			{
				application.levelData.add(null);
				application.levelButtons.get(i).setText("");
			}
			
			
			application.levelData.set(application.getSelectedLevel(), new SavedLevelData(gson.fromJson(filebuffer, AbstractLevelConfig.class)));
			
//			application.levelButtons.get(application.getSelectedLevel()).setText(application.levelData.get(application.getSelectedLevel()).getLevelConfig().getName());
			
			
			
		}
		
		
		
	}

}
