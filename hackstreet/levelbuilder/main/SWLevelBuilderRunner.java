package hackstreet.levelbuilder.main;

import javax.swing.WindowConstants;

import hackstreet.levelbuilder.gui.LBMainScreen;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.main.*;

public class SWLevelBuilderRunner {
	
	public static void main(String [] args) {
		
		SplashScreen splash = new SplashScreen(2000, "images/LevelBuilderSplashScreen.png");
		splash.showSplash();
		

		SWLevelBuilder model = new SWLevelBuilder();
		LevelBuilderApplication application = new LevelBuilderApplication(model);
		application.setVisible(true);
		
	}
}