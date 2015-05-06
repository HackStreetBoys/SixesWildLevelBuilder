package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Controller for selecting a option button in level management.
 * 
 * @author Ben
 *
 */
public class SelectManageLevelController implements ActionListener {



	Integer id;
	LevelBuilderApplication application;
	
	public SelectManageLevelController(Integer id, LevelBuilderApplication app)
	{
		this.id = id;
		application = app;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
			application.setSelectedLevel(id);
		
	}
	

}
