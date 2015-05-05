package hackstreet.levelbuilder;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

public class SWLevelBuilderRunner {
	
	public static void main(String [] args) {
		
		SplashScreen splash = new SplashScreen(2000, "images/LevelBuilderSplashScreen.png");
		//splash.showSplash();
		
		
		SWLevelBuilder model = new SWLevelBuilder();
		LevelBuilderApplication application = new LevelBuilderApplication(model);
		application.setVisible(true);
		
	}
}