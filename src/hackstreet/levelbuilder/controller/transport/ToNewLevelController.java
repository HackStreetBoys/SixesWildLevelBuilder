package hackstreet.levelbuilder.controller.transport;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for switching to new level editor screen.
 * 
 * @author Pat
 *
 */
public class ToNewLevelController implements ActionListener {
	LevelBuilderApplication application;
	
	public ToNewLevelController(LevelBuilderApplication application){
		this.application = application;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		application.model.setupDefaultLevel();
		application.enterLevelEditorScreen();
	}
	
}
