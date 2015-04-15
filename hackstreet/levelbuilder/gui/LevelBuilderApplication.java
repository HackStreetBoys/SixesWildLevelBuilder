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
	LBMainScreen mainScreen;
	
	/** Level manager screen GUI. */
	LevelManagerScreen levelManagerScreen;
	
	/** Level manager screen GUI. */
	LevelEditorScreen levelEditorScreen;
	
	/** Level manager screen GUI. */
	AbstractScreen activeScreen;
	
	/**
	 * 
	 * @param model
	 */
	public LevelBuilderApplication(SWLevelBuilder model){
		this.model = model;
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
