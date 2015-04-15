package hackstreet.levelbuilder.gui;
import javax.swing.JFrame;

import hackstreet.levelbuilder.main.SWLevelBuilder;

/**
 * 
 * @author Nicholas
 *
 */
@SuppressWarnings("serial")
public class LevelBuilderApplication extends JFrame{

	/** Game model. */
	SWLevelBuilder model;
	
	/** Main Screen GUI. */
	public LBMainScreen mainScreen;
	
	/** Level manager screen GUI. */
	public LevelManagerScreen levelManagerScreen;
	
	/** Level manager screen GUI. */
	public LevelEditorScreen levelEditorScreen;
	
	/** Level manager screen GUI. */
	public AbstractScreen activeScreen;
	
	/**
	 * 
	 * @param model
	 */
	public LevelBuilderApplication(SWLevelBuilder model){
		this.model = model;
		this.mainScreen = new LBMainScreen(this);
		this.levelManagerScreen = new LevelManagerScreen(this);
		this.levelEditorScreen = new LevelEditorScreen(this);
		this.activeScreen = mainScreen;
		this.getContentPane().add(activeScreen);
	}
	
	/**
	 * 
	 */
	public void enterMainScreen(){
		this.activeScreen = this.mainScreen;
	}

	/**
	 * 
	 */
	public void enterLevelManagerScreen(){
		this.activeScreen = this.levelManagerScreen;
	}
	
	/**
	 * 
	 */
	public void enterLevelEditorScreen(){
		this.activeScreen = this.levelEditorScreen;
	}
	
}
