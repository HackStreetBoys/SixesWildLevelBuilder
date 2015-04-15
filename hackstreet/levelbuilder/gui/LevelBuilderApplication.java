package hackstreet.levelbuilder.gui;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

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
	public AbstractLevelEditorScreen levelEditorScreen;
	
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
		this.levelEditorScreen = new PuzzleLevelEditorScreen(this);
		this.activeScreen = mainScreen;
		
		this.getContentPane().add(activeScreen);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/**
	 * 
	 */
	public void enterMainScreen(){
		enterScreen(this.mainScreen);
	}

	/**
	 * 
	 */
	public void enterLevelManagerScreen(){
		enterScreen(this.levelManagerScreen);
	}
	
	/**
	 * 
	 */
	public void enterLevelEditorScreen(){
		enterScreen(this.levelEditorScreen);
	}
	
	/**
	 * 
	 */
	private void enterScreen(AbstractScreen newScreen){
		super.remove(this.activeScreen);
		this.activeScreen = newScreen;
		super.add(this.activeScreen);
		super.revalidate();
		this.repaint();
	}
	
}
