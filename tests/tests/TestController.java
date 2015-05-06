package tests;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.SplashScreen;
import hackstreet.levelbuilder.controller.ChangeNumMovesController;
import hackstreet.levelbuilder.controller.SwapTilesCheckController;
import hackstreet.levelbuilder.controller.transport.ToEditLevelController;
import hackstreet.levelbuilder.controller.transport.ToLevelManagerController;
import hackstreet.levelbuilder.controller.transport.ToMainScreenController;
import hackstreet.levelbuilder.controller.transport.ToNewLevelController;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.editor.AbstractLevelEditorScreen;
import hackstreet.levelbuilder.move.SwapTilesCheckMove;

import org.junit.Test;


public class TestController {

	@Test
	public void testTransport() {

		try{
			SplashScreen splash = new SplashScreen(200, "images/LevelBuilderSplashScreen.png");
			splash.showSplash();
		}
		catch(Exception e){
			assertTrue(false);
		}
		
		SWLevelBuilder model = new SWLevelBuilder();
		LevelBuilderApplication application = new LevelBuilderApplication(model);
		application.setVisible(true);
		
		try{
			ToLevelManagerController toLevelManagerController = new ToLevelManagerController(application);
			toLevelManagerController.actionPerformed(null);	
			ToMainScreenController ToMainScreenController = new ToMainScreenController(application);
			ToMainScreenController.actionPerformed(null);
			ToNewLevelController ToNewLevelController = new ToNewLevelController(application);
			ToNewLevelController.actionPerformed(null);
			ToEditLevelController toEditLevelController = new ToEditLevelController(application);
			//toEditLevelController.actionPerformed(null);
		}
		catch (Exception e){
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testChangeNumMovesController(){
		SWLevelBuilder model = new SWLevelBuilder();
		LevelBuilderApplication application = new LevelBuilderApplication(model);
		application.setVisible(true);
		application.enterLevelEditorScreen();
		/*
		ChangeNumMovesController changeNumMovesController = new ChangeNumMovesController(application);
		JTextField textField = ((AbstractLevelEditorScreen)application.getActiveScreen()).get();
		changeNumMovesController.keyPressed(null);
		changeNumMovesController.keyReleased(new KeyEvent(textBox, 0, 0, 0, 0));
		*/
	}
	
	@Test
	public void testSwapTilesCheckController(){
		SWLevelBuilder model = new SWLevelBuilder();
		LevelBuilderApplication application = new LevelBuilderApplication(model);
		application.setVisible(true);
		application.enterLevelEditorScreen();
		
		SwapTilesCheckController swapTilesCheckController = new SwapTilesCheckController(application);
		JCheckBox checkBox = ((AbstractLevelEditorScreen)application.getActiveScreen()).getChckbxSwitchTiles();
		swapTilesCheckController.actionPerformed(new ActionEvent(checkBox, 0, null));
		
		assertTrue(model.getUndoStack().peek() instanceof SwapTilesCheckMove);
	}

}
