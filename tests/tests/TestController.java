package tests;

import static org.junit.Assert.*;
import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.SplashScreen;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;

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
		application.enterLevelManagerScreen();
		application.enterMainScreen();
		application.enterLevelEditorScreen();
		application.enterMainScreen();
		}
		catch (Exception e){
			assertTrue(false);
		}
		assertTrue(true);
	}
	
	@Test
	public void testChangeNumMoves(){
		SWLevelBuilder model = new SWLevelBuilder();
		LevelBuilderApplication application = new LevelBuilderApplication(model);
		application.setVisible(true);
		application.enterLevelEditorScreen();
		
	}

}
