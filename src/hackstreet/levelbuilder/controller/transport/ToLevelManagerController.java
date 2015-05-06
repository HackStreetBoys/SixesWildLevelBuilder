package hackstreet.levelbuilder.controller.transport;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for switching to level manager screen.
 * 
 * @author Pat
 *
 */
public class ToLevelManagerController implements ActionListener{
	LevelBuilderApplication application;
	
	public ToLevelManagerController (LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		application.enterLevelManagerScreen();
	}
	
}
