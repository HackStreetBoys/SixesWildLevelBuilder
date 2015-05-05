package hackstreet.levelbuilder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hackstreet.levelbuilder.config.SavedLevelData;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;

public class MoveUpController implements ActionListener{
	
	LevelBuilderApplication application;
	
	
	public MoveUpController( LevelBuilderApplication application) {
		// TODO Auto-generated constructor stub
		this.application = application;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (application.getSelectedLevel() == null)
		{
			System.err.println("No Selected Level");
			return;
		}
		
		if (application.getSelectedLevel() == 0)
		{
			System.err.println("Cannot promote to less than 0");
			return;
		}
		
		if (application.levelButtons.size() < application.getSelectedLevel())
		{
			System.err.println("Cannot move null data");
			return;
		}
		
		
		SavedLevelData sldtemp = application.levelData.get(application.getSelectedLevel()-1);
		application.levelData.set(application.getSelectedLevel()-1,application.levelData.get(application.getSelectedLevel()));
		application.levelData.set(application.getSelectedLevel(),sldtemp);
		
		String temp  = 	application.levelButtons.get(application.getSelectedLevel()-1).getText();
		application.levelButtons.get(application.getSelectedLevel()-1).setText(application.levelButtons.get(application.getSelectedLevel()).getText());
		application.levelButtons.get(application.getSelectedLevel()).setText(temp);
		application.setSelectedLevel(application.getSelectedLevel()-1);
		application.repaint();
		application.saveLevelData();
	}
	

}
