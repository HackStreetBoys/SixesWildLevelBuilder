package hackstreet.levelbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Stack;

import javax.swing.JFileChooser;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.move.IMove;

public class SWLevelBuilder {

	
	private AbstractLevelConfig levelConfig;
	private Stack<IMove> undoStack = new Stack<IMove>();
	private Stack<IMove> redoStack = new Stack<IMove>();
	
	/**
	 * Empty constructor
	 */
	public SWLevelBuilder(){
		this.setupDefaultLevel();
	}
	
	public void setupDefaultLevel(){
		this.levelConfig = new PuzzleLevelConfig(50);
		this.levelConfig.setFreq1(.25);
		this.levelConfig.setFreq2(.2);
		this.levelConfig.setFreq3(.2);
		this.levelConfig.setFreq4(.2);
		this.levelConfig.setFreq5(.1);
		this.levelConfig.setFreq6(.05);
		this.levelConfig.setFreqMult1(0.85);
		this.levelConfig.setFreqMult2(0.1);
		this.levelConfig.setFreqMult3(0.05);
	}
	
	/**
	 * 
	 */
	public void saveLevel(AbstractLevelConfig config){
		//It is important to try the following lines of code, we may load a null file or something that will break the system.
		try	{
		
		if (config.File == null) 	//This is for if the level has never been saved before.
										//Render a jFileChooser so that the user can choose where to save his files.
			{
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File(System.getProperty("user.dir")));
			jfc.showSaveDialog(null);
			
			config.File = jfc.getSelectedFile();
			}
		
		File file = config.File;
			 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			
			//Standard write to file
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(config.getJSON());
			bw.close();
			//close stream.
 
			System.out.println("Succesfully Wrote to file.\n"+levelConfig.getJSON());
 
		} 
		catch (IOException e){
			e.printStackTrace();
		}

			
	}
	
	/**
	 * 			
	 */
	public AbstractLevelConfig loadLevel(){
		
		//Load a file, let the user choose
		JFileChooser jfc = new JFileChooser()	;
		jfc.setCurrentDirectory(new File(System.getProperty("user.dir")));
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
		
		
		//Initialize a Google Json Serializer.
		Gson gson = new Gson();
//		 System.err.println(filebuffer);
		
		//Check in the file to see what level type we are dealing with. We cannot instantiate an AbstractLevelConfig.
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(filebuffer).getAsJsonObject();
		
		String type = obj.get("Type").getAsString();
		
		//Now we know what type that the Level is, we will instantiate the correct class.
		switch (type)
		{
		case "Lightning":
			this.levelConfig = gson.fromJson(filebuffer, LightningLevelConfig.class);
			break;
		case "Elimination":
			this.levelConfig = gson.fromJson(filebuffer, EliminationLevelConfig.class);
			break;
		case "Puzzle":
			this.levelConfig = gson.fromJson(filebuffer, PuzzleLevelConfig.class);
			break;
			
		case "Release":
			this.levelConfig = gson.fromJson(filebuffer, ReleaseLevelConfig.class);
			break;
			
		}
		System.out.println("Successfully Loaded Level");
		return this.levelConfig;
	}
	
	/**
	 * Places an IMove onto the undoStack, and clears the redoStack
	 * if it contains any IMoves.
	 * @param move to log
	 */
	public void logMove(IMove move){
		this.undoStack.push(move);
		this.redoStack.clear();
	}
	
	/**
	 * Undoes the IMove on top of the undoStack, and places it
	 * on top of the redoStack.
	 */
	public void undoMove(IMove move){
		this.undoStack.pop();
		this.redoStack.push(move);
	}
	
	/**
	 * Does the IMove on top of the redoStack, and places it
	 * on top of the undoStack without clearing the redoStack.
	 */
	public void redoMove(IMove move){
		this.undoStack.push(this.redoStack.pop());
		this.redoStack.clear();
	}

	public AbstractLevelConfig getLevelConfig() {
		return levelConfig;
	}

	public void setLevelConfig(AbstractLevelConfig levelConfig) {
		this.levelConfig = levelConfig;
	}
	
	public Stack<IMove> getUndoStack() {
		return undoStack;
	}

	public Stack<IMove> getRedoStack() {
		return redoStack;
	}
}
