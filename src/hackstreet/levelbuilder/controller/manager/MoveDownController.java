package hackstreet.levelbuilder.controller.manager;

import hackstreet.levelbuilder.config.SavedLevelData;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Controller for moving level down in level manager screen.
 * 
 * @author Ben
 */
public class MoveDownController implements ActionListener{
	


	LevelBuilderApplication application;
	
	public MoveDownController(LevelBuilderApplication app)
	{
		application = app;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (application.getSelectedLevel() == null)
		{
			System.err.println("No Selected Level");
			return;
		}
		if (application.getSelectedLevel() == 19)
		{
			System.err.println("Cannot demote to greater than 20");
			return;
		}
		
		if (application.levelButtons.size() < application.getSelectedLevel()+1)
		{
			System.err.println("Cannot move null data");
			return;
		}
		
		SavedLevelData sldtemp = application.levelData.get(application.getSelectedLevel()+1);
		application.levelData.set(application.getSelectedLevel()+1,application.levelData.get(application.getSelectedLevel()));
		application.levelData.set(application.getSelectedLevel(),sldtemp);
		
		String temp  = 	application.levelButtons.get(application.getSelectedLevel()+1).getText();		
		application.levelButtons.get(application.getSelectedLevel()+1).setText(application.levelButtons.get(application.getSelectedLevel()).getText());
		application.levelButtons.get(application.getSelectedLevel()).setText(temp);
		application.setSelectedLevel(application.getSelectedLevel()+1);
		
	
		application.repaint();
		application.saveLevelData();
		
	}
	

}
