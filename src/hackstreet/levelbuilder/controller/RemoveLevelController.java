package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for removing a level in level management.
 * 
 * @author Tim 
 *
 */
public class RemoveLevelController implements ActionListener {
	
	LevelBuilderApplication application;
	
	public RemoveLevelController(LevelBuilderApplication application) {
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
		
		application.levelData.remove(application.getSelectedLevel());
		application.levelButtons.get(application.getSelectedLevel()).setText("");
		
		System.out.println("Deleting LevelData");
		for (int i = application.getSelectedLevel(); i < application.levelData.size()-1; i++)
		{
			System.out.println(i);
			application.levelButtons.get(i).setText(
					application.levelData.get(i+1).getLevelConfig().getName());
					
			application.levelButtons.get(i+1).setText("");
		}
		application.levelData.remove(application.levelData.size()-1);
		

		application.repaint();
		
		application.saveLevelData();
		
	}

}
