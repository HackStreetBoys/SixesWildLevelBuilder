package tests;

import static org.junit.Assert.*;
import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.controller.manager.AssignLevelController;
import hackstreet.levelbuilder.controller.manager.MoveDownController;
import hackstreet.levelbuilder.controller.manager.MoveUpController;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import org.junit.Test;

public class TestManager {

	@Test
	public void test() {
		SWLevelBuilder model = new SWLevelBuilder();
		LevelBuilderApplication application = new LevelBuilderApplication(model);
		application.setVisible(true);
		application.enterLevelManagerScreen();
		
		AssignLevelController assignLevelController = new AssignLevelController(application);
		assignLevelController.actionPerformed(null);
		
		MoveDownController moveDownController = new MoveDownController(application);
		moveDownController.actionPerformed(null);
		
		MoveUpController moveUpController = new MoveUpController(application);
		moveUpController.actionPerformed(null);
	}

}
