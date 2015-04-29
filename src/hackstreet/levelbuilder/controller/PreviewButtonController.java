package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * On button press, go to Passive Game Screen.
 * @author Nicholas
 */
public class PreviewButtonController implements ActionListener{

	LevelBuilderApplication application;
	
	/**
	 * Constructor
	 * @param application
	 */
	public PreviewButtonController(LevelBuilderApplication application){
		this.application = application;
	}
	
	/**
	 * On button press, go to Passive Game Screen.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		application.enterPassiveGameScreen();
	}

}
