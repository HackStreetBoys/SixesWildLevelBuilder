package hackstreet.levelbuilder.gui;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;

import hackstreet.levelbuilder.config.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.WindowConstants;










import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import hackstreet.levelbuilder.config.SavedLevelData;
import hackstreet.levelbuilder.main.SWLevelBuilder;

/**
 * Primary GUI class which extends JFrame and displays screens.
 * @author Nicholas, Ben
 */
@SuppressWarnings("serial")
public class LevelBuilderApplication extends JFrame{

	/** Game model. */
	public SWLevelBuilder model;
	
	/** Main Screen GUI. */
	private LBMainScreen mainScreen;
	
	/** Level manager screen GUI. */
	private LevelManagerScreen levelManagerScreen;
	
	/** Level manager screen GUI. */
	private AbstractLevelEditorScreen levelEditorScreen;
	
	/** Level manager screen GUI. */
	private AbstractScreen activeScreen;

	private Integer SelectedLevelIndex;
	
	/**The main campaign for the game**/
	public ArrayList<SavedLevelData> levelData;
	
	/** LevelManager buttons, easier to manage in here **/
	public ArrayList<JButton> levelButtons;
	
	/**
	 * 
	 * @param model
	 */
	public LevelBuilderApplication(SWLevelBuilder model){
		
		//Parent corresponds to getting out of the SixesWildLevelBuilder
		File Parent = new File(System.getProperty("user.dir")).getParentFile();
		//After we have the parent path, point to the manifest.json
		File manifestFile = new File(Parent.toPath() + "/SixesWild/data/manifest.json");
		
		Gson gson = new Gson();
		
		String filebuffer = "";
		
		if ( manifestFile.exists() == true ){


			try (InputStream in = Files.newInputStream(manifestFile.toPath());
					BufferedReader reader =
							new BufferedReader(new InputStreamReader(in))) {
				String line = null;
				while ((line = reader.readLine()) != null) {
					filebuffer += line;
				}
				reader.close();
				in.close();
			} catch (IOException x) {
				System.err.println(x);
			}


			//Allow Gson to load an arraylist
			java.lang.reflect.Type cType = new TypeToken<ArrayList<SavedLevelData>>() {}.getType();



			levelData= gson.fromJson(filebuffer, cType);
			if (levelData != null)
			{
			for (int i = 0; i < levelData.size();i++)
			{
				levelData.get(i).getLevelConfig();
				//Make sure all levelData level configs are loaded.
			}
			}
		}
			//
		
		levelButtons = new ArrayList<JButton>();
		this.model = model;
		this.mainScreen = new LBMainScreen(this);
		this.levelManagerScreen = new LevelManagerScreen(this);
		this.levelEditorScreen = new PuzzleLevelEditorScreen(this);
		this.activeScreen = mainScreen;
		
		this.getContentPane().add(activeScreen);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/**
	 * Display the Main Screen.
	 */
	public void enterMainScreen(){
		enterScreen(this.mainScreen);
	}

	/**
	 * Display the Level Manager Screen.
	 */
	public void enterLevelManagerScreen(){
		enterScreen(this.levelManagerScreen);
	}
	
	/**
	 * Display the Level Editor Screen.
	 */
	public void enterLevelEditorScreen(){
		enterScreen(this.levelEditorScreen);
	}
	
	/**
	 * Private helper that displays an AbstractScreen
	 * and repaints the application.
	 */
	private void enterScreen(AbstractScreen newScreen){
		super.remove(this.activeScreen);
		this.activeScreen = newScreen;
		super.add(this.activeScreen);
		super.revalidate();
		this.repaint();
	}

	/**
	 * Takes in a String from the LevelEditor's JComboBox,
	 * and uses it to change the kind of AbstractLevelConfig being used.
	 * @param selectedItem
	 */
	public void changeLevelConfigType(String selectedItem) {
		// TODO Auto-generated method stub
		
	}

	public void setNumShuffle(int numShuffle) {
		this.model.getLevelConfig().setNumShuffle(numShuffle);
	}
	
	public void setNumSwap(int numSwap) {
		this.model.getLevelConfig().setNumShuffle(numSwap);
	}
	
	public void setNumRemove(int numRemove) {
		this.model.getLevelConfig().setNumRemove(numRemove);
	}
		
	public void setNumHint(int numHint) {
		this.model.getLevelConfig().setNumRemove(numHint);
	}
	
	public SWLevelBuilder getModel() {
		return model;
	}
	
	public AbstractScreen getActiveScreen(){
		return this.activeScreen;
	}

	public Integer getSelectedLevel() {
		// TODO Auto-generated method stub
		return SelectedLevelIndex;
	}

	public void setSelectedLevel(Integer i) {
		SelectedLevelIndex = i;
		// TODO Auto-generated method stub
		
	}

	public void saveLevelData() {
	
		//Write to manifest file.
		String json;
		Gson gson = new GsonBuilder().registerTypeAdapter(SavedLevelData.class, new ManifestSerializer()).setPrettyPrinting().create();//.registerTypeAdapter(ArrayList.class, new ManifestSerializer()).setPrettyPrinting().create();
		
		for (int i = 0 ; i < levelData.size() -1; i++)
		{
			levelData.get(i).file = new File("/data/"+levelData.get(i).file.getName());
		}
	
		//Parent corresponds to getting out of the SixesWildLevelBuilder
		File Parent = new File(System.getProperty("user.dir")).getParentFile();
		//After we have the parent path, point to the manifest.json
		File manifestFile = new File(Parent.toPath() + "/SixesWild/data/manifest.json");
	
		try	{

				//Standard write to file
				FileWriter fw = new FileWriter(manifestFile.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(	gson.toJson(levelData));
				bw.close();
				//close stream.
	 
				System.out.println("Succesfully Wrote to file.");
	 
			} 
			catch (IOException e){
				e.printStackTrace();
			}
		
	}
	
	
}
