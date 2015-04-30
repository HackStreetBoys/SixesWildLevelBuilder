package hackstreet.levelbuilder.gui;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import hackstreet.levelbuilder.main.SWLevelBuilder;

/**
 * Primary GUI class which extends JFrame and displays screens.
 * @author Nicholas
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
		this.model.getActiveLevel().setNumShuffle(numShuffle);
	}
	
	public void setNumSwap(int numSwap) {
		this.model.getActiveLevel().setNumShuffle(numSwap);
	}
	
	public void setNumRemove(int numRemove) {
		
	}
		
	public void setNumHint(int numHint) {
		this.model.getActiveLevel().setNumRemove(numHint);
	}
	
	public SWLevelBuilder getModel() {
		return model;
	}
	
}
